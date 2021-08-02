package topics.oop_demo.inheritance_demo;

public class MyMain {

    public static void main(String[] args) {

        Human h = new Human(34, 5.9f, 205.0f, "Wasin", "Rice", true, 123-45-6789, "English", "Java Developer");

        Animal a = new Animal(5, 1.4f, 12.5f, "Pepsi", "Dog food", true, "Dog", "Blue");

        System.out.println("----------");

        h.printWhoIAm();

        System.out.println("----------");

        a.printWhoIAm();

    }
}
