
public class App {
    public static void main(String[] args) {
        System.out.println("\nHello world!🙌\n");

        /*
         * Instanziierung --> Erzeugen eines Objektes
         * Objekt <---> Instanz
         * cat --> Referenzvariable
         * Cat --> Referenztyp(Klasse)
         * 
         */

        Cat cat = new Cat("Oskar", "Rot", 2);

        // output("\nBlick von aussen: " + cat);
        // output("\nBlick von innen : " + cat.getInstanceVariable());
        // cat.getInstanceVariable();

        // cat.furColor = "Gold";

        // // werte zuweisen
        // cat.firstName = "\nOskar";
        // // cat.furColor = "Rot";
        // cat.age = 2;

        // Werte audgeben
        output(cat.getFirstName());
        output(cat.getFurColor());
        output(Integer.toString(cat.getAge()));

         output("__________________________\n");

       

    }

    public static void output(String ouString) {
        System.out.println(ouString);
    }

}
