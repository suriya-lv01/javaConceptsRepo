package com.spring.restapi;

import javax.persistence.EntityNotFoundException;

public class EmployeeNotFoundException extends EntityNotFoundException {
	public EmployeeNotFoundException(Long id) {
		super("Could not find employee" + id);
	}
}
