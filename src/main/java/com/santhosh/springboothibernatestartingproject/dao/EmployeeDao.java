package com.santhosh.springboothibernatestartingproject.dao;

import java.util.List;

import com.santhosh.springboothibernatestartingproject.model.Employee;
import com.santhosh.springboothibernatestartingproject.model.Role;

public interface EmployeeDao {

	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee emp);
	
	void delete(int id);
}
