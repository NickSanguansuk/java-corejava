package topics.generics_demo.demo2;

public class MyGenericsClass<T> {
    T value;

    public MyGenericsClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
}
