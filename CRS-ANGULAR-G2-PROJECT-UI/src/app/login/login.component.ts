import { Component, OnInit } from '@angular/core';
import { Login } from './login';
import { LoginService } from './login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  // decalare the GET data here 
  getData: string ="";

  model = new Login('', '','');
  constructor(private loginService: LoginService) { }

  ngOnInit(): void {
  }


  validateUser(){
    debugger
  this.loginService.getLoginUser(this.model).subscribe(res => {
      console.log(res);
      this.getData = JSON.stringify(res);

    });
  }

}  
