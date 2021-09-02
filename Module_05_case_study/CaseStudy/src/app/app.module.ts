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


@NgModule({
  declarations: [
    AppComponent,
    KhachhangComponent,
    NhanvienComponent,
    DichvuComponent,
    HopdongComponent,
    NavbarComponent,
    CreateEmployeeComponent,
    CreateCustomerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    EmployeeModuleModule,
    CustomerModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
