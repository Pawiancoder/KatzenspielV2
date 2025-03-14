package utils.Enchantments;

public abstract class Enchantment {
    private String name;
    private String description;
    private int damageMultiplier;
    private int levelCost;
    private int levelMultiplier;

    /**
     * Konstruktor für das Enchantment
     * @param name - Name der Verzauberung
     * @param description - Beschreibung der Verzauberung
     * @param damageMultiplier - Schaden Multiplier
     * @param levelCost - Kosten an Leveln zum verzaubern
     * @param levelMultiplier - Levelmultiplier
     */
    public Enchantment(String name, String description, int damageMultiplier, int levelCost, int levelMultiplier) {
        this.name = name;
        this.description = description;
        this.damageMultiplier = damageMultiplier;
        this.levelCost = levelCost;
        this.levelMultiplier = levelMultiplier;
    }
}
