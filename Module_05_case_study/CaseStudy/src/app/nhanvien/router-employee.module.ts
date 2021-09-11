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
import {FormsModule} from "@angular/forms";


const routes: Routes = [
  {path: 'listEmployee', component: NhanvienComponent},
  {path: 'createEmployee', component: CreateEmployeeComponent},
  {path: 'editEmployee/:id', component: EditEmployeeComponent},
  {path: 'deleteEmployee/:id', component: DeleteEmployeeComponent},
  {path: 'detailEmployee/:id', component: DetailEmployeeComponent},
];

@NgModule({
  declarations: [
    DeleteEmployeeComponent,
    DetailEmployeeComponent
  ],
    imports: [
        CommonModule,
        HttpClientModule,
        RouterModule.forRoot(routes),
        NgxPaginationModule,
        FormsModule
    ]
})

export class RouterEmployeeModule { }
