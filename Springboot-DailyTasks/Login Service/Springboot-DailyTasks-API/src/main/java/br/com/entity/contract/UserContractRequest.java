package br.com.entity.contract;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


public class UserContractRequest {

    @NotNull(message = "User ID can't be null")
    private int userId;

    @NotNull(message = "Username can't be null")
    private String username;

    @NotNull(message = "Password can't be null")
    private String password;

    @NotNull(message = "First name can't be null")
    private String firstname;

    @NotNull(message = "Last name can't be null")
    private String lastName;

    @NotNull(message = "Email can't be null")
    private String email;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
