package topics.functional_programming.demo2;

@FunctionalInterface
public interface IFunction<T, R> {

    R apply(T t);

}
