import {Component, Input, OnInit} from '@angular/core';
import {AbstractControl, FormBuilder, FormControl, FormGroup, ValidationErrors, Validators} from "@angular/forms";

import {group} from "@angular/animations";
import {min} from "rxjs/operators";

function comparePassword(c: AbstractControl) {
  const v = c.value;
  return (v.password === v.confirmPassword) ? null : {
    passwordnotmatch: true
  };
}


@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {
  form_dangki!: FormGroup;
  submitted = false;
  @Input()
  pattern!: string | RegExp;

  constructor(private fb: FormBuilder) {
  }

  ngOnInit(): void {
    // @ts-ignore
    this.form_dangki = this.fb.group({
      email: new FormControl('', [Validators.required, Validators.email]),
      password: new FormControl('', [Validators.required, Validators.minLength(6)]),
      pwGroup: this.fb.group({
        confirmPassword: new FormControl('', [Validators.required])
      }, {validators: comparePassword}),
      country: new FormControl('', [Validators.required]),
      age: new FormControl('', [Validators.required, Validators.min(18)]),
      gender: new FormControl('', [Validators.required]),
      phone: new FormControl('', [Validators.required]),

    });
  }

  get f() {
    return this.form_dangki.controls;
  }


  onSubmit() {

  }
}
