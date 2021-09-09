import { Injectable } from '@angular/core';
import {Customer} from "./customer";
import {arrayKhachHang} from "./array-KhachHang";
import {Employee} from "../nhanvien/Employee";
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  customers: Customer[] = arrayKhachHang;
  readonly URL_API = "http://localhost:3000/customer";
  constructor(private httpClient: HttpClient) { }
  getAllCustomer(): Observable<Customer[]>{
    return this.httpClient.get<Customer[]>(this.URL_API);
  }
  getCustomerById(id: string): Observable<Customer>{
    return this.httpClient.get<Customer>(this.URL_API + '/' +id);
  }
  setCustomer(customer: Customer): Observable<Customer>{
    return this.httpClient.post<Customer>(this.URL_API, customer);
  }
  updateCustomer(customer: Customer, id:string):Observable<Customer>{
    return this.httpClient.put<Customer>(this.URL_API + '/'+id, customer);
  }
  deleteCustomerById(id: string):Observable<Customer>{
   return this.httpClient.delete<Customer>(this.URL_API +'/'+id);
  }
}
