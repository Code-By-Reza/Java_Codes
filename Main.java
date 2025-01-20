import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Function(Methode)

        // greeting(); // Aufruf der Mrthode (M1)

        // addiere(5, 15); // Aufruf der Mrthode mit zwei Zahlen (M2)

        // int ergebnis = multipliziere(4, 5); // Aufruf mit zwei Zahlen (M3)
        // System.out.println("Das ergebnis ist: " + ergebnis + "\n"); // (M3)

        Date now = new Date();
        System.out.println("\nHeute ist: " + now + "\n");

        // function (message)
        String message = ("Hello\" World!\""); // Aufruf der Methode (message)
        System.out.println(message);
        System.out.println(message.endsWith("!"));
        System.out.println(message.indexOf("W"));
        System.out.println(message.replace("!", "*"));
        System.out.println(message.trim());
        System.out.println(message.length());
        

    }

    // Methode definiert(M1)
    // public static void greeting() {
    // System.out.println("\nHallo! Willkommen bei Java.\n");
    // }

    // // Methode mit zwei Parametern definiert(M2)
    // public static void addiere(int zahl1, int zahl2) {
    // int sume = zahl1 + zahl2;
    // System.out.println("Die Sume ist: " + sume + "\n");
    // }

    // // Methode mit Rückgabewert(M3)
    // public static int multipliziere(int a, int b) {
    // return a * b; // Gibt das Produkt zurück

    // }

   
    

}
