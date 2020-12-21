package model;

import java.io.Serializable;

/* Business Model Class User
* Author: Muhammad Shafique
* Date: November 5, 2019
*/

public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String email;

    public User() {
        email = "";
        firstName = "";
        lastName = "";
    }

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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
}