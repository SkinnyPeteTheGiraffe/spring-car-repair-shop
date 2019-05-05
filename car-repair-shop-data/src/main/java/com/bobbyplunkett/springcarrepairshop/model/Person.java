package com.bobbyplunkett.springcarrepairshop.model;

/**
 * A model which represents the structure of a person
 * and their attributes as a data object.
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/4/2019
 */
public class Person {
    private String firstName;
    private String lastName;

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
