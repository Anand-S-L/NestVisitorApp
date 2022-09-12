package com.NestDigital.nestvisitorapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class EmployeeModel {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String emploeecode;
    private String designation;
    private String username;
    private String password;
    private String phoneno;

    public EmployeeModel() {
    }

    public EmployeeModel(int id, String name, String emploeecode, String designation, String username, String password, String phoneno) {
        this.id = id;
        this.name = name;
        this.emploeecode = emploeecode;
        this.designation = designation;
        this.username = username;
        this.password = password;
        this.phoneno = phoneno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmploeecode() {
        return emploeecode;
    }

    public void setEmploeecode(String emploeecode) {
        this.emploeecode = emploeecode;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
}
