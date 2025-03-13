// Package not detected, please report project structure on CodeTogether's GitHub Issues
public class Main {
    public static void main(String[] args) {
        Katze katze = new Katze("HARRALD", 1, false, "Katze");
        Hund hund = new Hund("Günter", 1, true, "Hund");


       String result = katze.kaempfen(hund);
       System.out.println(result);
    }

}
