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
      this.employeeService.getEmployeeById(this.id).subscribe((data)=>{
        this.employeeInfor = data;
      });
    });
  }
  deleteEmployee(id: string) {
    this.employeeService.deleteEmployeById(id).subscribe(()=>{
      this.router.navigate(['listEmployee']);
      })
  }
}
