// Initialisierung mithilfe eines Konstruktors
// Konstruktor ist eine spezielle Methode, die beim Erzeugen eines Objekt aufgerufen wird
// Konstruktor hat keinen Rückgabewert
// Konstruktor hat den gleichen Namen wie die Klasse
// Konstruktor wird mit dem Schlüsselwoet new aufgerufen
// Konstruktor kann Parameter haben
// Konstruktor kann überladen werden
// konstruktor kann private, protected, public oder default sein

public class Person {
    int age;
    double height;

    // Konstruktor zur Initialisierung
    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // Initialisierung mit Konstruktor

    public static void main(String[] args) {
        Person person = new Person("Reza", 43, 1.80);
        System.out.println("\nName: " + person.name);
        System.out.println("\nAge: " + person.age);
        System.out.println("\nHeight: " + person.height + "\n");

    }

}
