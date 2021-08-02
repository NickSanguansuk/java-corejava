package topics.oop_demo.inheritance_demo;

public class Laptop extends NonLivingThing {
    // Data
    private String laptopBrand;
    private String cpu;

    // Constructors
    public Laptop(int age, float height, float weight, String material, String usage, String laptopBrand, String cpu) {
        super(age, height, weight, material, usage);
        this.laptopBrand = laptopBrand;
        this.cpu = cpu;
    }

    // Methods
    @Override
    public void saySomething() {
        System.out.println("FFF");
    }

    @Override
    public void printWhoIAm() {
        super.printWhoIAm();
        System.out.println("I am a Laptop.");
    }
}
