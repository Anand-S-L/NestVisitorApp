package com.NestDigital.nestvisitorapp.model.dao;

import com.NestDigital.nestvisitorapp.model.EmployeeModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface EmployeeDao extends CrudRepository<EmployeeModel,Integer> {
//    update employee
    @Transactional
    @Modifying
    @Query(value = "UPDATE `employees` SET `designation`=?1,`emploeecode`=?2,`name`=?3,`password`=?4,`phoneno`=?5,`username`=?6 WHERE id=?7",nativeQuery = true)
    void updateemployee(String designation,String employeecode,String name,String password,String phoneno,String username,int id);
}
