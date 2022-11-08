package com.softwareHeroes.sachin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softwareHeroes.sachin.entity.Employee;
import com.softwareHeroes.sachin.repo.EmployeeRepo;
@Service
public class EmployeeServiceImp implements EmployeeService{
	

	private final EmployeeRepo repo;

	@Autowired
	public EmployeeServiceImp(EmployeeRepo repo) {
		this.repo = repo;
	}
	
	@Override
	public Employee getEmpById(Integer empId) {
		Employee employee = repo.findById(empId).orElse(null);
		return employee;
	}
	

}
