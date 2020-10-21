package com.example.PhotoAppApiUser.shared;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class UserDto implements Serializable {



    private String userId;

    @NotNull(message = "First name cannot be null")
    @Size(min=2, message = "First name must not be less than 2 characters")
    private String firstName;

    @NotNull(message = "Last name cannot be null")
    @Size(min=2, message = "Last name must not be less than 2 characters")
    private String lastName;

    @NotNull(message = "Password cannot be null")
    @Size(min=8, max=16, message = "Password must not be equal and greater than 8 and less than 16 characters")
    private String password;

    private String encrytedPassword;


    @NotNull(message = "Email cannot be null")
    @Email
    private String email;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEncrytedPassword() {
        return encrytedPassword;
    }

    public void setEncrytedPassword(String encrytedPassword) {
        this.encrytedPassword = encrytedPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
