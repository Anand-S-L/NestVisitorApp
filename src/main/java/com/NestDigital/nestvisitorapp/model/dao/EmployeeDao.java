package com.NestDigital.nestvisitorapp.model.dao;

import com.NestDigital.nestvisitorapp.model.EmployeeModel;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<EmployeeModel,Integer> {
}
