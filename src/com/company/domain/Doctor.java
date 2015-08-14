package com.company.domain;

public class Doctor extends Villager {
    public Doctor() {
        setRole(Role.DOCTOR);
    }

    public Doctor(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
