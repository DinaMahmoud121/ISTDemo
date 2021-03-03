package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Department;

@Repository
public interface EmployeeRepository {
	
	void saveEmployee(EmployeeRepository employee);
	
	List<EmployeeRepository> findByDepartmentId(Department department);
	

}
