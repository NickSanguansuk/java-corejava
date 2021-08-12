package topics.generic_demo.wrapper_demo;

public class Wrapper<T> implements Comparable<T> {
    private T value;
    private int accessCount;

    public Wrapper(T value) {
        this.value = value;
    }

    public T getValue() {
        accessCount++;
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "value=" + value +
                ", accessCount=" + accessCount +
                '}';
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
