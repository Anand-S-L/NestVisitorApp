import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-viewemployeelog',
  templateUrl: './viewemployeelog.component.html',
  styleUrls: ['./viewemployeelog.component.css']
})
export class ViewemployeelogComponent implements OnInit {

  constructor(private api :ApiService) {
   this.api.fetchemployeelog().subscribe(
    (Response)=>{
      this.data=Response
      console.log(Response)
    }
   )
   }


  ngOnInit(): void {
  }
  data:any=[]
}
