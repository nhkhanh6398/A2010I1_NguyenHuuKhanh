import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {CustomerService} from "../customer.service";
import {Customer} from "../customer";

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.css']
})
export class EditCustomerComponent implements OnInit {
  // @ts-ignore
  customerInfor : Customer;
  editCustomer! : FormGroup;
  private id!: string | null;


  constructor(private router: Router,private customerService: CustomerService, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.editCustomer = new FormGroup({
      idCustomer: new FormControl('',[Validators.required,Validators.pattern("^(KH-)+[0-9]{4}")]),
      name: new FormControl('',[Validators.required]),
      birthday: new FormControl('',[Validators.required]),
      idCard: new FormControl('',[Validators.required]),
      phone: new FormControl('',[Validators.required,Validators.pattern("^(090)+[0-9]{7}")]),
      email: new FormControl('',[Validators.required,Validators.email]),
      address: new FormControl('',[Validators.required]),
    })
    this.activatedRoute.paramMap.subscribe((paramap)=>{
      this.id = paramap.get('id');
      // @ts-ignore
      this.customerInfor = this.customerService.getCustomerById(this.id);
      this.editCustomer.patchValue(this.customerInfor);
    })
  }

  onEditCustomer() {

  }
}
