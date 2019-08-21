package com.example.springboot.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.demo.entity.Employee;
import com.example.springboot.demo.exception.EmployeeNotFoundException;
import com.example.springboot.demo.repository.EmployeeRepository;

/**
 * @author Murugeswaran
 *
 */
@RestController
@RequestMapping("/api")
@Validated
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	// Get mapping to get employee record by ID
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable int id){
		Optional<Employee> result = employeeRepository.findById(id);
		
		Employee employee = null;
		if (result.isPresent()) {
			employee = result.get();
		}else {
			// Employee does not exists
			throw new EmployeeNotFoundException("Did not find employee id - " + id);
		}
		
		return employee;
		
	}
	
	// Get mapping to get all employee record in a list
	@GetMapping("/employees")
	public List <Employee> getEmployeeList(){
		List<Employee> result = employeeRepository.findAll();
		return result;
		
	}
	
	// Post mapping to add a employee to database
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return employee;
	}
	
	// Put mapping to update a employee in database
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return employee;
	}
	
	// Delete mapping to delete a employee from database
	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable int id) {
		Optional<Employee> result = employeeRepository.findById(id);
		
		if (!result.isPresent()) {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + id);
		}
		employeeRepository.deleteById(id);
		return "Deleted employee id - " + id;
	}
}
