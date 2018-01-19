package br.com.entity;

import javax.persistence.Entity;

@Entity
public class User {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private int userId;

    public User(String firstName, String lastName, String username, String password, String email, int userId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getUserId() {
        return userId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
