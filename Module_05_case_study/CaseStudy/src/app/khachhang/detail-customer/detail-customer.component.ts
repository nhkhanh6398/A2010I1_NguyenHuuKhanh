import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {CustomerService} from "../customer.service";
import {Customer} from "../customer";

@Component({
  selector: 'app-detail-customer',
  templateUrl: './detail-customer.component.html',
  styleUrls: ['./detail-customer.component.css']
})
export class DetailCustomerComponent implements OnInit {
  // @ts-ignore
  customerInfor: Customer;
  id!: string | null;
  constructor(private activatedRoute: ActivatedRoute,private customerService: CustomerService) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((pramMap)=>{
      this.id = pramMap.get('id');
      // @ts-ignore
      console.log(this.id);
      // @ts-ignore
      this.customerService.getCustomerById(this.id).subscribe(
        (data)=>{
        this.customerInfor = data;
      })
    });
  }

}
