package com.company.test;

import com.company.domain.Person;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void test_Person(){
        Person person = new Person("firstName", "lastName");
        assertThat(person.getFirstName(), is("firstName"));
        assertThat(person.getLastName(), is("lastName"));
    }
}