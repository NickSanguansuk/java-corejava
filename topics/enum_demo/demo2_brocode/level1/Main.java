package topics.enum_demo.demo2_brocode.level1;

enum Planet {
    MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE, PLUTO
}

public class Main {

    static void canILiveHere(Planet myPlanet) {

        switch (myPlanet) {
            case EARTH:
                System.out.println("You can live here :)");
                break;
            default:
                System.out.println("You cannot live here yet!");
        }
    }

    public static void main(String[] args) {

        Planet myPlanet = Planet.EARTH;

        canILiveHere(myPlanet);
        canILiveHere(Planet.MARS);

        System.out.println("----------");

    }



}
