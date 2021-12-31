package com.gl.EMPManage.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.EMPManage.entities.Employee;
import com.gl.EMPManage.service.EmployeeService;

@RestController
@RequestMapping("/Employeecontroller")
public class EmployeeContoller {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employeeslist")
	public List<Employee> findAll() {
		return employeeService.findAll();
	}

	@GetMapping("/employeefind")
	public Optional<Employee> findById(int id) {
		return employeeService.findById(id);
	}

	@PostMapping("/employeesave")
	public void save(@RequestBody Employee employee) {
		employeeService.save(employee);
	}
	
	@DeleteMapping("/employeedelete")
	public void deleteById(int id) {
		employeeService.deleteById(id);
	}
	
	@GetMapping("/employeewithname")
	public List<Employee> findByFirstName(String firstName){
		return employeeService.findByFirstName(firstName);
	}
	
	@GetMapping("/sort")
	public List<Employee> findAllSortByFirstName(Direction direction){
		return employeeService.findAllSortByFirstName(direction);
	}
}
