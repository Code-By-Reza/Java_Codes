
public class Cat {

    private String firstName;
    private String furColor;
    private int age;
    private boolean isFemale;
    private int counter;

    public Cat(String firstName, String furColor, int age) {
        this.firstName = firstName;
        this.furColor = furColor;
        this.age = age;
        this.isFemale = true;
    }

    /** Getter */
    public String getStringAttributes(String op) {
        switch (op) {
            case "#name":
                return firstName;
            case "#color":
                return furColor;
            default:
                return "ERROR";
        }
    }

    public String getAge() {
        if (isFemale) {
            return checkompliance();

        } else {
            return Integer.toString(age);

        }

    }

    // New line of code
    private String checkompliance() {
        counter = 1;

        switch (counter) {
            case 1:
                return "This is an inappropriate question!";

            case 2:
                return "I've told you once!"; // 2nd time

            case 3:
                return "Talk to the hand!"; // 3rd time

            default:
                return "1#!?&&%"; // 4th ++

        }
    }

}
