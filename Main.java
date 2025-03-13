import tiere.Hund;
import tiere.Katze;

public class Main {
    public static void main(String[] args) {
        Katze katze = new Katze("HARRALD", 2, false, "Katze");
        Hund hund = new Hund("Günter", 1, true, "Hund");

        String ergebnis = katze.kaempfen(hund);
        System.out.println(ergebnis);
    }
}
