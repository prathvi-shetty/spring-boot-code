import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import {HelloComponent} from './hello.component' // import components


@NgModule({
  imports:      [ BrowserModule, FormsModule ],
  declarations: [ AppComponent , HelloComponent], // Add the components created
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
