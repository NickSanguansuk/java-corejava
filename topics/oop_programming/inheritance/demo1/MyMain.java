package topics.oop_programming.inheritance.demo1;

public class MyMain {

    public static void main(String[] args) {

        Human human1 = new Human(34, 5.9f, 205.0f, "Wasin", "Rice", true, 123-45-6789, "English", "Java Developer");

        Animal animal1 = new Animal(5, 1.4f, 12.5f, "Pepsi", "Dog food", true, "Dog", "Blue");

        LivingThing living1 = new Animal(6, 1.2f, 15.8f, "Kola", "Cat food", true, "Cat", "Yellow");

        System.out.println("----------");

        human1.printWhoIAm();
        human1.saySomething();

        System.out.println("----------");

        animal1.printWhoIAm();
        animal1.saySomething();

        System.out.println("----------");

        living1.printWhoIAm();
        living1.saySomething();

        System.out.println("----------");

        System.out.println(human1 instanceof Human);
        System.out.println(human1 instanceof LivingThing);
        System.out.println(human1 instanceof Thing);
        System.out.println(human1 instanceof Object);

        System.out.println("----------");



    }
}
