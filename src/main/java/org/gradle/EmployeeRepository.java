package org.gradle;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

//Example modified from spring.io

//This will be AUTO IMPLEMENTED by Spring into a Bean called EmployeeRepository
//CRUD refers Create, Read, Update, Delete

@Component
public interface EmployeeRepository extends CrudRepository<Employee, Long>  {
	//You can leave this blank or insert any function you want.
	//These function has a predefined format - see
	//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
	
	public int countByName(String name); 
}

