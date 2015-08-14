package com.company.domain;

public class Mafia extends Villager {
    public Mafia() {
        setRole(Role.MAFIA);
    }

    public Mafia(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
