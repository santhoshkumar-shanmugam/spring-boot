package com.santhosh.springboothibernatestartingproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santhosh.springboothibernatestartingproject.model.Employee;
import com.santhosh.springboothibernatestartingproject.model.Role;
import com.santhosh.springboothibernatestartingproject.service.EmployeeService;
import com.santhosh.springboothibernatestartingproject.transfer.EmployeeDTO;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmployees(){
		return employeeService.get();
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Employee emp){
		System.out.println(emp);
		employeeService.save(emp);
		//return emp;
	}
	
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable int id){
		 Employee emp=employeeService.get(id);
		 if(emp==null){
			 throw new RuntimeException("Employee with id "+id+" is not found");
		 }
		 return emp;
	}
	
	@DeleteMapping("/remove/{id}")
	
	public String removeEmployee(@PathVariable int id){
		System.out.println(id);
		employeeService.delete(id);
		return "The employee id "+id+"is removed successfully";
	}
	
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee emp){
		employeeService.save(emp);
		return emp;
	}
}
