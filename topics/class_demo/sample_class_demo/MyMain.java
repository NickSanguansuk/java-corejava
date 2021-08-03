package topics.class_demo.sample_class_demo;

public class MyMain {

    public static void main(String[] args) {

        double[] values = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println(values[i] = Math.random() * 100);
        }

        System.out.println("----------");

        Statistics stats = new Statistics(values);

        System.out.println(String.format("Min: %.2f, Max: %.2f, Average: %.2f", stats.getMin(), stats.getMax(), stats.findAverage()));
        //System.out.println("Min: " + String.format("%.2f", stats.getMin()) + ", Max: " + String.format("%.2f", stats.getMax()) + ", Average: " + String.format("%.2f", stats.findAverage()));
        System.out.printf("Min: %.2f, Max: %.2f, Average: %.2f\n", stats.getMin(), stats.getMax(), stats.findAverage());
        System.out.format("Min: %.2f, Max: %.2f, Average: %.2f\n", stats.getMin(), stats.getMax(), stats.findAverage());

        System.out.println("----------");
    }
}
