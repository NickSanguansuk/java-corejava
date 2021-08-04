package topics.generic_demo.demo2;

public class MyGenericsMultiParaClass<T, S> {
    T valueOne;
    S valueTwo;

    public MyGenericsMultiParaClass(T valueOne, S valueTwo) {
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
