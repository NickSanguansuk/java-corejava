package design_patterns.abstract_factory_pattern;

public class MicroCar extends Car {

    public MicroCar(Location location) {
        super(CarType.MICRO, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Connecting to Micro car");
    }
}
