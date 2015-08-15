package com.company.domain;

public class Mafia extends Person {

    public Mafia(String firstName, String lastName) {
        super(firstName, lastName);
        super.setRole(Role.MAFIA);
    }
}

