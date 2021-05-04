package com.capgemini.dao;

import com.capgemini.entities.Employee;

public interface EmployeeDao {
	
	public boolean createEmployee(Employee employee);
	
	public Employee findById(int id);
}
