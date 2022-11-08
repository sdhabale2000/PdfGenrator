package com.softwareHeroes.sachin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softwareHeroes.sachin.entity.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	

}
