
public class App {
    public static void main(String[] args) {
        // System.out.println("\nHello world!\n");
        
        /*
         * Instanziierung --> Erzeugen eines Objektes
         * Objekt <---> Instanz
         * cat --> Referenzvariable
         * Cat --> Referenztyp(Klasse)
         * 
         */
        // output("Hello everyone!🙌\n");
        Cat cat = new Cat();
        // output("\nBlick von aussen: " + cat);
        // output("\nBlick von innen : " + cat.getInstanceVariable());
        // cat.getInstanceVariable();


        // werte zuweisen
        cat.firstName = "\nOskar";
        cat.forcColor = "Rot";
        cat.age = 2;


        // Werte audgeben
        output(cat.firstName);
        output(cat.forcColor);
        output(Integer.toString(cat.age));

        //  output("__________________________\n");

        // Cat cat2 = new Cat();
        // output("Blick von aussen: " + cat2);
        // output("\nBlick von innen : " + cat.getInstanceVariable());
        // cat2.getInstanceVariable();

         output("__________________________\n");

    }

    public static void output(String ouString) {
        System.out.println(ouString);
    }

}
