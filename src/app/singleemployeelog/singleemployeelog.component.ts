import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-singleemployeelog',
  templateUrl: './singleemployeelog.component.html',
  styleUrls: ['./singleemployeelog.component.css']
})
export class SingleemployeelogComponent implements OnInit {

  constructor(private api:ApiService) {
    api.singleemplog({"employeeid": localStorage.getItem("empId")}).subscribe(
      (Response)=>{
        this.data=Response
      }
    )

  }

  ngOnInit(): void {
  }




  data:any=[]

}
