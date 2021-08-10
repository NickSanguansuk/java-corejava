package topics.functional_programming.demo2;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------");
        System.out.println("Object-oriented programming ---> Pig");
        System.out.println("Functional programming ---> Cat, Tiger, Elephant");

        // Pig
        Animal pig = new Pig();

        // Cat
        Animal cat = new Animal() {
            @Override
            public String cry(String sound) {
                return "Cat: " + sound;
            }
        };

        // Tiger
        Animal tiger = (sound) -> { return "Tiger: " + sound; };

        // Elephant
        Animal elephant = sound -> "Elephant: " + sound;

        System.out.println("----------");
        System.out.println("Calling Animals");

        System.out.println(pig.cry("oink oink"));
        System.out.println(cat.cry("meow meow"));
        System.out.println(tiger.cry("roar roar"));
        System.out.println(elephant.cry("pan pan"));

        System.out.println("----------");
    }
}
