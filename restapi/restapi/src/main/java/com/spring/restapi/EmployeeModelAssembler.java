package com.spring.restapi;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class EmployeeModelAssembler implements RepresentationModelAssembler<Employee, EntityModel <Employee>>{

	@Override
	public EntityModel<Employee> toModel(Employee employee) {
		// TODO Auto-generated method stub
		return EntityModel.of(employee,
				linkto(methodOn(EmployeeController.class).one(employee.getId()).withSelfRel()),
				linkTo(methodOn(EmployeeController.class).all().withRel("employees")));
	}

}
