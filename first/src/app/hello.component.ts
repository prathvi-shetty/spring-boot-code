import { Component, Input , Output, EventEmitter} from '@angular/core';

@Component({
  selector: 'hello',
  template: `<h1 (click)="sendStringToParent()">Hello {{name}}</h1>`,
  styles: [`h1 { font-family: Lato; }`]
})
export class HelloComponent  {
  @Output() sendMessage : EventEmitter<String> = new EventEmitter<String> ();
  @Input() name: string;
  sendStringToParent(){
    this.sendMessage.emit("message from child");
  }
}
