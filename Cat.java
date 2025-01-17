public class Cat {

    // public void getInstanceVariable() {
    // App.output("Objektadresse: " + this);
    // }

    private String firstName;
    private String furColor;
    private int age;

    public Cat(String firstName, String furCooler, int age) {
        this.firstName = firstName;
        this.furColor = furCooler;
        this.age = age;
    }



    public Cat getInstanceVariable() {
        return this;
    }

    /*
     * Getter
     */

    public String getFirstName() {
        return firstName;
    }



    public String getFurColor() {
        return furColor;
    }



    public int getAge() {
        return age;
    }
}