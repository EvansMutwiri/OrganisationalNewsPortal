package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {

    Department deptAlpha = new Department("Finance", "make payments", 4);

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void getName_ReturnsCorrectName_name() throws Exception {
        Department department = deptAlpha;
        assertEquals("Finance", department.getName());
    }

    @Test
    public void getNoEmployees_returnsCorrect_noEmployees() throws Exception {
        Department department = deptAlpha;
        assertEquals(4, department.getNoEmployees());
    }

    @Test
    public void getDescriptionReturnsCorrectDescription() throws Exception {
        Department department = deptAlpha;
        assertEquals("make payments", department.getDescription());
    }

    @Test
    public void setName_setsNameCorrectly_Marketing() throws Exception {
        deptAlpha.setName("Marketing");
        assertNotEquals("Information tech", deptAlpha.getName());
    }

    @Test
    public void setDescriptionCorrectly() throws Exception {
        deptAlpha.setDescription("advertise");
        assertNotEquals("make payments", deptAlpha.getDescription());
    }

    @Test
    public void setNoEmployeesCorrectly() throws Exception {
        deptAlpha.setNoEmployees(6);
        assertNotEquals(4, deptAlpha.getNoEmployees());
    }
}