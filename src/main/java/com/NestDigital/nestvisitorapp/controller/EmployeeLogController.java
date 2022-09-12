package com.NestDigital.nestvisitorapp.controller;

import com.NestDigital.nestvisitorapp.model.EmployeeLogModel;
import com.NestDigital.nestvisitorapp.model.EmployeeModel;
import com.NestDigital.nestvisitorapp.model.dao.EmployeeLogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeLogController {
    @Autowired
    EmployeeLogDao dao;

//    employee log add
    @CrossOrigin(origins = "*")
    @PostMapping("/employeelogadd")
    public String employeelogadd(@RequestBody EmployeeLogModel employeelog){
        dao.save(employeelog);
        return  "successfully added";
    }

//    view employeelog
@CrossOrigin(origins = "*")
@GetMapping("/viewemployeelog")
public List<EmployeeLogModel> viewemployeelog(){

    return (List<EmployeeLogModel>) dao.findAll();
}

}
