package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="ID")
	private String name;
	
	@ManyToOne
	private Department departmen;

}
