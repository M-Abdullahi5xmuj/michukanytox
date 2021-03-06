package com.appsmontreal.fragmentswithviewpager.Model;

public class User {
    private String email;
    private String firstName;
    private String lastName;

    public User(String email, String firstName, String lasteName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lasteName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        return email + '\n' + firstName + lastName;

    }
}
