import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http:HttpClient) { }

  fetchempl=()=>{
    return this.http.get("http://localhost:8080/viewallemployee")
  }
  addempl=(data:any)=>{
    return this.http.post("http://localhost:8080/addemployee",data)
  }
  fetchleaverequest=()=>{
    return this.http.get("http://localhost:8080/viewleaverequests")
  }
  leaveAction=(data:any)=>{
    return this.http.post("http://localhost:8080/updateleavestatus",data)
  }
  fetchemployeelog=()=>{
    return this.http.get("http://localhost:8080/viewemployeelog")
  }
  fetchvisitorlog=()=>{
    return this.http.get("http://localhost:8080/viewvisitorlog")
  }
  employeelogin=(data:any)=>{
    return this.http.post("http://localhost:8080/login",data)
  }

  leaveApply=(data:any)=>{
    return this.http.post("http://localhost:8080/leaveapply",data)
  }

  viewIndividualLeaves=(data:any)=>{
    return this.http.post("http://localhost:8080/viewSingleleaverequests",data)
  }

  searchemployee=(data:any)=>{
    return this.http.post("http://localhost:8080/searchemployees",data)
  }

  singleemplog=(data:any)=>{
    return this.http.post("http://localhost:8080/viewsingle",data)
  }

}
