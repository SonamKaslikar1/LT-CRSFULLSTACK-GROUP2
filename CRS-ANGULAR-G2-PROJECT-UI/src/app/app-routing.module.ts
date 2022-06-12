import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContactusComponent } from './contactus/contactus.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { HomeComponentComponent } from './home-component/home-component.component';
import { LoginComponent } from './login/login.component';
import { MyComponentComponent } from './my-component/my-component.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';

//note: we have to define all the route rules here
const routes: Routes = [

  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'home', component: HomeComponentComponent },
  { path: 'customerdetails', component: MyComponentComponent },
  { path: 'contactus', component: ContactusComponent },
  { path: 'feedback', component: FeedbackComponent },
  { path: 'login', component: LoginComponent},
  { path: '**', component: PagenotfoundComponent }
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
