package topics.functional_programming.demo2;

import java.util.function.Function;

public class AnimalFarm {

    //public String sayHello(Animal animal, String sound) {
    //    return animal.cry(sound);
    //}
    // ----------
    public String sayHello(Function<String, String> function, String sound) {
        return function.apply(sound);
    }

    public static void main(String[] args) {

        AnimalFarm animalFarm = new AnimalFarm();

        //Animal tiger = (sound) -> "Hi, Tiger: " + sound;
        //System.out.println(animalFarm.sayHello(tiger, "Roars Roars"));
        // ----------
        //class Doggy implements Function<String, String> {
        //    public String apply(String t) {
        //        return "Hi, Doggy: " + t;
        //    }
        //}
        //Doggy doggy = new Doggy();
        //System.out.println(animalFarm.sayHello(doggy, "Barks Barks"));
        // ----------
        //Function<String, String> doggy = new Function<>() {
        //    @Override
        //    public String apply(String t) {
        //        return "Hi, Doggy: " + t;
        //    }
        //};
        //System.out.println(animalFarm.sayHello(doggy, "Barks Barks"));
        // ----------
        Function<String, String> doggy = (sound) -> "Hi, Doggy: " + sound;
        System.out.println(animalFarm.sayHello(doggy, "Barks Barks"));

    }
}
