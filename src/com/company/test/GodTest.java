package com.company.test;

import com.company.domain.God;
import com.company.domain.Role;
import com.company.domain.Villager;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class GodTest {
    @Test
    public void test_God(){
        God god = new God("firstName", "lastName");
        assertThat(god.getFirstName(), is("firstName"));
        assertThat(god.getLastName(), is("lastName"));
        assertThat(god.getRole(), is(Role.GOD));
    }
}