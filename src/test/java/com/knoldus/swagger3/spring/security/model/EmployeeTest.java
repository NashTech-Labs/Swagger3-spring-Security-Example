package com.knoldus.swagger3.spring.security.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class EmployeeTest {
    /**
     * Methods under test:
     *
     */
    @Test
    void testConstructor() {
        Employee actualEmployee = new Employee();
        actualEmployee.setDesignation("Developer");
        actualEmployee.setEmpId("40");
        actualEmployee.setName("Shashikant");
        actualEmployee.setSalary(55000);
        assertEquals("Developer", actualEmployee.getDesignation());
        assertEquals("40", actualEmployee.getEmpId());
        assertEquals("Shashikant", actualEmployee.getName());
        assertEquals(55000, actualEmployee.getSalary());
    }

    /**
     * Method under test: {@link Employee#equals(Object)}
     */
    @Test
    void testEquals() {
        Employee employee = new Employee();
        employee.setDesignation("Software Designer");
        employee.setEmpId("62");
        employee.setName("Munna");
        employee.setSalary(45000);
        assertNotEquals(employee, null);
    }

    /**
     * Method under test: {@link Employee#equals(Object)}
     */
    @Test
    void testEquals2() {
        Employee employee = new Employee();
        employee.setDesignation("HR");
        employee.setEmpId("45");
        employee.setName("Sankata");
        employee.setSalary(41000);
        assertNotEquals(employee, "Different type to Employee");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Employee#equals(Object)}
     *   <li>{@link Employee#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        Employee employee = new Employee();
        employee.setDesignation("P @ C");
        employee.setEmpId("72");
        employee.setName("Johny");
        employee.setSalary(85000);
        assertEquals(employee, employee);
        int expectedHashCodeResult = employee.hashCode();
        assertEquals(expectedHashCodeResult, employee.hashCode());
    }

    /**
     * Methods under test:
     */
    @Test
    void testEquals4() {
        Employee employee = new Employee();
        employee.setDesignation("Designation123");
        employee.setEmpId("52");
        employee.setName("USER3");
        employee.setSalary(10.0d);

        Employee employee1 = new Employee();
        employee1.setDesignation("Designation123");
        employee1.setEmpId("52");
        employee1.setName("USER3");
        employee1.setSalary(10.0d);
        assertEquals(employee, employee1);
        int expectedHashCodeResult = employee.hashCode();
        assertEquals(expectedHashCodeResult, employee1.hashCode());
    }

    /**
     * Method under test: {@link Employee#equals(Object)}
     */
    @Test
    void testEquals5() {
        Employee employee = new Employee();
        employee.setDesignation("42");
        employee.setEmpId("42");
        employee.setName("Name");
        employee.setSalary(10.0d);

        Employee employee1 = new Employee();
        employee1.setDesignation("Designation");
        employee1.setEmpId("42");
        employee1.setName("Name");
        employee1.setSalary(10.0d);
        assertNotEquals(employee, employee1);
    }

    /**
     * Method under test: {@link Employee#equals(Object)}
     */
    @Test
    void testEquals6() {
        Employee employee = new Employee();
        employee.setDesignation(null);
        employee.setEmpId("42");
        employee.setName("Name");
        employee.setSalary(10.0d);

        Employee employee1 = new Employee();
        employee1.setDesignation("Designation");
        employee1.setEmpId("42");
        employee1.setName("Name");
        employee1.setSalary(10.0d);
        assertNotEquals(employee, employee1);
    }

    /**
     * Method under test: {@link Employee#equals(Object)}
     */
    @Test
    void testEquals7() {
        Employee employee = new Employee();
        employee.setDesignation("Designation");
        employee.setEmpId("Designation");
        employee.setName("Name");
        employee.setSalary(10.0d);

        Employee employee1 = new Employee();
        employee1.setDesignation("Designation");
        employee1.setEmpId("42");
        employee1.setName("Name");
        employee1.setSalary(10.0d);
        assertNotEquals(employee, employee1);
    }

    /**
     * Method under test: {@link Employee#equals(Object)}
     */
    @Test
    void testEquals8() {
        Employee employee = new Employee();
        employee.setDesignation("Designation");
        employee.setEmpId(null);
        employee.setName("Name");
        employee.setSalary(10.0d);

        Employee employee1 = new Employee();
        employee1.setDesignation("Designation");
        employee1.setEmpId("42");
        employee1.setName("Name");
        employee1.setSalary(10.0d);
        assertNotEquals(employee, employee1);
    }

    /**
     * Method under test: {@link Employee#equals(Object)}
     */
    @Test
    void testEquals9() {
        Employee employee = new Employee();
        employee.setDesignation("QA");
        employee.setEmpId("32");
        employee.setName("Prabhat");
        employee.setSalary(55000);

        Employee employee1 = new Employee();
        employee1.setDesignation("QA");
        employee1.setEmpId("31");
        employee1.setName("Pratibha");
        employee1.setSalary(55000);
        assertNotEquals(employee, employee1);
    }

    /**
     * Method under test: {@link Employee#equals(Object)}
     */
    @Test
    void testEquals10() {
        Employee employee = new Employee();
        employee.setDesignation("Finance");
        employee.setEmpId("22");
        employee.setName(null);
        employee.setSalary(40000);

        Employee employee1 = new Employee();
        employee1.setDesignation("Finance");
        employee1.setEmpId("22");
        employee1.setName("User2");
        employee1.setSalary(40000);
        assertNotEquals(employee, employee1);
    }

    /**
     * Method under test: {@link Employee#equals(Object)}
     */
    @Test
    void testEquals11() {
        Employee employee = new Employee();
        employee.setDesignation("Lead Consultant");
        employee.setEmpId("12");
        employee.setName("Jitendra");
        employee.setSalary(90005);

        Employee employee1 = new Employee();
        employee1.setDesignation("Lead Consultant");
        employee1.setEmpId("12");
        employee1.setName("Jitendra");
        employee1.setSalary(100000);
        assertNotEquals(employee, employee1);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Employee#equals(Object)}
     *   <li>{@link Employee#hashCode()}
     * </ul>
     */
    @Test
    void testEquals12() {
        Employee employee = new Employee();
        employee.setDesignation(null);
        employee.setEmpId("102");
        employee.setName("Harsh");
        employee.setSalary(85000);

        Employee employee1 = new Employee();
        employee1.setDesignation(null);
        employee1.setEmpId("102");
        employee1.setName("Harsh");
        employee1.setSalary(85000);
        assertEquals(employee, employee1);
        int expectedHashCodeResult = employee.hashCode();
        assertEquals(expectedHashCodeResult, employee1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Employee#equals(Object)}
     *   <li>{@link Employee#hashCode()}
     * </ul>
     */
    @Test
    void testEquals13() {
        Employee employee = new Employee();
        employee.setDesignation("Software Developer");
        employee.setEmpId(null);
        employee.setName("DEEPAK");
        employee.setSalary(58000);

        Employee employee1 = new Employee();
        employee1.setDesignation("Software Developer");
        employee1.setEmpId(null);
        employee1.setName("DEEPAK");
        employee1.setSalary(58000);
        assertEquals(employee, employee1);
        int expectedHashCodeResult = employee.hashCode();
        assertEquals(expectedHashCodeResult, employee1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Employee#equals(Object)}
     *   <li>{@link Employee#hashCode()}
     * </ul>
     */
    @Test
    void testEquals14() {
        Employee employee = new Employee();
        employee.setDesignation("HR");
        employee.setEmpId("42");
        employee.setName(null);
        employee.setSalary(40000);

        Employee employee1 = new Employee();
        employee1.setDesignation("HR");
        employee1.setEmpId("42");
        employee1.setName(null);
        employee1.setSalary(40000);
        assertEquals(employee, employee1);
        int expectedHashCodeResult = employee.hashCode();
        assertEquals(expectedHashCodeResult, employee1.hashCode());
    }
}

