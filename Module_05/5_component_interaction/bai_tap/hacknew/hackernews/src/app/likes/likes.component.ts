import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-likes',
  templateUrl: './likes.component.html',
  styleUrls: ['./likes.component.css']
})
export class LikesComponent implements OnInit {

  @Input()
  likes: number=0;


  @Output()
  changeLike = new EventEmitter<number>()
  likeThis(): any {
    // @ts-ignore
    this.changeLike.emit(this.likes++);
  }
  constructor() { }

  ngOnInit(): void {
  }

}
