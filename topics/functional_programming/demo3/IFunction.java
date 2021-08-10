package topics.functional_programming.demo3;

@FunctionalInterface
public interface IFunction<T, R> {

    R apply(T t);

}
