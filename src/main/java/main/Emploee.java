package main;

import java.util.Date;

public class Emploee {
    private int id;
    private String name, role;
    private Date insertTime;

    public Emploee(int id, String name, String role, Date insertTime) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.insertTime = insertTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getDate() {
        return insertTime;
    }

    public void setDate(Date date) {
        this.insertTime = date;
    }
}
