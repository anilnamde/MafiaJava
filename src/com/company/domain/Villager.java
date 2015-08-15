package com.company.domain;

public class Villager extends Person{
    private Role role = null;

    public Villager(String firstName, String lastName) {
        super(firstName, lastName);
        role = Role.VILLAGER;
    }

    public Role getRole() {
        return role;
    }
}
