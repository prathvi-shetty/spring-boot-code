import { Component } from '@angular/core';

@Component({
  selector: 'my-app',
  templateUrl: './app.component.html',
  styleUrls: [ './app.component.css' ]
})
export class AppComponent  {
  name = 'Angular';
  myColor = 'blue';
  myUrl ="https://docs.sonarqube.org/latest/analysis/coverage/";
  shouldDisplay = false;


  show()
  {this.shouldDisplay = !this.shouldDisplay;

  }
  myList = ["hjbkj","hujkihj"]

  

  
 objects = [
    {name : "tricon",
    link : "https://www.triconinfotech.com/"
  },
  {
    name : "youtube",
    link : "https://www.youtube.com/"
  },
  {
name : "isro",
    link : "https://www.isro.gov.in/"
  }]
  
}
