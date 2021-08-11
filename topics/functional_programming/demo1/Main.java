package topics.functional_programming.demo1;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------");

        HumanInterface.doSomethingStatic();

        System.out.println("----------");
        System.out.println("using HumanDemo obj");

        HumanDemo human = new HumanDemo();

        human.h.say();

        String eatStr = human.h2.eat(4);
        System.out.println(eatStr);

        String teaching1 = human.tString.teach("Java");
        System.out.println(teaching1);

        String teaching2 = human.tInteger.teach(36);
        System.out.println(teaching2);

        System.out.println("----------");
        System.out.println("Using lambda expression");

        HumanInterface humanInterface = () -> {
            System.out.println("abcd efg hijk lmnop");
        };
        humanInterface.say();

        System.out.println("---");

        // Longest
        HumanInterface2 i1 = (Integer num) -> {
            return "I ate " + num + " sushi rolls";
        };
        System.out.println(i1.eat(10));

        // Medium (I like the most)
        HumanInterface2 i2 = (num) -> {
            return "I ate " + num + " stakes";
        };
        System.out.println(i2.eat(10));

        // Shortest
        HumanInterface2 i3 = num -> "I ate " + num + " pizzas";
        System.out.println(i3.eat(10));

        System.out.println("---");

        TeacherInterface<Integer> teacherInterface = (num) -> {
            if (num % 2 == 0) {
                return "The number " + num + " is even";
            } else {
                return "The number " + num + " is odd";
            }
        };
        System.out.println(teacherInterface.teach(55));

        System.out.println("---");

        ConcatInterface c1 = (x, y) -> x + y;
        String result1 = c1.concat2Str("PerScholas", "Chicago");
        System.out.println(result1);

        ConcatInterface c2 = (x, y) -> x.concat(y);
        String result2 = c2.concat2Str("PerScholas", "NYC");
        System.out.println(result2);

        ConcatInterface c3 = String::concat;
        String result3 = c3.concat2Str("PerScholas", "Atlanta");
        System.out.println(result3);

        System.out.println("---");

        MathOperationInterface powOperation = (a, b) -> {
            return (int) Math.pow(a, b);
        };
        System.out.println((powOperation.manipulateTwoNumber(2, 20)));

        MathOperationInterface addOperation = (a, b) -> a + b;
        //MathOperationInterface addOperation = Integer::sum;
        MathOperationInterface subOperation = (a, b) -> a - b;
        MathOperationInterface mulOperation = (a, b) -> a * b;
        MathOperationInterface divOperation = (a, b) -> a / b;
        System.out.println(subOperation.manipulateTwoNumber(10, 20));
        System.out.println(mulOperation.manipulateTwoNumber(10, 20));
        System.out.println(divOperation.manipulateTwoNumber(10, 20));
        System.out.println(addOperation.manipulateTwoNumber(10, 20));

        System.out.println("---");
        System.out.println("Calling default method in interface");

        System.out.println(divOperation.manipulateTwoNumber(4.5, 6.5));

        System.out.println("---");
        System.out.println("Generic functional interface");

        // 1
        //GenericInterface<Integer> g1 = (x, y) -> {
        //    if (x > y) {
        //        return x;
        //    } else {
        //        return y;
        //    }
        //};
        //Integer result4 = g1.compare(11, 14);
        //System.out.println(result4);

        // 2
        //GenericInterface<Integer> g1 = (x, y) -> {
        //    return Math.max(x, y);
        //};
        //Integer result4 = g1.compare(11, 14);
        //System.out.println(result4);

        // 3
        //GenericInterface<Integer> g1 = (x, y) -> Math.max(x, y);
        //Integer result4 = g1.compare(11, 14);
        //System.out.println(result4);

        // 4
        GenericInterface<Integer> g1 = Math::max;
        Integer result4 = g1.compare(11, 14);
        System.out.println(result4);

        GenericInterface<String> g2 = (x, y) -> {
            if (x.compareTo(y) > 0) {
                return x;
            } else if (x.compareTo(y) < 0) {
                return y;
            } else {
                return x;
            }
        };
        String result5 = g2.compare("Wasin", "Haseeb");
        System.out.println(result5);

        System.out.println("----------");
        System.out.println("Using Java built-in function interface");

        System.out.println("Predicate ---> boolean test(T t)");

        Predicate<Integer> pr1 = (n) -> n >= 18;
        boolean resultPr1 = pr1.test(17);
        System.out.println(resultPr1);

        Predicate<String> pr2 = (n) -> n.equals("David");
        boolean resultPr2 = pr2.test("David");
        System.out.println(resultPr2);

        List<String> names = Arrays.asList("Haseeb", "Eric", "Joseph", "Brian", "John");
        Predicate<String> checkName = (n) -> n.startsWith("J");
        for (String name : names) {
            if (checkName.test(name)) {
                System.out.print(name + ", ");
            }
        }
        System.out.println();

        Predicate<String> checkLength = str -> str.length() > 5;
        System.out.println(checkLength.test("Elephant"));

        System.out.println("---");

        System.out.println("Consumer ---> void accept(T t)");

        Consumer<Integer> say = (x) -> System.out.println(x);
        say.accept(100);

        Consumer<Integer> add200AndPrint = (x) -> {
            int b = x + 200;
            System.out.println(b);
        };
        add200AndPrint.accept(150);

        Consumer<String> toUpper = (x) -> System.out.println(x.toUpperCase());
        toUpper.accept("TEKsystems");

        // This will not work (Because lambda is pass by value)
        double totalRevenue = 1000;
        System.out.println("totalRevenue: " + totalRevenue);
        Consumer<Double> add100 = value -> value += 100;
        add100.accept(totalRevenue);
        System.out.println("totalRevenue: " + totalRevenue);

        Person p1 = new Person();
        System.out.println("name: " + p1.getName());
        Consumer<Person> setName = t -> t.setName("Unnamed");
        setName.accept(p1);
        System.out.println("name: " + p1.getName());

        System.out.println("---");

        System.out.println("Supplier ---> T get()");

        Supplier<String> supEncapsulation = () -> "Encapsulation is wrapping the data (variables) and code acting on the data (methods) together as a single unit";
        String meaning = supEncapsulation.get();
        System.out.println(meaning);

        // [0, 1, 2, ..., 9]
        Supplier<Integer> supRandInt = () -> (int) (Math.random() * 10);
        Integer randNum = supRandInt.get();
        System.out.println(randNum);

        System.out.println("---");

        System.out.println("Function ---> R apply(T t)");

        //Function<T, R>
        Function<String, Person> createPerson = (name) -> {
            Person pNew = new Person();
            pNew.setName(name);
            return pNew;
        };
        Person newPerson = createPerson.apply("Wasin");
        System.out.println(newPerson);

        System.out.println("----------");

        System.out.println("Testing ---> TestFunctionalInterface");

        //TestFuncInterface test = () -> {};            // 1
        //TestFuncInterface test = () -> 42;            // 2
        //TestFuncInterface test = () -> null;          // 3
        TestFuncInterface test = () -> {
            return 42;
        };  // 4

        System.out.println(test.testingMethod());

        System.out.println("----------");

        System.out.println("ComparatorInterface");

        ComparatorInterface reverser_space = (str) -> {
            String sub_str = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                sub_str += str.charAt(i);
            }
            return sub_str;
        };

        ComparatorInterface normal_noSpace = (str) -> {
            String sub_str = "";
            for (int i = 0; i < str.length(); i++) {
                String s = Character.toString(str.charAt(i));
                if (!s.equals(" ")) {
                    sub_str += s;
                }
            }
            return sub_str;
        };

        System.out.println(reverser_space.comparator("Hello class of JD"));
        System.out.println(normal_noSpace.comparator("Hello class of JD"));

        System.out.println("----------");

        System.out.println("forEach loop (internal loop)");

        List<String> nameList = new ArrayList<>(Arrays.asList("Larry", "Steve", "James", "Conan", "Ellen"));

        nameList.forEach(name -> System.out.print(name + ", "));
        System.out.println();

        System.out.println("---");

        nameList.forEach(System.out::println);

        System.out.println("----------");
        System.out.println("Another forEach()");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(12);
        numbers.add(3);
        numbers.add(8);

        Collections.sort(numbers);

        numbers.forEach((n) -> { System.out.print(n + ", "); });
        System.out.println();

        System.out.println("----------");
        System.out.println("Others");



        System.out.println("----------");

    }
}
