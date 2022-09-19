import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-leaverequest-apply',
  templateUrl: './leaverequest-apply.component.html',
  styleUrls: ['./leaverequest-apply.component.css']
})
export class LeaverequestApplyComponent implements OnInit {

  constructor(private api:ApiService) {
    this.empId=localStorage.getItem("empId")
    console.log(this.empId)
   }

  ngOnInit(): void {
  }
  empId:any=""
  leaveDate=""


  ApplyForleave=()=>{
    let data={"leavedate":this.leaveDate,"employeeid":this.empId}
    this.api.leaveApply(data).subscribe(
      (Response)=>{
        console.log(Response)
      }
    )

  }

}
