package topics.oop_demo.encapsulation_demo;

public class MyMain {

    public static void main(String[] args) {

        // default constructor only exists when there is no other constructor
        //Animal animal1 = new Animal(); // Cannot

        Animal animal2 = new Animal("Gus", "Dog", 40, "Brown");

        Animal animal3 = new Animal("Cat");

        animal3.setAnimalName("Pinky");

        System.out.println(animal2.getAnimalName());
        System.out.println(animal3.getAnimalName());

        System.out.println("----------");

        Service service = new Service();
        service.serviceNamedAnimalGenos(animal2);

        System.out.println(animal2.getAnimalName());
        System.out.println(animal3.getAnimalName());

        System.out.println("----------");


    }
}
