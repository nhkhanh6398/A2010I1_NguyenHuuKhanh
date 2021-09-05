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
  updateEmployee(employee: Employee){
    this.employees.find(element =>{
      if (element.idEmployee == employee.idEmployee){
        element.name = employee.name;
        element.birthday = employee.birthday;
        element.email = employee.email;
        element.salary = employee.salary;
        element.phone = employee.phone;
        element.address = employee.address;
        element.idCard = employee.idCard;
      }
    })
  }
  deleteEmployeById(id: string){
    let employee = this.getEmployeeById(id);
    if (employee!= undefined){
      this.employees.splice(this.employees.indexOf(employee),1);
    }
  }
}
