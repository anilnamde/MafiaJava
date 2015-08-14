package com.company.domain;

public class Cop extends Villager{
    public Cop(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Cop() {
        setRole(Role.COP);
    }
}
