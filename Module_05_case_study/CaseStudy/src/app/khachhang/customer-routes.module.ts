import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from "@angular/router";
import {KhachhangComponent} from "./khachhang.component";
import {CreateCustomerComponent} from "./create-customer/create-customer.component";
import {DetailCustomerComponent} from './detail-customer/detail-customer.component';
import {DeleteEmployeeComponent} from "../nhanvien/delete-employee/delete-employee.component";
import {EditCustomerComponent} from './edit-customer/edit-customer.component';
import {DeleteCustomerComponent} from "./delete-customer/delete-customer.component";

const routesCustomer: Routes = [
  {path: 'listCustomer', component: KhachhangComponent},
  {path: 'createCustomer', component: CreateCustomerComponent},
  {path: 'detailCustomer/:id', component: DetailCustomerComponent},
  {path: 'deleteCustomer/:id', component: DeleteCustomerComponent},
  {path: 'editCustomer/:id', component: EditCustomerComponent},
];

@NgModule({
  declarations: [
    DetailCustomerComponent,

  ],
  imports: [
    CommonModule,
    RouterModule.forRoot(routesCustomer)
  ]
})
export class CustomerRoutesModule { }
