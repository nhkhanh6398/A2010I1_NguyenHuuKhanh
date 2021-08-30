import { Component, OnInit } from '@angular/core';
import {Customer} from "./customer";
import {arrayKhachHang} from "./array-KhachHang";


// @ts-ignore
@Component({
  selector: 'app-khachhang',
  templateUrl: './khachhang.component.html',
  styleUrls: ['./khachhang.component.css']
})

export class KhachhangComponent implements OnInit {
  listCustomer: Customer[] = arrayKhachHang;
  constructor() { }

  ngOnInit(): void {
  }
}
