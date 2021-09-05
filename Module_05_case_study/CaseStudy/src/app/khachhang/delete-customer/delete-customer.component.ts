import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {Employee} from "../../nhanvien/Employee";
import {EmployeeService} from "../../nhanvien/employee.service";
import {Customer} from "../customer";
import {CustomerService} from "../customer.service";

@Component({
  selector: 'app-delete-customer',
  templateUrl: './delete-customer.component.html',
  styleUrls: ['./delete-customer.component.css']
})
export class DeleteCustomerComponent implements OnInit {

  // @ts-ignore
  customerInfor:  Customer;
  id!: string | null;
  constructor( private activatedRoute: ActivatedRoute, private customerService: CustomerService,private router: Router) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = paramMap.get('id');
      console.log(paramMap.get('id'));
      // @ts-ignore
      this.customerInfor = this.customerService.getCustomerById(this.id);
    });
  }

  deleteCustomer(id: string) {
    let customer = this.customerService.getCustomerById(id);
    if (customer != undefined){
      this.customerService.deleteCustomerById(id);
      this.router.navigate(['listCustomer'])
    }
  }
}
