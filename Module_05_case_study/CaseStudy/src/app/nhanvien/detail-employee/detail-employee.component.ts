import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, ParamMap} from "@angular/router";
import {Employee} from "../Employee";
import {arrayEmployee} from "../array-Employee";
import {EmployeeService} from "../employee.service";

@Component({
  selector: 'app-detail-employee',
  templateUrl: './detail-employee.component.html',
  styleUrls: ['./detail-employee.component.css']
})
export class DetailEmployeeComponent implements OnInit {
  // @ts-ignore
  employeeInfor:  Employee;
   id!: string | null;

  constructor(private activatedRoute: ActivatedRoute,private employeeService: EmployeeService) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = paramMap.get('id');
      console.log(paramMap.get('id'));
      // @ts-ignore
      this.employeeInfor = this.employeeService.getEmployeeById(this.id);
    });
  }

}
