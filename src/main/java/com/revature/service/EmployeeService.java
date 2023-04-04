package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.entity.Employee;

@Service
public interface EmployeeService {
	
	public  Employee getEmployee(int id);
}
