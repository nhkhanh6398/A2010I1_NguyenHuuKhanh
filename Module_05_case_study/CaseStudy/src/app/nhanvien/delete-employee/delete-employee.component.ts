import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {EmployeeService} from "../employee.service";
import {Employee} from "../Employee";

@Component({
  selector: 'app-delete-employee',
  templateUrl: './delete-employee.component.html',
  styleUrls: ['./delete-employee.component.css']
})
export class DeleteEmployeeComponent implements OnInit {
  // @ts-ignore
  employeeInfor:  Employee;
  id!: string | null;
  constructor( private activatedRoute: ActivatedRoute, private employeeService: EmployeeService,private router: Router) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = paramMap.get('id');
      console.log(paramMap.get('id'));
      // @ts-ignore
      this.employeeInfor = this.employeeService.getEmployeeById(this.id);
    });
  }

  deleteEmployee(id: string) {
    let employee = this.employeeService.getEmployeeById(id);
    if (employee != undefined){
      this.employeeService.deleteEmployeById(id);
      this.router.navigate(['listEmployee']);
    }
  }
}
