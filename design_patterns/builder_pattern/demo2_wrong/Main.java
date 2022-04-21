package design_patterns.builder_pattern.demo2_wrong;

public class Main {

    public static void main(String[] args) {

        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);

        engineer.constructHouse();

        House house = engineer.getHouse();

        System.out.println("Builder constructed: " + house);

    }
}
