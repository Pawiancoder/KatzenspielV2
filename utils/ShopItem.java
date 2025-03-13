package utils;

public class ShopItem {
    private String itemName;
    private int value;
    private int price;


    public ShopItem (String itemName, int value, int price) {
        this.itemName = itemName;
        this.value = value;
        this.price = price;
    }

    public String getItemName () {
        return this.itemName;
    }

    public int getValue () {
        return this.value;
    }

    public int getPrice () {
        return this.price;
    }
}
