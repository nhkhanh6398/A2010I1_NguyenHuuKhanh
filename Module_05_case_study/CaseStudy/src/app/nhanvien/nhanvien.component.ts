import { Component, OnInit } from '@angular/core';
import {Employee} from "./Employee";
import {arrayEmployee} from "./array-Employee";

@Component({
  selector: 'app-nhanvien',
  templateUrl: './nhanvien.component.html',
  styleUrls: ['./nhanvien.component.css']
})
export class NhanvienComponent implements OnInit {
  listEmployee: Employee[] = arrayEmployee;
  constructor() { }

  ngOnInit(): void {
  }

}
