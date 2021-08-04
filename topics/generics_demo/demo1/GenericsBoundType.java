package topics.generics_demo.demo1;

public class GenericsBoundType<T extends Integer> {

    private T varName;

    public GenericsBoundType(T varName) {
        this.varName = varName;
    }

    public GenericsBoundType() {

    }

    public T getVarName() {
        return varName;
    }

    public void setVarName(T varName) {
        this.varName = varName;
    }


}
