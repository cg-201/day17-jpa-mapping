package com.capgemini.client;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.dao.EmployeeDao;
import com.capgemini.dao.EmployeeDaoImpl;
import com.capgemini.entities.Address;
import com.capgemini.entities.Employee;
import com.capgemini.entities.Project;

public class Client {
	public static void main(String[] args) {

		// createEmployee();
		findEmployee();
	}
	
	public static void findEmployee() {
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		
		Employee  employee =  employeeDao.findById(1);
		System.out.println(employee);
	}
	
	public static void createEmployee() {
		EmployeeDao employeeDao = new EmployeeDaoImpl();

		// address
		Address address = new Address();
		address.setCity("mumbai");
		address.setState("mh");
		
		// Projects
		List<Project> list = new ArrayList<>();
		Project p1 = new Project();
		p1.setName("database");
		p1.setLocation("mu");
		
		Project p2 = new Project();
		p2.setName("networking");
		p2.setLocation("mu");
		
		list.add(p1);
		// list.add(p2);
		

		Employee employee = new Employee();
		employee.setName("rahul");
		employee.setEmail("rahul@gamil.com");
		employee.setMobile("31212121");
		// address
		employee.setAddress(address);
		employee.setProjectList(list);
		

		employeeDao.createEmployee(employee);

		System.out.println("JPA Check!");
	}
}
