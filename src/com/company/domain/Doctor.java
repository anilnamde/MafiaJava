package com.company.domain;

public class Doctor extends Person {
    public Doctor(String firstName, String lastName) {
        super(firstName, lastName);
        setRole(Role.DOCTOR);
    }
}
