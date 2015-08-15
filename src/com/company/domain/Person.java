package com.company.domain;

public abstract class Person {
    private String firstName;
    private String lastName;
    private Role role;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Role getRole(){
        return this.role;
    }


    protected void setRole(Role role){
        this.role = role;
    }
}
