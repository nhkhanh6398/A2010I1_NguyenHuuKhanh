import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, ParamMap} from "@angular/router";
import {Employee} from "../Employee";
import {arrayEmployee} from "../array-Employee";
import {EmployeeService} from "../employee.service";
import {Position} from "@angular/compiler";
import {PositionService} from "../service-type-employee/position.service";
import {EducationService} from "../service-type-employee/education.service";
import {DivisionService} from "../service-type-employee/division.service";
import {Division} from "../service-type-employee/Division";
import {Education} from "../service-type-employee/Education";
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-detail-employee',
  templateUrl: './detail-employee.component.html',
  styleUrls: ['./detail-employee.component.css']
})
export class DetailEmployeeComponent implements OnInit {
  // @ts-ignore
  employeeInfor:  Employee;
  // @ts-ignore
  positionList: any;
  // @ts-ignore
  divisonList: any;
  // @ts-ignore
  educationList: any;
  id!: string | null;
  // @ts-ignore
  viewEmployeeForm: FormGroup;

  constructor(private activatedRoute: ActivatedRoute,private employeeService: EmployeeService,
              private positionService:PositionService,private educationService:EducationService,private divisionService:DivisionService) { }

  ngOnInit(): void {
    this.viewEmployeeForm = new FormGroup({
      id: new FormControl(''),
      name: new FormControl(''),
      birthday: new FormControl(''),
      idCard: new FormControl(''),
      salary: new FormControl(''),
      phone: new FormControl(''),
      email: new FormControl(''),
      address: new FormControl(''),
      position: new FormControl(''),
      division: new FormControl(''),
      education: new FormControl('')
    });
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = paramMap.get('id');
      console.log(paramMap.get('id'));
      // @ts-ignore
      this.employeeService.getEmployeeById(this.id).subscribe(
        (data)=>{
          console.log(data);
          this.employeeInfor = data;
          this.viewEmployeeForm.patchValue(data);
        }
      );

    });
    this.positionService.getAllPosition().subscribe(
      (data)=>{
        // @ts-ignore
        this.positionList=data;
      }
    );
    this.divisionService.getAllDivision().subscribe((data)=>{
      // @ts-ignore
      this.divisonList =data;
    });
    this.educationService.getAllEducation().subscribe((data)=>{
      // @ts-ignore
      this.educationList=data
    })
  }
  compareFn(c1: Employee, c2: Employee): boolean {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }

}
