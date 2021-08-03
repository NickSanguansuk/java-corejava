package topics.generics_demo;

public class GenericsClass<T> {
    private T varName;

    public GenericsClass(T varName) {
        this.varName = varName;
    }

    public GenericsClass() {

    }

    public T getVarName() {
        return this.varName;
    }

    public void setVarName(T varName) {
        this.varName = varName;
    }


}
