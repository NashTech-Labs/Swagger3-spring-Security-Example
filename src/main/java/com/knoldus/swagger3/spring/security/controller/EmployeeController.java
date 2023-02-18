package com.knoldus.swagger3.spring.security.controller;


import com.knoldus.swagger3.spring.security.model.Employee;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Controller Class for fulfilling Security Requirements.
 *
 *  * @author shashikant tanti
 *  * @version OpenJdk 1.8
 */
    @RestController
    @SecurityRequirement(name = "shashijava")
    public class EmployeeController {

        private final List<Employee> employees = createList();

        @RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
        public List<Employee> firstPage() {
            return employees;
        }

        @DeleteMapping(path = { "/{id}" })
        public Employee delete(@PathVariable("id") int id) {
            Employee deletedEmp = null;
            for (Employee emp : employees) {
                if (emp.getEmpId().equals(id)) {
                    employees.remove(emp);
                    deletedEmp = emp;
                    break;
                }
            }
            return deletedEmp;
        }

        @PostMapping
        public Employee create(@RequestBody Employee user) {
            employees.add(user);
            System.out.println(employees);
            return user;
        }

    /**
     * Sets the List of Employee .
     *
     * @return employee if exist
     */
        private static List<Employee> createList() {
            List<Employee> tempEmployees = new ArrayList<>();
            Employee emp1 = new Employee();
            emp1.setName("Deepesh");
            emp1.setDesignation("Technocrats");
            emp1.setEmpId("11");
            emp1.setSalary(50000);

            Employee emp2 = new Employee();
            emp2.setName("emp2");
            emp2.setDesignation("Sr. developer");
            emp2.setEmpId("2");
            emp2.setSalary(60000);
            tempEmployees.add(emp1);
            tempEmployees.add(emp2);
            return tempEmployees;
        }

    }


