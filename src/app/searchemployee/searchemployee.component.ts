import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-searchemployee',
  templateUrl: './searchemployee.component.html',
  styleUrls: ['./searchemployee.component.css']
})
export class SearchemployeeComponent implements OnInit {

  constructor(private api:ApiService) { }

  ngOnInit(): void {
  }

  emploeecode=""
  
  search=()=>{
    let data={
      "emploeecode":this.emploeecode
    }
    this.api.searchemployee(data).subscribe(
      (Response)=>{
        
        this.employeedetails=Response
        
      }
    )
  }

  employeedetails:any=[]


}
