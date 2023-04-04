package com.revature.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	
	@Id
	private int empId;
	
	@Column(name="Employee_name")
	private String name;
	
	@Column(name="Employee_age")                                  
	private int age;
	
}
