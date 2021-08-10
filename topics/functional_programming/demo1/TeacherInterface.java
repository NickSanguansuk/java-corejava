package topics.functional_programming.demo1;

@FunctionalInterface
public interface TeacherInterface<T> {

    // public abstract
    public abstract String teach(T t);
}
