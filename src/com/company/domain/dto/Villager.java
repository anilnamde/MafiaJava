package com.company.domain.dto;

public class Villager extends Person{
    public Villager(String firstName, String lastName) {
        super(firstName, lastName);
        setRole(Role.VILLAGER);
    }
}
