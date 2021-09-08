import { Injectable } from '@angular/core';
import {Employee} from "./Employee";
import {arrayEmployee} from "./array-Employee";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  employees: Employee[] = arrayEmployee;
  readonly URL_API = "http://localhost:3000/employee";
  constructor(private httpClient: HttpClient) { }
  getAllEmployee(): Observable<Employee[]>{
    return this.httpClient.get<Employee[]>(this.URL_API);
  }

  getEmployeeById(id: string): Observable<Employee>{
    return this.httpClient.get<Employee>(this.URL_API + '/' + id);
  }
  setEmployee(employee : Employee): Observable<Employee>{
     return this.httpClient.post<Employee>(this.URL_API, employee);

  }
  updateEmployee(id:string ,employee: Employee):Observable<Employee>{
    return this.httpClient.put<Employee>(this.URL_API + '/' + id, employee);
  }
  deleteEmployeById(id: string):Observable<Employee>{
      return  this.httpClient.delete<Employee>(this.URL_API + '/' + id);
    }
}
