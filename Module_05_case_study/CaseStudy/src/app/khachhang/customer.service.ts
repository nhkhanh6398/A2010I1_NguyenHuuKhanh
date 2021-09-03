import { Injectable } from '@angular/core';
import {Customer} from "./customer";
import {arrayKhachHang} from "./array-KhachHang";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  customers: Customer[] = arrayKhachHang;

  constructor() { }
  getAllCustomer(){
    return this.customers;
  }
  getCustomerById(id: string){
    return this.customers.find(customer => customer.idCustomer ===id);
  }
  setCustomer(customer: Customer){
    return this.customers.push(customer);
  }
}
