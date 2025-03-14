package utils.items.Waffen;

public class Schwert extends Waffe {


    /**
     * Konstruktor für die Waffe
     *
     * @param name      - Name der Waffe
     * @param schaden   - Schaden der Waffe pro Schlag/Schuss
     * @param cooldown  - Cooldown der Waffe
     */
    public Schwert(String name, int schaden, int cooldown) {
        super(name, "Schwert", schaden, cooldown);
    }
}

