package com.spring.restapi;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.Entity;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	private final EmployeeRepository employeeRepository;
	private final EmployeeModelAssembler assembler;

	public EmployeeController(EmployeeRepository employeeRepository, EmployeeModelAssembler assembler) {
		this.employeeRepository = employeeRepository;
		this.assembler = assembler;
	}

	@GetMapping("/employees/{id}")
	EntityModel<Employee> one(@PathVariable Long id) {
		Employee employee = employeeRepository.getOne(id);
		return assembler.toModel(employee);

	}

//	@GetMapping("/employees")
//	CollectionModel<EntityModel<Employee>> all() {
//
//		List<EntityModel<Employee>> employees = employeeRepository.findAll().stream() //
//				.map(assembler::toModel) //
//				.collect(Collectors.toList());
//
//		return CollectionModel.of(employees, linkTo(methodOn(EmployeeController.class).all()).withSelfRel());
//	}

	@GetMapping("/employees")
	List<Employee> all() {
		return employeeRepository.findAll();
	}

	@PostMapping("/employees")
	Employee newEmployees(@RequestBody Employee newEmployee) {
		return employeeRepository.save(newEmployee);
	}

	@PutMapping("/employees/{id}")
	Employee updateEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
		return employeeRepository.findById(id).map(employee -> {
			employee.setName(newEmployee.getName());
			employee.setRole(newEmployee.getRole());
			return employeeRepository.save(employee);
		}).orElseGet(() -> {
			newEmployee.setId(id);
			return employeeRepository.save(newEmployee);
		});
	}

	@DeleteMapping("/employees/{id}")
	void deleteEmployee(@PathVariable Long id) {
		employeeRepository.deleteById(id);
	}
}
