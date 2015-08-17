package com.company.domain.dto;

public class Mafia extends Person {

    public Mafia(String firstName, String lastName) {
        super(firstName, lastName);
        setRole(Role.MAFIA);
    }
}

