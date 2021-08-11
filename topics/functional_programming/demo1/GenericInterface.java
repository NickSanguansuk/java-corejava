package topics.functional_programming.demo1;

@FunctionalInterface
public interface GenericInterface<T> {

    T compare(T a, T b);
}
