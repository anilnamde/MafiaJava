package com.company.domain;

/**
 * Created by anilnamde on 14/08/15.
 */
public class God extends Villager{
    public God(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public God() {
        setRole(Role.GOD);
    }
}
