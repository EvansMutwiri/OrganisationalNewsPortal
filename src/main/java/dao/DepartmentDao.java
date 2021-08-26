package dao;

import models.Department;
import models.News;

import java.util.List;

public interface DepartmentDao {

    //create
    void add (Department department);
    // void addDepartmentNews(Department department, News news)

    void add(News news);

    //read
    List<News> getAll();
    Department findById(int id);
    // List<News> getAllNewsForADepartment(int departmentId);

    //update
    void update(int id, String name, String address, String zipcode, String phone, String website, String email);

    List<News> getAllNewssByDepartment(int departmentId);

    //delete
    void deleteById(int id);
    void clearAll();
}