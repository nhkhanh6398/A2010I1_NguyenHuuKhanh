import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, NgForm, Validators} from "@angular/forms";
import {arrayEmployee} from "../array-Employee";

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent implements OnInit {
  createEmployee!: FormGroup;

  constructor() {
  }

  ngOnInit(): void {
    this.createEmployee = new FormGroup({
      idEmployee: new FormControl('', [Validators.required]),
      name: new FormControl('', [Validators.required]),
      birthday: new FormControl('', [Validators.required]),
      idCard: new FormControl('', [Validators.required]),
      salary: new FormControl('', [Validators.required]),
      phone: new FormControl('', [Validators.required]),
      email: new FormControl('', [Validators.required]),
      address: new FormControl('', [Validators.required]),
    })
  }

  create() {
    if (this.createEmployee.valid) {
      arrayEmployee.push(this.createEmployee.value);
      console.log(this.createEmployee.value)
    }
  }
}
