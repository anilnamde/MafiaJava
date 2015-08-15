package com.company.domain;

public class God extends Villager{
    private Role role = null;

    public God(String firstName, String lastName) {
        super(firstName, lastName);
        role = Role.GOD;
    }

    public Role getRole(){
        return role;
    }
}
