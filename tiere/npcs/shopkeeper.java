package tiere.npcs;

import tiere.Tier;
import utils.ShopItem;

import java.util.ArrayList;

public class shopkeeper extends Tier {
    private String shop_type;
    private ArrayList<ShopItem> itemListe = new ArrayList<ShopItem>(); //liste zum Items speichern
    /**
     * Konstruktor mit Parametern
     *
     * @param name        - Names des Tiers
     * @param strenght    - Stärke als GZ
     * @param enemie      - true = Gegner, false = kein Gegner
     * @param entity_type - Tierart als String
     */
    public shopkeeper(String name, int strenght, boolean enemie, String entity_type) {
        super(name, strenght, enemie, entity_type);
    }
}
