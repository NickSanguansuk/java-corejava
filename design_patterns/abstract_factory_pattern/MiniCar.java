package design_patterns.abstract_factory_pattern;

public class MiniCar extends Car {

    public MiniCar(Location location) {
        super(CarType.MINI, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Connecting to Mini car");
    }
}
