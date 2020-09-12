package com.santhosh.springboothibernatestartingproject.service;

import java.util.List;

import com.santhosh.springboothibernatestartingproject.model.Employee;
import com.santhosh.springboothibernatestartingproject.model.Role;
import com.santhosh.springboothibernatestartingproject.transfer.EmployeeDTO;

public interface EmployeeService {
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);

}
