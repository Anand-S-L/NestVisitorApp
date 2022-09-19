import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-leaverequest',
  templateUrl: './leaverequest.component.html',
  styleUrls: ['./leaverequest.component.css']
})
export class LeaverequestComponent implements OnInit {

  constructor(private api:ApiService) { 
 this.viewLeaverequest()
  }


viewLeaverequest=()=>{
  this.api.fetchleaverequest().subscribe(
    (Response)=>{
      console.log(Response)
      this.data=Response
    }
  )
}


  LeaveAction=(id:any,status:any)=>{
    let sendData={
      "id":id,
      "status":status
    }
    this.api.leaveAction(sendData).subscribe(
      (Response)=>{
        this.viewLeaverequest()

        console.log(Response)
      }
    )
    this.viewLeaverequest()


  }

  ngOnInit(): void {
  }
  data:any=[]
}
