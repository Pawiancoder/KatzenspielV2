package utils;

/**
 * @author Pawiancoder, Augenringe
 */

public class Waffe {
    private String name;
    private String waffentyp;
    private int schaden;
    private int cooldown; //Waffeneffekt Cooldown

    public Waffe (String name, String waffentyp, int schaden, int cooldown) {
        this.waffentyp = waffentyp;
        this.schaden = schaden;
        this.cooldown = cooldown;
    }

    public String getName () {
        return this.name;
    }
}

