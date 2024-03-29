import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {arrayKhachHang} from "../array-KhachHang";
import {Router} from "@angular/router";
import {CustomerService} from "../customer.service";

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {
  createCustomer!: FormGroup;

  constructor(private router: Router, private customerService: CustomerService) {
  }

  ngOnInit(): void {
    this.createCustomer = new FormGroup({
      id: new FormControl('', [Validators.required, Validators.pattern("^(KH-)+[0-9]{4}")]),
      nameCustomer: new FormControl('', [Validators.required]),
      birthday: new FormControl('', [Validators.required]),
      idCard: new FormControl('', [Validators.required]),
      phone: new FormControl('', [Validators.required, Validators.pattern("^(090)+[0-9]{7}")]),
      email: new FormControl('', [Validators.required, Validators.email]),
      address: new FormControl('', [Validators.required]),
    })
  }

  onSubmitCustomer() {
    if (this.createCustomer.valid) {
      this.customerService.setCustomer(this.createCustomer.value).subscribe(() => {
        this.router.navigate(['/listCustomer']);
      })

    }
  }
}
