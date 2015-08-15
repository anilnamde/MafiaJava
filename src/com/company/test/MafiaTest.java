package com.company.test;

import com.company.domain.Mafia;
import com.company.domain.Role;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MafiaTest {
    private Role role = null;

    public void test_Mafia(){
        Mafia mafia = new Mafia("firstName", "lastName");
        assertThat(mafia.getRole(), is(Role.MAFIA));
        assertThat(mafia.getFirstName(), is("firstName"));
        assertThat(mafia.getLastName(), is("lastName"));

    }
}