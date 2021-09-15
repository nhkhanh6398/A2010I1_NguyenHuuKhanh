import {Component, Inject, OnInit} from '@angular/core';
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {EmployeeService} from "../employee.service";
import {Employee} from "../Employee";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-delete-employee',
  templateUrl: './delete-employee.component.html',
  styleUrls: ['./delete-employee.component.css']
})
export class DeleteEmployeeComponent implements OnInit {
  // @ts-ignore
  employeeInfor: Employee;
  id!: string;


  constructor(private activatedRoute: ActivatedRoute, private employeeService: EmployeeService, private router: Router,
              private dialog: MatDialogRef<DeleteEmployeeComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any) {
  }

  ngOnInit(): void {
    this.id = this.data.id;
  }

  deleteEmployee() {
    this.employeeService.deleteEmployeById(this.id).subscribe(() => {
      this.dialog.close()
    })
  }
  close(){
    this.dialog.close();
  }
}
