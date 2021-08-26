package models;

public class User {
    private String username;
    private String position;
    private String department;
    private String role; //admin or user
    private int id;

    public User(String username, String position, String department, String role) {
        this.username = username;
        this.position = position;
        this.department = department;
        this.role = role;
    }
}
