package topics.generics_demo.demo1;

public class GenericsMultiPara<T, S> {

    private T varOne;
    private S varTwo;

    public GenericsMultiPara() {
    }

    public GenericsMultiPara(T varOne, S varTwo) {
        this.varOne = varOne;
        this.varTwo = varTwo;
    }

    // getters and setters
    public T getVarOne() {
        return varOne;
    }

    public void setVarOne(T varOne) {
        this.varOne = varOne;
    }

    public S getVarTwo() {
        return varTwo;
    }

    public void setVarTwo(S varTwo) {
        this.varTwo = varTwo;
    }

    public void printBothValue() {
        System.out.println("Value of varOne: " + this.varOne);
        System.out.println("Value of varTwo: " + this.varTwo);
    }

}
