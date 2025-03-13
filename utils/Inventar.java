package utils;

public class Inventar extends Item {
    private Item[] slots;
    private int size;

    public Inventar(int size) {
        this.size = size;
        this.slots = new Item[size];
    }

    public boolean addItem(Item item) {
        for (int i = 0; i < size; i++) {
            if(slots[i] == null) {
                slots[i] = item;
                return true;
            }
        }
        System.out.println("Dein Inventar ist voll Item wurde nicht Hinzugefügt! Kauf dir mal ne größere Tasche im Shop yeah >.<");
        return false; //Inventar voll
    }
}
