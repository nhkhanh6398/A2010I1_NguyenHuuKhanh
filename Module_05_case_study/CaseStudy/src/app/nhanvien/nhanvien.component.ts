import {Component, Inject, OnInit} from '@angular/core';
import {Employee} from "./Employee";
import {arrayEmployee} from "./array-Employee";
import {EmployeeService} from "./employee.service";
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from "@angular/material/dialog";
import {DeleteEmployeeComponent} from "./delete-employee/delete-employee.component";

@Component({
  selector: 'app-nhanvien',
  templateUrl: './nhanvien.component.html',
  styleUrls: ['./nhanvien.component.css']
})
export class NhanvienComponent implements OnInit {
  listEmployee: Employee[] = [];
  p: number = 1;

  searchName: any;
  constructor(private employeeService: EmployeeService,
              private dialog: MatDialog) { }

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

  search() {
    this.employeeService.search(this.searchName).subscribe((data)=>{
      // @ts-ignore
      this.listEmployee = data;
    })
  }

  openDialog(id: string) {
    this.employeeService.getEmployeeById(id).subscribe((data)=>{
      const  dialog = this.dialog.open(DeleteEmployeeComponent
        , {
        width: '500px',
        data: data,
        disableClose: true,
          autoFocus: false
      }
      );
      dialog.afterClosed().subscribe(result => {
        this.ngOnInit();
      });
    })
  }
}


