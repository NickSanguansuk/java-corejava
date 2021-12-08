package topics.oop_programming.inheritance.demo1;

public class Car extends NonLivingThing {
    // Data
    private String carBrand;
    private String engine;

    // Constructors
    public Car(int age, float height, float weight, String material, String usage, String carBrand, String engine) {
        super(age, height, weight, material, usage);
        this.carBrand = carBrand;
        this.engine = engine;
    }

    // Methods
    @Override
    public void saySomething() {
        System.out.println("GGG");
    }

    @Override
    public void printWhoIAm() {
        super.printWhoIAm();
        System.out.println("I am a Car.");
    }

}
