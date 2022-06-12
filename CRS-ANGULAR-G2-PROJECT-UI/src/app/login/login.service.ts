import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Login } from './login';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  headers = new HttpHeaders().set('Content-Type', 'application/json').set('Access-Control-Allow-Origin','*');
  constructor(private httpClient:HttpClient) { }
  getLoginUser(login: Login){
    debugger
    let getLoginUserUrl:string = "http://localhost:8080/loginUser";
    return this.httpClient.post(getLoginUserUrl,login);
  }
}
