package com.company.test;

import com.company.domain.Doctor;
import com.company.domain.Role;
import com.company.domain.Villager;
import org.junit.Test;

import javax.print.Doc;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DoctorTest {

    @Test
    public void test_Doctor() throws Exception {
        Doctor doc = new Doctor("firstName", "lastName");
        assertThat(doc.getRole(), is(Role.DOCTOR));
        assertThat(doc.getFirstName(), is("firstName"));
        assertThat(doc.getLastName(), is("lastName"));
    }
}