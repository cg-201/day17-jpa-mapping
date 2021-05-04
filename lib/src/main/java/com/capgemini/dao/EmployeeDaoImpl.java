package com.capgemini.dao;

import javax.persistence.EntityManager;

import com.capgemini.entities.Employee;
import com.capgemini.util.JPAUtil;

public class EmployeeDaoImpl implements EmployeeDao {
	private EntityManager manager;
	
	public EmployeeDaoImpl() {
		manager =  JPAUtil.getEntityManager();
	}

	@Override
	public boolean createEmployee(Employee employee) {
		
		manager.getTransaction().begin();
		manager.persist(employee);
		manager.getTransaction().commit();
		
		return true;
	}

	@Override
	public Employee findById(int id) {
		return manager.find(Employee.class, id);
	}

}
