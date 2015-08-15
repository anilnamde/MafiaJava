package test;

import com.company.domain.Game;
import com.company.domain.Person;
import com.company.domain.Villager;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class GameTest {
    private Game game= null;

    @Test
    public void test_Game(){
        Game game = new Game();
    }

    @Test
    public void test_addPlayer(){
//        Villager villager = new Villager("first", "last");
//
//        assertThat(game.getPlayers().size(), is(0));
//        game.addPlayer(villager);
//        assertThat(game.getPlayers().size(), is(1));
//        assertThat(game.getPlayers().get(0).getFirstName(), is("first"));
//        assertThat(game.getPlayers().get(0).getLastName(), is("last"));
//        assertThat(game.getPlayers().get(0).getRole(), is("last"));

    }

    @Before
    public void setup() {
        this.game = new Game();
    }
}