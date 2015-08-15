package com.company.test;

import com.company.domain.Cop;
import com.company.domain.Role;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CopTest {
    @Test
    public void test_CopTest(){
        Cop cop = new Cop("firstName", "lastName");
        assertThat(cop.getFirstName(), is("firstName"));
        assertThat(cop.getLastName(), is("lastName"));
        assertThat(cop.getRole(), Matchers.is(Role.COP));
    }
}