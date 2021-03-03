package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.entity.Department;

@Service
public class EmployeeServicesImpl implements EmployeeServices {
	
	@Autowired
	EmployeeRepository employeeDAO;

	@Transactional
	public void saveEmployee(EmployeeRepository employee) {
		employeeDAO.saveEmployee(employee);

	}

	@Transactional
	public List<EmployeeRepository> findByDepartmentId(Department department) {
		return employeeDAO.findByDepartmentId(department);

	}

}
