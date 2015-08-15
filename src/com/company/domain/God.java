package com.company.domain;

public class God extends Person{
    public God(String firstName, String lastName) {
        super(firstName, lastName);
        setRole(Role.GOD);
    }
}
