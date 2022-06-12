import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'// the means of provviding this root is this service is accessible in entire project
})
export class MyServiceService {

  headers = new HttpHeaders().set('Content-Type', 'application/json').set('Access-Control-Allow-Origin', '*');
  constructor(private httpClient: HttpClient) { }
  //get method implementation, fetch    the data
  getCourse(): Observable<any> {
    let getCourseUrl: string = "http://localhost:8080/viewCourseForProfessor";
    return this.httpClient.get(getCourseUrl, { headers: this.headers });
  }
  getProfessor(): Observable<any> {
    let getCourseUrl: string = "http://localhost:8080/viewStudentsForProfessor";
    return this.httpClient.get(getCourseUrl, { headers: this.headers });
  }
}
