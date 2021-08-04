package topics.generic_demo.demo2;

public class MyGenericsBoundedTypesClass<T extends Number, S extends Number> {
    T valueOne;
    S valueTwo;

    public MyGenericsBoundedTypesClass(T valueOne, S valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    public T getValueOne() {
        return valueOne;
    }

    public S getValueTwo() {
        return valueTwo;
    }
}
