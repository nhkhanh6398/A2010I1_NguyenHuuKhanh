import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, NgForm, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {EmployeeService} from "../employee.service";

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent implements OnInit {
  createEmployee!: FormGroup;

  constructor(private router: Router, private employeeService : EmployeeService) {
  }

  ngOnInit(): void {
    this.createEmployee = new FormGroup({
      id: new FormControl('', [Validators.required,Validators.pattern("^(NV-)+[0-9]{4}")]),
      name: new FormControl('', [Validators.required]),
      birthday: new FormControl('', [Validators.required]),
      idCard: new FormControl('', [Validators.required]),
      salary: new FormControl('', [Validators.required,Validators.min(0)]),
      phone: new FormControl('', [Validators.required,Validators.pattern("^(090)+[0-9]{7}")]),
      email: new FormControl('', [Validators.required,Validators.email]),
      address: new FormControl('', [Validators.required]),
    })
  }

  create() {
    if (this.createEmployee.valid) {
      this.employeeService.setEmployee(this.createEmployee.value).subscribe(
        ()=>{
          this.router.navigate(['/listEmployee']);
        },
        ()=>{},
        ()=>{}
      );

    }
  }
}
