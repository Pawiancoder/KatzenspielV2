package tiere;

public class Ente extends Tier {
    /**
     * Konstruktor mit Parametern
     *
     * @param name        - Names des Tiers
     * @param strenght    - Stärke als GZ
     * @param enemie      - true = Gegner, false = kein Gegner
     * @param entity_type - Tierart als String
     */
    public Ente(String name, int strenght, boolean enemie, String entity_type) {
        super(name, strenght, enemie, entity_type);
    }
}
