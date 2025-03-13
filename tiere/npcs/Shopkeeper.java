package tiere.npcs;

import utils.ShopItem;
import java.util.ArrayList;

public class Shopkeeper {
    private String name;
    private String shop_type;
    private ArrayList<ShopItem> itemListe = new ArrayList<ShopItem>(); //liste zum Items speichern
    /**
     * Konstruktor mit Parametern
     *
     * @param name        - Names des Tiers
     */
    public Shopkeeper(String name, String shop_type, ArrayList<ShopItem> itemListe) {
        this.name = name;
        this.shop_type = shop_type;
        this.itemListe = itemListe;
    }

    public String getShop_type () {
        return this.shop_type;
    }

    @Override //Überschreibt toString der oberen "Mutterklasse"
    public String toString () {
        String text = "Preisliste:" + System.lineSeparator() + System.lineSeparator();
        for (ShopItem item : itemListe) {
            text += "- " + item.getItemName() + " - " + item.getPrice() + "Katzenmünzen" + System.lineSeparator();
        }
        return text;
    }
}
