package com.softwareHeroes.sachin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column
private Integer empid;
@Column
private String empName;
@Column
private Integer empSalary;

public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(String empName, Integer empSalary) {
	super();
	this.empName = empName;
	this.empSalary = empSalary;
}
public Integer getEmpid() {
	return empid;
}
public void setEmpid(Integer empid) {
	this.empid = empid;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public Integer getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(Integer empSalary) {
	this.empSalary = empSalary;
}

	
	
}
