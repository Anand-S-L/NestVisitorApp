import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-employee-leave-status',
  templateUrl: './employee-leave-status.component.html',
  styleUrls: ['./employee-leave-status.component.css']
})
export class EmployeeLeaveStatusComponent implements OnInit {

  constructor(private api:ApiService) { 
    this.viewLeaverequest()
     }
   
   
   viewLeaverequest=()=>{
    let data={"employeeid":localStorage.getItem("empId")}

     this.api.viewIndividualLeaves(data).subscribe(
       (Response)=>{
         console.log(Response)
         this.data=Response
       }
     )
   }
   data:any=""

  ngOnInit(): void {
  }

}
