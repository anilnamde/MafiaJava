package com.company.domain;

public class Mafia extends Villager {
    private Role role = null;

    public Mafia(String firstName, String lastName) {
        super(firstName, lastName);
        role = Role.MAFIA;
    }

    @Override
    public Role getRole() {
        return role;
    }
}

