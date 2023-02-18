package com.knoldus.swagger3.spring.security.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.knoldus.swagger3.spring.security.model.Employee;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {EmployeeController.class})
@ExtendWith(SpringExtension.class)
class EmployeeControllerTest {
    @Autowired
    private EmployeeController employeeController;

    /**
     * Method under test: {@link EmployeeController#create(Employee)}
     */
    @Test
    void testCreate() throws Exception {
        Employee employee = new Employee();
        employee.setDesignation("Designation");
        employee.setEmpId("42");
        employee.setName("Name");
        employee.setSalary(10.0d);
        String content = (new ObjectMapper()).writeValueAsString(employee);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(employeeController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(405));
    }

    /**
     * Method under test: {@link EmployeeController#delete(int)}
     */
    @Test
    void testDelete() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/{id}", 1);
        MockMvcBuilders.standaloneSetup(employeeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    /**
     * Method under test: {@link EmployeeController#delete(int)}
     */
    @Test
    void testDelete2() throws Exception {
        MockHttpServletRequestBuilder deleteResult = MockMvcRequestBuilders.delete("/{id}", 1);
        deleteResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(employeeController)
                .build()
                .perform(deleteResult)
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    /**
     * Method under test: {@link EmployeeController#firstPage()}
     */
    @Test
    void testFirstPage() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/employees");
        MockMvcBuilders.standaloneSetup(employeeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "[{\"empId\":\"1\",\"name\":\"emp1\",\"designation\":\"Software Consultant\",\"salary\":40000.0},{\"empId\":\"2\",\"name"
                                        + "\":\"emp2\",\"designation\":\"Sr. developer\",\"salary\":60000.0}]"));
    }

    /**
     * Method under test: {@link EmployeeController#firstPage()}
     */
    @Test
    void testFirstPage2() throws Exception {
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/employees");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(employeeController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "[{\"empId\":\"1\",\"name\":\"emp1\",\"designation\":\"Software Consultant\",\"salary\":40000.0},{\"empId\":\"2\",\"name"
                                        + "\":\"emp2\",\"designation\":\"Sr. developer\",\"salary\":60000.0}]"));
    }
}

