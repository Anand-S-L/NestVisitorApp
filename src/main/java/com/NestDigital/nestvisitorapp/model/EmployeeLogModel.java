package com.NestDigital.nestvisitorapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "employeelog")
public class EmployeeLogModel {
    @Id
    @GeneratedValue
    private int id;

    private int employeeid;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date employeelogin;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date employeelogout;

    public EmployeeLogModel() {
    }

    public EmployeeLogModel(int id, int employeeid, Date employeelogin, Date employeelogout) {
        this.id = id;
        this.employeeid = employeeid;
        this.employeelogin = employeelogin;
        this.employeelogout = employeelogout;
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

    public Date getEmployeelogin() {
        return employeelogin;
    }

    public void setEmployeelogin(Date employeelogin) {
        this.employeelogin = employeelogin;
    }

    public Date getEmployeelogout() {
        return employeelogout;
    }

    public void setEmployeelogout(Date employeelogout) {
        this.employeelogout = employeelogout;
    }
}
