package test;

import com.company.domain.dto.Doctor;
import com.company.domain.dto.Role;
import org.junit.Test;

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