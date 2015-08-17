package test;

import com.company.domain.dto.Role;
import com.company.domain.dto.Villager;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

public class VillagerTest {

    @Test
    public void test_VillagerWithParam(){
        Villager villager = new Villager("firstname", "lastname");

        assertThat(villager.getFirstName(), is("firstname"));
        assertThat(villager.getLastName(), is("lastname"));
        assertThat(villager.getRole(), CoreMatchers.is(Role.VILLAGER));
    }
}