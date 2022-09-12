package com.NestDigital.nestvisitorapp.model.dao;

import com.NestDigital.nestvisitorapp.model.LeaveRequestModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Date;


public interface LeaveRequestDao extends CrudRepository<LeaveRequestModel,Integer> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE `leaverequest` SET `status`=?1 WHERE `employeeid`=?2",nativeQuery = true)
    void updateleavestatus(int status,int employeeid);
}
