package utils;

/**
 * @author Pawiancoder, Augenringe
 */

/**
 * Waffen-Klasse
 */
public abstract class Waffe {
    private String name;
    private String waffentyp;
    private int schaden;
    private int cooldown; //Waffeneffekt Cooldown

    public Waffe (String name, String waffentyp, int schaden, int cooldown) {
        this.waffentyp = waffentyp;
        this.schaden = schaden;
        this.cooldown = cooldown;
    }

    /**
     * Methode die den Namen der Waffe zurückgibt
     * @return - name
     */
    public String getName () {
        return this.name;
    }

    /**
     * Methode die den Waffentyp zurückgibt
     * @return - Waffentyp
     */
    public String getWaffentyp () {
        return this.waffentyp;
    }

    /**
     * Methode die den Schaden der Waffe zurückgibt
     * @return - Schaden
     */
    public int getSchaden () {
        return this.schaden;
    }

    /**
     * Methode die den Cooldown-Wert zurückgibt
     * @return - Cooldown
     */
    public int getCooldown () {
        return this.cooldown;
    }

}

