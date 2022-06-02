package design_patterns.abstract_factory_pattern;

public class CarFactory {

    public CarFactory() {
    }

    public static Car buildCar(CarType type) {

        Car car = null;

        // We can add any GPS Function here which
        // read location property somewhere from configuration
        // and use location specific car factory
        // Currently I'm just using INDIA as Location
        Location location = Location.INDIA;

        switch(location) {
            case USA:
                car = UsaCarFactory.buildCar(type);
                break;

            case INDIA:
                car = IndiaCarFactory.buildCar(type);
                break;

            default:
                car = DefaultCarFactory.buildCar(type);
        }

        return car;
    }

}
