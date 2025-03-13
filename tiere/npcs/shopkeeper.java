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
    public shopkeeper(String name, int strenght, boolean enemie, String entity_type, String shop_type, ArrayList<ShopItem> itemListe) {
        super(name, strenght, enemie, entity_type);
        this.shop_type = shop_type;
        this.itemListe = itemListe;
    }

    public String getShop_type () {
        return this.shop_type;
    }

    @Override
    public String toString () {
        String text = "Preisliste: \n \n";
        for (ShopItem item : itemListe) {
            text += "- " + item.getItemName() + " - " + item.getPrice() + "Katzenmünzen\n";
        }
        return text;
    }
}
