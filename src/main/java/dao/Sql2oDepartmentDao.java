package dao;

import models.Department;
import models.News;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;
import java.util.List;

public class Sql2oDepartmentDao implements DepartmentDao {
    private final Sql2o sql2o;

    public Sql2oDepartmentDao(Sql2o sql2o) { this.sql2o = sql2o; }

    @Override
    public void add(Department department) {

    }

    @Override
    public void add(News news) {

    }

    @Override
    public List<News> getAll() {
        return null;
    }

    @Override
    public Department findById(int id) {
        return null;
    }

    @Override
    public void update(int id, String name, String address, String zipcode, String phone, String website, String email) {

    }


}