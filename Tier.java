/**
 * Tier-Klasse - Damit werden alle Tiere erstellt
 *
 */
public abstract class Tier { //Abstract => Klasse kann nicht instanziert werden
    private String name; //Name des Tieres
    private int level; //Level
    private int strenght; //stärke des Tieres
    private int xp_amount; //Menge an XP (für Levelup ggf)
    private boolean enemie; //Gegner oder Spieler
    private String entity_type;

    /**
     * Konstruktor mit Parametern
     * @param name - Names des Tiers
     * @param strenght - Stärke als GZ
     * @param enemie - true = Gegner, false = kein Gegner
     * @param entity_type - Tierart als String
     */
    public Tier (String name, int strenght, boolean enemie, String entity_type) {
        this.name = name;
        this.strenght = strenght;
        this.enemie = enemie;
        this.entity_type = entity_type;
    }

    /**
     * gibt den Namen des Tiers zurück
     * @return - name
     */
    public String getName () {
        return this.name;
    }

    /**
     * setzt den Namen (z.b. zum ändern)
     * @param name - name
     */
    public void setName (String name) {
        this.name = name;
    }

    /**
     * gibt die Kampfkraft/Stärke zurück
     * @return - Kampfkraft
     */
    public int getStrenght () {
        return this.strenght;
    }

    /**
     * gibt zurück ob das Tier ein Gegner oder kein Gegener ist
     * @return - true = Gegener, false = kein Gegner (Spieler)
     */
    public boolean isEnemie () {
        return this.enemie;
    }

    /**
     * gibt die Tierart als Text zurück
     * @return - Tierart
     */
    public String getEntity_type () {
        return this.entity_type;
    }

    /**
     * kampffunktion für jedes Tier - lässt jedes Tier gegen ein anderes Kämpfen und das stärkere Tier gewinnt
     * @param gegner
     * @return
     */
    public boolean kaempfen (Tier gegner) {
        boolean result = false;
        if (this.getStrenght() > gegner.getStrenght()) result = true;

        return result;
    } 
}
