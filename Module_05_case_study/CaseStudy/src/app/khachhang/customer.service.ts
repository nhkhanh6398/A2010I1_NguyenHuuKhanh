import { Injectable } from '@angular/core';
import {Customer} from "./customer";
import {arrayKhachHang} from "./array-KhachHang";
import {Employee} from "../nhanvien/Employee";

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
    return this.customers.find(customer => customer.idCustomer === id);
  }
  setCustomer(customer: Customer){
    return this.customers.push(customer);
  }
  updateCustomer(customer: Customer){
    this.customers.find(element =>{
      if (element.idCustomer == customer.idCustomer){
        element.name = customer.name;
        element.birthday = customer.birthday;
        element.email = customer.email;
        element.phone = customer.phone;
        element.address = customer.address;
        element.idCard = customer.idCard;
      }
    })
  }
  deleteCustomerById(id: string){
    let customers = this.getCustomerById(id);
    if (customers!= undefined){
      this.customers.splice(this.customers.indexOf(customers),1);
    }
  }
}
