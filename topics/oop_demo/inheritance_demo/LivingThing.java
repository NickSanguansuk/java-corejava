package topics.oop_demo.inheritance_demo;

public class LivingThing extends Thing {
    // Data
    protected String name;
    protected String food;
    protected boolean bVision;

    // Constructors
    public LivingThing(int age, float height, float weight, String name, String food, boolean bVision) {
        super(age, height, weight);
        this.name = name;
        this.food = food;
        this.bVision = bVision;
    }

    // Methods
    @Override
    public void saySomething() {
        System.out.println("BBB");
    }

    @Override
    protected void printWhoIAm() {
        super.printWhoIAm();
        System.out.println("I am a LivingThing.");
    }



}
