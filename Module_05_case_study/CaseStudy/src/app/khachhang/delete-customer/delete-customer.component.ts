import {Component, OnInit} from '@angular/core';
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

  customerInfor!: Customer;
  id!: string;

  constructor(private activatedRoute: ActivatedRoute, private customerService: CustomerService, private router: Router) {
  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      let param = paramMap.get('id');
      if (param != null) {
        this.id = param;
        // console.log(paramMap.get('id'));
        this.customerService.getCustomerById(this.id).subscribe((data) => {
          this.customerInfor = data;
        });
      }

    });
  }

  deleteCustomer(id: string) {
    this.customerService.deleteCustomerById(id).subscribe(() => {
      this.router.navigate(['listCustomer'])
    })

  }
}

