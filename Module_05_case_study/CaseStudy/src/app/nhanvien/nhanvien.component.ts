import { Component, OnInit } from '@angular/core';
import {Employee} from "./Employee";
import {arrayEmployee} from "./array-Employee";
import {EmployeeService} from "./employee.service";

@Component({
  selector: 'app-nhanvien',
  templateUrl: './nhanvien.component.html',
  styleUrls: ['./nhanvien.component.css']
})
export class NhanvienComponent implements OnInit {
  listEmployee: Employee[] = [];
  p: number = 1;
  term: any;
  constructor(private employeeService: EmployeeService) { }

  ngOnInit(): void {
     this.employeeService.getAllEmployee().subscribe(
       (data)=>{
         this.listEmployee = data;
       },
       ()=>{
         console.log("Error");
       },
       ()=>{
         console.log("Complete");
       }
     );
  }

}
