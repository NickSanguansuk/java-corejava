package design_patterns.abstract_factory_pattern;

public class LuxuryCar extends Car {

    public LuxuryCar(Location location) {
        super(CarType.LUXURY, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Connecting to Luxury car");
    }
}
