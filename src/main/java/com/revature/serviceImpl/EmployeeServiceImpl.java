package com.revature.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.entity.Employee;
import com.revature.repository.EmployeeRepository;
import com.revature.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	
	
	@Autowired
	EmployeeRepository repo;


	@Override
	public Employee getEmployee(int id) {
		return repo.getById(id);
	}

}
