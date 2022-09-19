import { Component, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminComponent } from './admin/admin.component';
import { RouterModule, Routes } from '@angular/router';
import { AdminnavbarComponent } from './adminnavbar/adminnavbar.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { AddemployeeComponent } from './addemployee/addemployee.component';
import { ViewemployeesComponent } from './viewemployees/viewemployees.component';
import { FormsModule } from '@angular/forms';
import { LeaverequestComponent } from './leaverequest/leaverequest.component';
import { ViewvisitorlogComponent } from './viewvisitorlog/viewvisitorlog.component';
import { ViewemployeelogComponent } from './viewemployeelog/viewemployeelog.component';
import { EmployeeloginComponent } from './employeelogin/employeelogin.component';
import { LeaverequestApplyComponent } from './leaverequest-apply/leaverequest-apply.component';
import { EmployeeLeaveStatusComponent } from './employee-leave-status/employee-leave-status.component';
import { EmployeeNavbarComponent } from './employee-navbar/employee-navbar.component';
import { SearchemployeeComponent } from './searchemployee/searchemployee.component';
import { EditemployeeComponent } from './editemployee/editemployee.component';
import { SingleemployeelogComponent } from './singleemployeelog/singleemployeelog.component';

const approutes : Routes=[
  {
    path:"",
    component:AdminComponent
  },
  {
    path:"viewempl",
    component:ViewemployeesComponent
  },
  {
    path:"addempl",
    component:AddemployeeComponent
  },
  {
    path:"viewleaverequest",
    component:LeaverequestComponent
  },
  {
    path:"viewemployeelog",
    component:ViewemployeelogComponent
  },
  {
    path:"viewvisitorlog",
    component:ViewvisitorlogComponent
  },
  {
    path:"employeelogin",
    component:EmployeeloginComponent
  },
  {
    path:"leaverequestApply",
    component:LeaverequestApplyComponent
  },
  {
    path:"leaverequestStatus",
    component:EmployeeLeaveStatusComponent
  },
  {
    path:"searchemployee",
    component:SearchemployeeComponent
  },
  {
    
      path:"editemployee",
      component:EditemployeeComponent
    
  
  },
  {
    
    path:"singleemplog",
    component:SingleemployeelogComponent
  

}

]
@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    AdminnavbarComponent,
    AdmindashboardComponent,
    AddemployeeComponent,
    ViewemployeesComponent,
    LeaverequestComponent,
    ViewvisitorlogComponent,
    ViewemployeelogComponent,
    EmployeeloginComponent,
    LeaverequestApplyComponent,
    EmployeeLeaveStatusComponent,
    EmployeeNavbarComponent,
    SearchemployeeComponent,
    EditemployeeComponent,
    SingleemployeelogComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(approutes),
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
