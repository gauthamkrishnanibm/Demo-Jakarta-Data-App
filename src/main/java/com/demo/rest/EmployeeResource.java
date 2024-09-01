/* A simple REST application which uses Jakarta Data to get all the employees in the database and allow adding new employees into the database. Uses Jakarta EE 11 new feature Jakarta Data 1.0  */
/* COMMENTTOCODE */
package com.demo.rest;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
@Path("/employees")
public class EmployeeResource {
    @Inject EmployeeRepository employeeRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> findAll() {

        return employeeRepository.findAll().toList();
        
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addEmployee(Employee employee) {

        Employee saved = employeeRepository.save(employee);
       return Response.ok("Created employee: " + saved.getEmployeeId()).build();
       
    }
}
/* ENDHOLE */
