package com.NestDigital.nestvisitorapp.controller;

import com.NestDigital.nestvisitorapp.model.LeaveRequestModel;
import com.NestDigital.nestvisitorapp.model.dao.LeaveRequestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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



}
