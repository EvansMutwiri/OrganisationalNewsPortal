package models;

import java.util.Objects;

public class Department {
    private String name;
    private String description;
    private int noEmployees;
    private int id;

    public Department(String name, String description, int noEmployees) {
        this.name = name;
        this.description = description;
        this.noEmployees = noEmployees;
    }

    public String getName() {
        return name;
    }

    public int getNoEmployees() {
        return noEmployees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNoEmployees(int noEmployees) {
        this.noEmployees = noEmployees;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return noEmployees == that.noEmployees && id == that.id && name.equals(that.name) && description.equals(that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, noEmployees, id);
    }

    public void setId(int id) {
        this.id = id;
    }
}
