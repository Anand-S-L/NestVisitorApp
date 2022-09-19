import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-employeelogin',
  templateUrl: './employeelogin.component.html',
  styleUrls: ['./employeelogin.component.css']
})
export class EmployeeloginComponent implements OnInit {

  constructor(private api:ApiService, private router:Router) { }

  ngOnInit(): void {
  }
  username=""
  password=""

  readValue=()=>{
  let data={
    "username": this.username,
    "password":this.password
  }
  // console.log(data)
  this.api.employeelogin(data).subscribe(
    (Response:any)=>{
      console.log(Response);
      
      if(Response.status=="success")
      {
        let empId=Response.empId
        console.log(empId)
        localStorage.setItem("empId",empId);

        this.router.navigate(["/leaverequestApply"])
      }
      else{
        alert("Invalid Credentials")
      }


      
    }
  )
  }


}
