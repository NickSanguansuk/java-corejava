package topics.oop_programming.inheritance.demo1;

public class Human extends LivingThing {
    // Data
    private int ssn;
    private String language;
    private String occupation;

    // Constructors
    public Human(int age, float height, float weight, String name, String food, boolean bVision, int ssn, String language, String occupation) {
        super(age, height, weight, name, food, bVision);
        this.ssn = ssn;
        this.language = language;
        this.occupation = occupation;
    }

    // Methods
    @Override
    public void saySomething() {
        System.out.println("DDD");
    }

    @Override
    public void printWhoIAm() {
        super.printWhoIAm();
        System.out.println("I am a Human.");
    }

}
