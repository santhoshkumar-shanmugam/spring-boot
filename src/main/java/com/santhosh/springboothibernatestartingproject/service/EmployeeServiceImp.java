package com.santhosh.springboothibernatestartingproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.santhosh.springboothibernatestartingproject.dao.EmployeeDao;
import com.santhosh.springboothibernatestartingproject.model.Employee;
import com.santhosh.springboothibernatestartingproject.model.Role;
import com.santhosh.springboothibernatestartingproject.transfer.EmployeeDTO;
import com.santhosh.springboothibernatestartingproject.transfer.RoleDTO;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Transactional
	@Override
	public List<Employee> get() {
		return employeeDao.get();
	}

	@Transactional
	@Override
	public Employee get(int id) {
		return employeeDao.get(id);

	}

	@Transactional
	@Override
	public void save(Employee employee) {

		/*
		 * Employee emp = new Employee();
		 * emp.setDepartment(employee.getDepartment());
		 * emp.setDob(employee.getDob()); emp.setGender(employee.getGender());
		 * emp.setId(employee.getId()); emp.setName(employee.getName()); for
		 * (Role role : employee.getRoles()) { role.setEmployee(emp);
		 * emp.getRoles().add(role); }
		 */

		Employee emp = new Employee();
		emp.setDepartment(employee.getDepartment());
		emp.setDob(employee.getDob());
		emp.setGender(employee.getGender());
		emp.setName(employee.getName());
		/*for (Role role : employee.getRoles()) {
			role.setEmployee(emp);
		}*/

		emp.setRoles(employee.getRoles());

		employeeDao.save(employee);
	}

	@Transactional
	@Override
	public void delete(int id) {
		employeeDao.delete(id);

	}

}
