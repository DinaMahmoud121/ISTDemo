package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.entity.Department;
import com.example.demo.services.EmployeeServices;

@RestController
public class EmployeeRest {
	
	@Autowired
	EmployeeServices employeeServices;
	
	@PostMapping("/emp")
	public void saveEmployee(@PathVariable EmployeeRepository emp) {
		employeeServices.saveEmployee(emp);
	}
	
	@GetMapping("/department")
	public List<EmployeeRepository> getEmployeesByDepartment(@PathVariable Department department) {
		
		return employeeServices.findByDepartmentId(department);
		
	}

}
