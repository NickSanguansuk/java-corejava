package trainings.bfs.week1.day2.hw;

import java.util.Objects;

public final class IntWrapperClass {

    // Wrapper classes are immutable
    private final int value;

    public IntWrapperClass(int value) {
        this.value = value;
    }

    public byte byteValue() {
        return (byte) value;
    }

    public short shortValue() {
        return (short) value;
    }

    public int intValue() {
        return value;
    }

    public long longValue() {
        return value;
    }

    public float floatValue() {
        return value;
    }

    public double doubleValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IntWrapperClass that = (IntWrapperClass) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public static void main(String[] args) {
        // Testing
        IntWrapperClass w1 = new IntWrapperClass(18);
        System.out.println(w1.byteValue());
        System.out.println(w1.shortValue());
        System.out.println(w1.intValue());
        System.out.println(w1.longValue());
        System.out.println(w1.floatValue());
        System.out.println(w1.doubleValue());

        System.out.println("---");

        IntWrapperClass w2 = new IntWrapperClass(14);
        IntWrapperClass w3 = new IntWrapperClass(18);

        System.out.println(w1.equals(w2));
        System.out.println(w1.equals(w3));
    }
}
