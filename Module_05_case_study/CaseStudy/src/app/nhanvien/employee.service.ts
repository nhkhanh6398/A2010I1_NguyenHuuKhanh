import { Injectable } from '@angular/core';
import {Employee} from "./Employee";
import {arrayEmployee} from "./array-Employee";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  employees: Employee[] = arrayEmployee;
  constructor() { }
  getAllEmployee(){
    return this.employees;
  }

  getEmployeeById(id: string | null){
    return this.employees.find(employee => employee.idEmployee === id);
  }
  setEmployee(employee : Employee){
    this.employees.push(employee);
  }
}
