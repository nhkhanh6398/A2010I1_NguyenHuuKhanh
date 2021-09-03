import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {CustomerRoutesModule} from './customer-routes.module';
import {ReactiveFormsModule} from "@angular/forms";
import {DetailCustomerComponent} from "./detail-customer/detail-customer.component";



@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    CustomerRoutesModule,
  ]
})
export class CustomerModule { }
