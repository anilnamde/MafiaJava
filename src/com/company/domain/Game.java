package com.company.domain;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Person> players= null;

    public Game(){
        players = new ArrayList<Person>();
    }

    public List<Person> getPlayers() {
        return players;
    }

    public void addPlayer(Villager villager) {

    }
}
