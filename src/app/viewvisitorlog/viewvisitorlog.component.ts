import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-viewvisitorlog',
  templateUrl: './viewvisitorlog.component.html',
  styleUrls: ['./viewvisitorlog.component.css']
})
export class ViewvisitorlogComponent implements OnInit {

  constructor(private api:ApiService) {
    this.api.fetchvisitorlog().subscribe(
      (Response)=>{
        this.data=Response
      }

    )
   }

  ngOnInit(): void {
  }
  data:any=[]

}
