package models;

import java.util.Objects;

public class User {
    private String username;
    private String position;
    private int departmentId;
    private String role; //admin or user
    private int id;

    public User(String username, String position, int departmentId, String role) {
        this.username = username;
        this.position = position;
        this.departmentId = departmentId;
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return departmentId == user.departmentId && id == user.id && username.equals(user.username) && position.equals(user.position) && role.equals(user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, position, departmentId, role, id);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
