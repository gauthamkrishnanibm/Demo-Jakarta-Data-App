/* This is built-in repository interface in Jakarta Data that handles common data access operations */
/* COMMENTTOCODE */
package com.demo.rest;

import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

@Repository //This annotation is part of the Jakarta Data specification, which provides a standard way to access data
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
/* ENDHOLE */
