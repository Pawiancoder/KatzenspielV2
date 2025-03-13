import tiere.Hund;
import tiere.Katze;
import tiere.npcs.Shopkeeper;
import utils.ShopItem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Katze katze = new Katze("HARRALD", 2, false, "Katze");
        Hund hund = new Hund("Günter", 1, true, "Hund");
        ArrayList<ShopItem> items = new ArrayList<>();
        ShopItem item1 = new ShopItem("Apfel", 5, 5);
        items.add(item1);
        Shopkeeper shopkeeper = new Shopkeeper("Hans", "Potions", items);

        System.out.println(shopkeeper.toString());
    }
}
