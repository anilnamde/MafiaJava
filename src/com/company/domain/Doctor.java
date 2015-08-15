package com.company.domain;

public class Doctor extends Person {
    private Role role = null;

    public Doctor(String firstName, String lastName) {
        super(firstName, lastName);
        role = Role.DOCTOR;
    }

    public Role getRole() {
        return role;
    }
}
