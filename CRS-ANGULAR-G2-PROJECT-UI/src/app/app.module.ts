import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MyComponentComponent } from './my-component/my-component.component';
import { TestPipePipe } from './my-component/test-pipe.pipe';
import { HighlightDirective } from './my-component/highlight.directive';
import { HomeComponentComponent } from './home-component/home-component.component';
import { ContactusComponent } from './contactus/contactus.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { LoginComponent } from './login/login.component';

@NgModule({
  declarations: [ //here we need to register the component pipe directive inside the declaration section
    AppComponent, MyComponentComponent, TestPipePipe, HighlightDirective, HomeComponentComponent, ContactusComponent, PagenotfoundComponent, FeedbackComponent, LoginComponent
  ],
  imports: [ //here we need to register all external and internal modules
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [], // here we need to register all angular internal and external services
  bootstrap: [AppComponent] //here we need to register the entry point of the component.
})
export class AppModule { }
