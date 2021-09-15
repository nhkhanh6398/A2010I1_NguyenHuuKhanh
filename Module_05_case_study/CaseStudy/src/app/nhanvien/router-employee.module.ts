import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from "@angular/router";
import {CreateEmployeeComponent} from "./create-employee/create-employee.component";
import {NhanvienComponent} from "./nhanvien.component";
import { DeleteEmployeeComponent } from './delete-employee/delete-employee.component';
import { DetailEmployeeComponent } from './detail-employee/detail-employee.component';
import {EditEmployeeComponent} from "./edit-employee/edit-employee.component";
import {NgxPaginationModule} from "ngx-pagination";
import {HttpClientModule} from "@angular/common/http";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {MatButtonModule} from "@angular/material/button";
import {MatDialogModule} from "@angular/material/dialog";


const routes: Routes = [
  {path: 'listEmployee', component: NhanvienComponent},
  {path: 'createEmployee', component: CreateEmployeeComponent},
  {path: 'editEmployee/:id', component: EditEmployeeComponent},
  {path: 'deleteEmployee/:id', component: DeleteEmployeeComponent},
  {path: 'detailEmployee/:id', component: DetailEmployeeComponent},
];

@NgModule({
  declarations: [
  ],
  imports: [
    CommonModule,
    HttpClientModule,
    RouterModule.forChild(routes),
    NgxPaginationModule,
    FormsModule,
    ReactiveFormsModule,
    MatButtonModule,
    MatDialogModule
  ]
})

export class RouterEmployeeModule { }
