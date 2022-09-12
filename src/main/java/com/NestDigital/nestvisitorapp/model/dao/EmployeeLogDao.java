package com.NestDigital.nestvisitorapp.model.dao;

import com.NestDigital.nestvisitorapp.model.EmployeeLogModel;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeLogDao extends CrudRepository<EmployeeLogModel,Integer> {
}
