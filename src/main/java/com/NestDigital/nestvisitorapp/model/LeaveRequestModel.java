package com.NestDigital.nestvisitorapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "leaverequest")
public class LeaveRequestModel {
    @Id
    @GeneratedValue
    private int id;

    private int employeeid;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @CreationTimestamp
    private Date dateofapplication;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date leavedate;
    private int status;

    public LeaveRequestModel() {
    }

    public LeaveRequestModel(int id, int employeeid, Date dateofapplication, Date leavedate, int status) {
        this.id = id;
        this.employeeid = employeeid;
        this.dateofapplication = dateofapplication;
        this.leavedate = leavedate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public Date getDateofapplication() {
        return dateofapplication;
    }

    public void setDateofapplication(Date dateofapplication) {
        this.dateofapplication = dateofapplication;
    }

    public Date getLeavedate() {
        return leavedate;
    }

    public void setLeavedate(Date leavedate) {
        this.leavedate = leavedate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
