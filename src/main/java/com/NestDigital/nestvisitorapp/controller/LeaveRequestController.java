package com.NestDigital.nestvisitorapp.controller;

import com.NestDigital.nestvisitorapp.model.LeaveRequestModel;
import com.NestDigital.nestvisitorapp.model.dao.LeaveRequestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LeaveRequestController {
    @Autowired
    LeaveRequestDao dao;

//    leave Request applying

    @CrossOrigin(origins = "*")
    @PostMapping("/leaveapply")
    public String leaveapply(@RequestBody LeaveRequestModel leaverequest){
        dao.save(leaverequest);
        return "successfully applied";
    }

//    view all leave requests

    @CrossOrigin(origins = "*")
    @GetMapping("/viewleaverequests")
    public List<LeaveRequestModel> viewleaverequests(){
        return (List<LeaveRequestModel>) dao.findAll();
    }


}
