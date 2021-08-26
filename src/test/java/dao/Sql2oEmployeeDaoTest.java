package dao;

import org.junit.*;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import dao.*;
import models.*;

import java.util.List;

import static org.junit.Assert.*;

public class Sql2oEmployeeDaoTest {
    private static Connection conn;
    private static Sql2oEmployeeDao employeeDao;

    @BeforeClass
    public static void setUp() throws Exception {
        String connectionString = "jdbc:postgresql://localhost:5432/organisational";
        Sql2o sql2o = new Sql2o(connectionString, "moringa", "moringa");
        employeeDao = new Sql2oEmployeeDao(sql2o);
        conn = sql2o.open();
    }

    @After
    public  void tearDown() throws Exception {
        System.out.println("clearing database");
        employeeDao.clearAll();
        conn.close();
    }
    @Test
    public void add() {
        Employee employee = setUpEmployee();
        assertTrue(employeeDao.getAll().contains(employee));
    }

    @Test
    public void getAll() {
        Employee employee = setUpEmployee();
        Employee employee1 = setUpEmployee();
        assertEquals(2,employeeDao.getAll().size());
    }

    @Test
    public void findById() {
        Employee employee = setUpEmployee();
        Employee employee1 = setUpEmployee();
        assertEquals(employee, employeeDao.findById(employee.getId()));
    }

    @Test
    public void getAllEmployeesByDepartment() {
        Employee employee = setUpEmployee();
        List<Employee> allEmployeesByDepartment = employeeDao.getAllEmployeesByDepartment(employee.getDepartment_id());
        assertEquals(employee.getDepartment_id(),allEmployeesByDepartment.get(0).getDepartment_id());
    }

    @Test
    public void deleteById() {
        Employee employee = setUpEmployee();
        Employee employee1 = setUpEmployee();
        assertEquals(2,employeeDao.getAll().size());
        employeeDao.deleteById(employee.getId());
        assertEquals(1,employeeDao.getAll().size());
    }

    @Test
    public void clearAll() {
        Employee employee = setUpEmployee();
        Employee employee1 = setUpEmployee();
        employeeDao.clearAll();
        assertEquals(0,employeeDao.getAll().size());
    }

    //helper
    public Employee setUpEmployee(){
        Employee employee =new Employee ("Daisy","ict manager","In charge of the ict department",1);
        employeeDao.add(employee);
        return employee;
    }
    @AfterClass //changed to @AfterClass (run once after all tests in this file completed)
    public static void shutDown() throws Exception{ //changed to static
        conn.close(); // close connection once after this entire test file is finished
        System.out.println("connection closed");
    }
}