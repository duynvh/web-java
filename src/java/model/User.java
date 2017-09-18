/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author nguye
 */
public class User {
    private int id;
    private String name;
    private String password;
    private String description;
    private int role;

    public User() {
    }

    public User(int id, String name, String password, String description, int role) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.description = description;
        this.role = role;
    }

    public User(String name,String password, String description, int role) {
        this.name = name;
        this.password = password;
        this.description = description;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
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

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
    
}
