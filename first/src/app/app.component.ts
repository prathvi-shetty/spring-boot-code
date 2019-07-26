import { Component } from '@angular/core';

@Component({
  selector: 'my-app',
  templateUrl: './app.component.html',
  styleUrls: [ './app.component.css' ]
})
export class AppComponent  {
  nameInApp = 'Angular';
  receiveMessage(event){
    console.log(event);
    this.nameInApp = event ;
  }
}
