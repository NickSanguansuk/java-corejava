package topics.oop_demo.inheritance_demo;

public class Thing {
    // Data
    protected int age;
    protected float height;
    protected float weight;

    // Constructors
    public Thing(int age, float height, float weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // Methods
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    // Testing methods

    // Methods declared public in a superclass also must be public in all subclasses.
    public void saySomething() {
        System.out.println("AAA");
    }

    // Methods declared protected in a superclass must either be protected or public in subclasses; they cannot be private.
    protected void printWhoIAm() {
        this.sayAnotherThing();
        System.out.println("I am a Thing.");
    }

    // Methods declared private are not inherited at all, so there is no rule for them.
    private void sayAnotherThing() {
        System.out.println("I am very happy.");
    }

}
