package topics.generics_demo;

public class GenericClass<T> {
    private T varName;

    public GenericClass(T varName)
    {
        this.varName = varName;
    }

    public GenericClass()
    {

    }

    public T getVarName()
    {
        return this.varName;
    }

    public void setVarName(T varName)
    {
        this.varName = varName;
    }

    //	public void addingNumber(int a, int b)
    //	{
    //		System.out.println(a+b);
    //	}
}
