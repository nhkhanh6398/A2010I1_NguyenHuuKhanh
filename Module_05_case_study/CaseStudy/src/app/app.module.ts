import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { KhachhangComponent } from './khachhang/khachhang.component';
import { NhanvienComponent } from './nhanvien/nhanvien.component';
import { DichvuComponent } from './dichvu/dichvu.component';
import { HopdongComponent } from './hopdong/hopdong.component';
import { NavbarComponent } from './navbar/navbar.component';
import { CreateEmployeeComponent } from './nhanvien/create-employee/create-employee.component';
import {EmployeeModuleModule} from "./nhanvien/employee-module.module";
import {CustomerModule} from "./khachhang/customer.module";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {CreateCustomerComponent} from "./khachhang/create-customer/create-customer.component";
import {EditEmployeeComponent} from "./nhanvien/edit-employee/edit-employee.component";
import {DeleteCustomerComponent} from "./khachhang/delete-customer/delete-customer.component";
import {EditCustomerComponent} from "./khachhang/edit-customer/edit-customer.component";
import {NgxPaginationModule} from "ngx-pagination";
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import {DetailCustomerComponent} from "./khachhang/detail-customer/detail-customer.component";






@NgModule({
  declarations: [
    AppComponent,
    KhachhangComponent,
    NhanvienComponent,
    DichvuComponent,
    HopdongComponent,
    NavbarComponent,
    CreateEmployeeComponent,
    CreateCustomerComponent,
    EditEmployeeComponent,
    DeleteCustomerComponent,
    EditCustomerComponent,
    DetailCustomerComponent,
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        EmployeeModuleModule,
        CustomerModule,
        FormsModule,
        ReactiveFormsModule,
        NgxPaginationModule,
        Ng2SearchPipeModule,

    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
