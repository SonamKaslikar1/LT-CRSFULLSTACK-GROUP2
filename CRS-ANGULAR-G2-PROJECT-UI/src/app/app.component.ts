import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title: string = 'CRS Application';
  name: string = 'Team';
  today = new Date();
  //define the property and writing the events in angular and after fire the data is changed

  // define one more property here 

  clickMessage: string = "Open Login page";
  constructor(private router: Router) {

  }

  //define the Event to bind this Click msg 


  onClickMe() {

    console.log('event fired !!--->');
    this.router.navigate(['login']);

  }


}

