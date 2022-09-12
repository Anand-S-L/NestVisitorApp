package com.NestDigital.nestvisitorapp.controller;

import com.NestDigital.nestvisitorapp.model.EmployeeModel;
import com.NestDigital.nestvisitorapp.model.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NestVisitorAppController {

    @Autowired
    EmployeeDao dao;

    //    add employee
    @CrossOrigin(origins = "*")
    @PostMapping("/addemployee")
    public String addemployee(@RequestBody EmployeeModel employee){
        dao.save(employee);
        return  "employee added successfully";
    }
//   delete employee
    @CrossOrigin(origins = "*")
    @DeleteMapping("/deleteemployee/{id}")
    public String deleteemployee(@PathVariable int id){
        dao.deleteById(id);
        return "deleted successfully";
    }
}
