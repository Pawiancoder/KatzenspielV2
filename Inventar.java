
/**
 *
 * @author Maksymilian, Augenringe
 */
public class Inventar {
    private Item[] slots;
    private int size;

    public void Inventory(int size) {
       this.size = size;
       this.slots = new Item[size];
    }
    
    public boolean addItem(Item item) {
        for(int i = 0; i < size; i++) {
            if (slots[i] == null) {
                slots[i] = item;
                return true;

            }
        }
        System.out.println("Dein Inventar ist voll, Item wurde nicht Hinzugefügt! Kauf dir mehr Item Plätze Bozzo");
        return false; //Inventar voll >.<
    }

    public boolean removeItem(int slot) {
        if (slot >= 0 && slot < size && slots[slot] != null) {
            slots[slot] = null;
            return true;
        }
        return false; //Nicht vorhandener Slot || Slot schon leer
        }

        public Item getItem (int slot) {

            return new Item();
        }
    }


            
        

    


