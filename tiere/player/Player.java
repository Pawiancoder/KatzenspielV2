package tiere.player;

import utils.Inventar;

public class Player {
    private String username;
    private int level;
    private int experience;
    private Inventar inventar;
    private int money;

    public Player (String username) {
        this.username = username;
        this.level = 1;
        this.experience = 0;
        this.inventar = new Inventar(5); //Am anfang 5 Inventar-Slots
    }

    public String getUsername () {
        return this.username;
    }

    public int getLevel () {
        return this.level;
    }

    public int getExperience () {
        return this.experience;
    }

    //TODO: Inventar abfragen nach Item

    public int getMoney () {
        return this.money;
    }
}
