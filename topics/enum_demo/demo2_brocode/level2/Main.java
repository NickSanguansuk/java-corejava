package topics.enum_demo.demo2_brocode.level2;

enum Planet {
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8),
    PLUTO(9);

    private int number;

    Planet(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

public class Main {

    static void canILiveHere(Planet myPlanet) {

        switch (myPlanet) {
            case EARTH:
                System.out.println("You can live here :)");
                System.out.println("This is planet #" + myPlanet.getNumber() + ", ordinal(): " + myPlanet.ordinal());
                break;
            default:
                System.out.println("You cannot live here yet!");
                System.out.println("This is planet #" + myPlanet.getNumber() + ", ordinal(): " + myPlanet.ordinal());
        }
    }

    public static void main(String[] args) {

        Planet myPlanet = Planet.EARTH;

        canILiveHere(myPlanet);
        canILiveHere(Planet.MARS);
        canILiveHere(Planet.PLUTO);

        System.out.println("----------");


        System.out.println("----------");

    }



}
