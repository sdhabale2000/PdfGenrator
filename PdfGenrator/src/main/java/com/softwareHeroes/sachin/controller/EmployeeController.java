package com.softwareHeroes.sachin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softwareHeroes.sachin.entity.Employee;
import com.softwareHeroes.sachin.repo.EmployeeRepo;
import com.softwareHeroes.sachin.service.EmployeeService;

@RestController
@RequestMapping("/employee1")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;

	@Autowired
	private EmployeeRepo repo;

	@GetMapping("/empid/{id}")
	public Employee getEmpById(@PathVariable Integer id) {
		return service.getEmpById(id);
	}
	

}
