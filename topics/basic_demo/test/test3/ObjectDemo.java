package topics.basic_demo.test.test3;

import java.util.Optional;

public class ObjectDemo {

    static {
        System.out.println("Hi01");
    }

    {
        System.out.println("Hi02");
    }

    @Override
    public String toString() {
        return "ObjectDemo";
    }

    //public static void main(String[] args) {
    public static void main(String... args) {
        Optional<Object> o = Optional.of(new ObjectDemo());
        System.out.println(o.get().toString());
    }

    static {
        System.out.println("Hi03");
    }

    {
        System.out.println("Hi04");
    }
}
