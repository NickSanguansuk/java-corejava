package topics.oop_demo.inheritance_demo;

public class NonLivingThing extends Thing {
    // Data
    protected String material;
    protected String usage;

    // Constructors
    public NonLivingThing(int age, float height, float weight, String material, String usage) {
        super(age, height, weight);
        this.material = material;
        this.usage = usage;
    }

    // Methods
    @Override
    public void saySomething() {
        System.out.println("CCC");
    }

    @Override
    protected void printWhoIAm() {
        super.printWhoIAm();
        System.out.println("I am a NonLivingThing.");
    }

}
