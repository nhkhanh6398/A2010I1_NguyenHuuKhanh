import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'count-down';
  countdownAliasMsg: string | undefined;

  endCountdown() {
    this.countdownAliasMsg = 'Ended!';
  }
}
