import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-color',
  templateUrl: './color.component.html',
  styleUrls: ['./color.component.css']
})
export class ColorComponent implements OnInit {

  background = '#00e067';
  constructor() { }

  ngOnInit() {
  }
  onChange(value: string) {
    this.background = value;
  }
}
