package com.softwareHeroes.sachin.service;

import org.springframework.stereotype.Service;

import com.softwareHeroes.sachin.entity.Employee;

@Service
public interface EmployeeService {
	
	public Employee getEmpById(Integer empId);
	
	

}
