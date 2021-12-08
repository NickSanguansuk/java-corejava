package topics.oop_programming.inheritance.demo1;

public class Animal extends LivingThing {
    // Data
    private String type;
    private String color;

    // Constructors

    public Animal(int age, float height, float weight, String name, String food, boolean bVision, String type, String color) {
        super(age, height, weight, name, food, bVision);
        this.type = type;
        this.color = color;
    }

    // Methods
    @Override
    public void saySomething() {
        System.out.println("EEE");
    }

    @Override
    public void printWhoIAm() {
        super.printWhoIAm();
        System.out.println("I am an Animal.");
    }

}
