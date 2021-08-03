package topics.class_demo.sample_class_demo;

public class Statistics {
    // Data
    private int nSamples;
    private double min = Double.MAX_VALUE;
    private double max = Double.MIN_VALUE;
    private double sum;

    // Constructors
    public Statistics(double[] values) {
        for (int i = 0; i < values.length; ++i) {
            double v = values[i];
            if (v < min) {
                min = v;
            }
            if (v > max) {
                max = v;
            }
            sum += v;
            nSamples++;
        }
    }

    // Methods
    public int getnSamples() {
        return nSamples;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public double getSum() {
        return sum;
    }

    public double findAverage() {
        return (nSamples == 0) ? Double.NaN : this.sum / this.nSamples;
    }
}
