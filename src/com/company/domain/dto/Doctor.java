package com.company.domain.dto;

public class Doctor extends Person {
    public Doctor(String firstName, String lastName) {
        super(firstName, lastName);
        setRole(Role.DOCTOR);
    }
}
