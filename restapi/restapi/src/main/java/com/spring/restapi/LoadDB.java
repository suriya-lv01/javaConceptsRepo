package com.spring.restapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jdk.internal.org.jline.utils.Log;

@Configuration
public class LoadDB {
	
	private static final Logger logger	=	LoggerFactory.getLogger(LoadDB.class);
	
	@Bean
	CommandLineRunner initDB(EmployeeRepository repository) {
		return args->{
			logger.info("Create row:"+repository.save(new Employee("Jake","Black")));
			repository.save(new Employee("Severus","Snape"));
		};
	}
	
}
