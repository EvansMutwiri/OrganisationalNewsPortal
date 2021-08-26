package dao;

import models.Department;
import org.junit.*;
import org.sql2o.Sql2o;
;
import org.sql2o.Connection;

import static org.junit.Assert.*;

public class Sql2oDepartmentDaoTest {
    private static Connection conn;
    private static Sql2oDepartmentDao departmentDao;

    @BeforeClass
    public static void setUp() throws Exception {
        String connectionString = "jdbc:postgresql://localhost:5432/organisational";
        Sql2o sql2o = new Sql2o(connectionString, "moringa", "moringa");
        departmentDao = new Sql2oDepartmentDao(sql2o);
        conn = sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("clearing database");
        departmentDao.clearAll();
        conn.close();
    }

    @Test
    public void add() {
        Department department = setupDepartment();
        assertTrue(departmentDao.getAll().contains(department));
    }

    @Test
    public void getAll() {
        Department department = setupDepartment();
        Department department1= setupDepartment();
        assertEquals(2,departmentDao.getAll().size());
    }

    @Test
    public void findById() {
        Department department1 = setupDepartment();
        assertEquals(department1, departmentDao.findById(department1.getId()));
    }



    @Test
    public void deleteById() {
        Department department = setupDepartment();
        Department department1= setupDepartment();
        assertEquals(2,departmentDao.getAll().size());
        departmentDao.deleteById(department.getId());
        assertEquals(1,departmentDao.getAll().size());
    }

    @Test
    public void clearAll() {
        Department department = setupDepartment();
        Department department1= setupDepartment();
        departmentDao.clearAll();
        assertEquals(0, departmentDao.getAll().size());
    }

    public Department setupDepartment(){
        Department department= new Department("ICT", "ict support", 15);
        departmentDao.add(department);
        return department;
    }

    @AfterClass //changed to @AfterClass (run once after all tests in this file completed)
    public static void shutDown() throws Exception{ //changed to static
        conn.close(); // close connection once after this entire test file is finished
        System.out.println("connection closed");
    }
}