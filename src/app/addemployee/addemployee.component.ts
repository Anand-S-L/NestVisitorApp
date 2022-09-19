import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-addemployee',
  templateUrl: './addemployee.component.html',
  styleUrls: ['./addemployee.component.css']
})
export class AddemployeeComponent implements OnInit {

  constructor(private api:ApiService) { }

  ngOnInit(): void {
  }
  name=""
  emploeecode=""
  designation=""
  username=""
  password=""
  phoneno=""

  valueAdd=()=>{
    let data={
      "name":this.name,
      "emploeecode":this.emploeecode,
      "designation":this.designation,
      "username":this.username,
      "password":this.password,
      "phoneno":this.phoneno
    }
    this.api.addempl(data).subscribe(
      (Response)=>{
        console.log(Response)
      }
    )

    this.name=""
    this.emploeecode=""
    this.designation=""
    this.username=""
    this.password=""
    this.phoneno=""
  }

}
