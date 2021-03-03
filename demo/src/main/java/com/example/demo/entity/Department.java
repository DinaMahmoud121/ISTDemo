package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class Department {
	
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="ID")
	private String name;
	
	@OneToMany
	List<Employee> employees;

}
