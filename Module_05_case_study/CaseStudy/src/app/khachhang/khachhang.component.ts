import { Component, OnInit } from '@angular/core';
import {Customer} from "./customer";
import {arrayKhachHang} from "./array-KhachHang";
import {CustomerService} from "./customer.service";


// @ts-ignore
@Component({
  selector: 'app-khachhang',
  templateUrl: './khachhang.component.html',
  styleUrls: ['./khachhang.component.css']
})

export class KhachhangComponent implements OnInit {
  listCustomer: Customer[] = [];
  p: number = 1;
  constructor(private customerService: CustomerService) { }

  ngOnInit(): void {
    this.listCustomer = this.customerService.getAllCustomer();
  }
}
