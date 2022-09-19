import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-viewemployees',
  templateUrl: './viewemployees.component.html',
  styleUrls: ['./viewemployees.component.css']
})
export class ViewemployeesComponent implements OnInit {

  constructor(private api:ApiService) {
    api.fetchempl().subscribe(
      (Response)=>{
        this.data=Response
      }
    )
   }

  ngOnInit(): void {
  }

  data:any=[]
}
