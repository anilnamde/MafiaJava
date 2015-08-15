package com.company.domain;

public class Cop extends Person{
    public Cop(String firstName, String lastName) {
        super(firstName, lastName);
        setRole(Role.COP);
    }
}
