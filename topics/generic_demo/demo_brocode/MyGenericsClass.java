package topics.generic_demo.demo_brocode;

public class MyGenericsClass<T> {
    T value;

    public MyGenericsClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
}
