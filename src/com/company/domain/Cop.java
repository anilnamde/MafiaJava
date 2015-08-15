package com.company.domain;

public class Cop extends Person{
    private Role role = null;

    public Cop(String firstName, String lastName) {
        super(firstName, lastName);
        role = Role.COP;
    }

    public Role getRole(){
        return this.role;
    }
}
