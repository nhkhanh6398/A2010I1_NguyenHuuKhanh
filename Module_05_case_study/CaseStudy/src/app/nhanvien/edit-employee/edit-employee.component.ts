import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {EmployeeService} from "../employee.service";
import {Employee} from "../Employee";
import {FormControl, FormGroup, Validators} from "@angular/forms";


@Component({
  selector: 'app-edit-employee',
  templateUrl: './edit-employee.component.html',
  styleUrls: ['./edit-employee.component.css']
})
export class EditEmployeeComponent implements OnInit {
  editEmployee!: FormGroup;
  // @ts-ignore
  employeeInfor:  Employee;
  id!: string | null;

  constructor(private router: Router, private activatedRoute: ActivatedRoute,private employeeService : EmployeeService) {
  }

  ngOnInit(): void {

    this.editEmployee = new FormGroup({
      idEmployee: new FormControl('', [Validators.required,Validators.pattern("^(NV-)+[0-9]{4}")]),
      name: new FormControl('', [Validators.required]),
      birthday: new FormControl('', [Validators.required]),
      idCard: new FormControl('', [Validators.required]),
      salary: new FormControl('', [Validators.required,Validators.min(0)]),
      phone: new FormControl('', [Validators.required,Validators.pattern("^(090)+[0-9]{7}")]),
      email: new FormControl('', [Validators.required,Validators.email]),
      address: new FormControl('', [Validators.required]),
    });
    this.activatedRoute.paramMap.subscribe((paramat)=>{
      this.id = paramat.get('id');
      // @ts-ignore
      this.employeeInfor = this.employeeService.getEmployeeById(this.id);
      this.editEmployee.patchValue(this.employeeInfor);
    })
  }
  submitEdit() {
    console.log(":v")
    if (this.editEmployee.valid) {
      this.employeeService.updateEmployee(this.editEmployee.value);
      this.router.navigate(['/listEmployee']);
    }
  }
}
