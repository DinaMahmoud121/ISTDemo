package com.example.demo.services;

import java.util.List;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.entity.Department;

public interface EmployeeServices {
	
void saveEmployee(EmployeeRepository employee);
	
List<EmployeeRepository> findByDepartmentId(Department department);

}
