import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {EmployeeService} from "../employee.service";
import {Employee} from "../Employee";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {PositionService} from "../service-type-employee/position.service";
import {EducationService} from "../service-type-employee/education.service";
import {DivisionService} from "../service-type-employee/division.service";


@Component({
  selector: 'app-edit-employee',
  templateUrl: './edit-employee.component.html',
  styleUrls: ['./edit-employee.component.css']
})
export class EditEmployeeComponent implements OnInit {
  editEmployee!: FormGroup;
  // @ts-ignore
  employeeInfor:  Employee;
  positionList : any;
  divisionList: any;
  educationList: any;
  id!: string | null;

  constructor(private router: Router, private activatedRoute: ActivatedRoute,private employeeService : EmployeeService,
              private positionService: PositionService,
              private educationService: EducationService,
              private divisionService: DivisionService) {
  }

  ngOnInit(): void {

    this.editEmployee = new FormGroup({
      id: new FormControl('', [Validators.required,Validators.pattern("^(NV-)+[0-9]{4}")]),
      name: new FormControl('', [Validators.required]),
      birthday: new FormControl('', [Validators.required]),
      idCard: new FormControl('', [Validators.required]),
      salary: new FormControl('', [Validators.required,Validators.min(0)]),
      phone: new FormControl('', [Validators.required,Validators.pattern("^(090)+[0-9]{7}")]),
      email: new FormControl('', [Validators.required,Validators.email]),
      address: new FormControl('', [Validators.required]),
      position: new FormControl('', [Validators.required]),
      education: new FormControl('', [Validators.required]),
      division: new FormControl('', [Validators.required]),
    });
    this.activatedRoute.paramMap.subscribe((paramat)=>{
      this.id = paramat.get('id');
      // @ts-ignore
      this.employeeService.getEmployeeById(this.id).subscribe(
        (data)=>{
        this.employeeInfor = data;
          this.editEmployee.patchValue(this.employeeInfor);
      });

    })
    this.positionService.getAllPosition().subscribe((data)=>{
      this.positionList =data;
    })
    this.educationService.getAllEducation().subscribe((data)=>{
      this.educationList =data;
    })
    this.divisionService.getAllDivision().subscribe((data)=>{
      this.divisionList =data;
    })
  }
  submitEdit() {
    if (this.editEmployee.valid) {
      // @ts-ignore
      this.employeeService.updateEmployee(this.id, this.editEmployee.value).subscribe(
        () => {
          this.router.navigate(['/listEmployee']);
        })
    }
  }
  compareFn(c1: Employee, c2: Employee): boolean {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }
}
