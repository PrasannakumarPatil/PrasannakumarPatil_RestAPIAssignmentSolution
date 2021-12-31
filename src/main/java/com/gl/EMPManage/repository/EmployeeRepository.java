package com.gl.EMPManage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.EMPManage.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
