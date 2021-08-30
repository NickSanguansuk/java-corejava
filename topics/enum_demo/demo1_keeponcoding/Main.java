package topics.enum_demo.demo1_keeponcoding;

public class Main {

    enum Transport {
        PLANE(600), TRAIN(80), AUTOMOBILE(50);

        private int speed;

        Transport(int speed) {
            this.speed = speed;
        }

        public int getSpeed() {
            return this.speed;
        }
    }

    public static void main(String[] args) {

        Transport tp = Transport.PLANE;

        if (tp == Transport.PLANE) {
            System.out.println("Plane - flying");
        }

        System.out.println("----------");

        Transport[] allTransports = Transport.values();

        for (Transport t : allTransports) {
            System.out.println(t);
        }

        System.out.println("----------");

        System.out.println(Transport.AUTOMOBILE.getSpeed());

        System.out.println("----------");

        Transport tp2 = Transport.AUTOMOBILE;

        System.out.println(tp2.ordinal());

        if (tp2.ordinal() < 2) {
            System.out.println(tp2 + " is Not an Automobile");
        }

        if (tp.ordinal() < 2) {
            System.out.println(tp + " is Not an Automobile");
        }

        System.out.println("----------");


    }

}
