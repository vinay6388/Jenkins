package com.revature.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entity.Employee;

@RestController
public class EmployeeController {

	Employee emp;
	
	@GetMapping("/employee")
	public ResponseEntity<Employee> getEmp(int id) {
		
		return ResponseEntity.ok().body(emp);
	}
}
