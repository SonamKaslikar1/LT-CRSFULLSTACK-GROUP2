import { Component, OnInit } from '@angular/core';
import { Customer } from './customer';
import { MyServiceService } from './my-service.service';
@Component({
  selector: 'app-my-component',
  templateUrl: './my-component.component.html',
  styleUrls: ['./my-component.component.css']
})
export class MyComponentComponent implements OnInit {

  custArray: Array<Customer> = new Array();
  // decalare the GET data here 
  // decalare the GET data here 
  getData: any[] = [];

  model = new Customer('', 0);
  constructor(private _httpService: MyServiceService) { }

  ngOnInit(): void {
  }

  // createCustomer(){
  //   try{
  //     console.log("customer creation here-->");

  //     // Add customer in Customer Array using push event.
  //     console.log(this.model.age);
  //     this.custArray.push(new Customer(this.model.name, this.model.age));
  //     console.log(JSON.stringify(this.custArray));

  //   } catch(err){

  //     console.log("Customer not created-->" +err);

  //   }

  //   }
  //   updateCustomer(){
  //     try{
  //       console.log("customer updated here-->");

  //     // Add customer in Customer Array using push event.
  //     console.log(this.model.age);
  //     // this.custArray.push(new Customer(this.model.name, this.model.age));
  //     for(let i=0;i<this.custArray.length;i++){
  //     this.custArray.splice(0,2,new Customer(this.model.name, this.model.age));
  //     }
  //     console.log(JSON.stringify(this.custArray));

  //     }
  //     catch(err){
  //       console.log("Customer not updated-->" +err);
  //     }
  //   }

  //   deleteCustomer(){
  //     try{
  //       console.log("customer deleted here-->");

  //     // delete customer in Custommer
  //     for(let i=0;i<this.custArray.length;i++){
  //       if(this.custArray[i].name == this.model.name){
  //         this.custArray.splice(i);
  //       }
  //     }

  //     }
  //     catch(err){
  //       console.log("Customer not deleted-->" +err);
  //     }
  //   }

  //call the service using the get course details

  getCourseDetails() {

    this._httpService.getCourse().subscribe((res: any[]) => {
      console.log(res);
      this.getData = res;

    });
  }

  getProfessorDetails() {
    this._httpService.getProfessor().subscribe((res: any[]) => {
      console.log(res);
      this.getData = res;

    });
  }
  addGrades(){
    
  }

}
