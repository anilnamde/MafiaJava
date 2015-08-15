package com.company.domain;

public class Villager extends Person{
    public Villager(String firstName, String lastName) {
        super(firstName, lastName);
        setRole(Role.VILLAGER);
    }
}
