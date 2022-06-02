package topics.optional_class.demo1_amigoscode;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------- ---------- ---------- ---------- ----------");
        {

            Optional<String> empty = Optional.empty();
            System.out.println(empty);                      // Optional.empty
            System.out.println(empty.isEmpty());            // true
            System.out.println(empty.isPresent());          // false

            String orElse1 = empty.orElse("World");
            System.out.println(orElse1);                    // World

            System.out.println("----------");

            //Optional<String> optionalNull = Optional.of(null); // NullPointerException
            Optional<String> optionalNull = Optional.ofNullable(null);
            System.out.println(optionalNull);                    // Optional.empty
            System.out.println(optionalNull.isEmpty());          // true
            System.out.println(optionalNull.isPresent());        // false

            String orElse2 = optionalNull.orElse("World");
            System.out.println(orElse2);                    // World

            System.out.println("----------");

            Optional<String> hello = Optional.of("Hello");
            System.out.println(hello);              // Optional[Hello]
            System.out.println(hello.isEmpty());    // false
            System.out.println(hello.isPresent());  // true

            String orElse3 = hello.orElse("World");
            System.out.println(orElse3);                    // Hello

        }
        System.out.println("---------- ---------- ---------- ---------- ----------");
        {

            //Optional<String> hello = Optional.of("Hello");
            Optional<String> hello = Optional.ofNullable(null);

            System.out.println("---");

            String orElse1 = hello
                    .map(String::toUpperCase)
                    .orElse("World");
            System.out.println(hello);
            System.out.println(orElse1);

            System.out.println("---");

            String orElse2 = hello
                    .map(String::toUpperCase)
                    .orElseGet(() -> { // Supplier
                        // ... extra computation to retrieve the value
                        return "World";
                    });
            System.out.println(hello);
            System.out.println(orElse2);

            System.out.println("---");

            try {
                String orElse3 = hello
                        .map(String::toUpperCase)
                        .orElseThrow(IllegalStateException::new);
                System.out.println(hello);
                System.out.println(orElse3);
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println(e);
            }

            System.out.println("---");

            // If the value is not present, it will do nothing.
            hello.ifPresent(word -> { // Consumer
                System.out.println("---> " + word);
            });

            System.out.println("---");

            hello.ifPresentOrElse(word -> { // Consumer, Runnable
                System.out.println("---> " + word);
            }, () -> {
                System.out.println("World");
            });

        }
        System.out.println("---------- ---------- ---------- ---------- ----------");
        {

            Person person1 = new Person("James", "james@gmail.com");
            Person person2 = new Person("Bob", "bob@gmail.com");
            Person person3 = new Person("Laura", null);
            List<Person> personList = new ArrayList<>();
            personList.add(person1);
            personList.add(person2);
            personList.add(person3);

            for (Person p : personList) {
                //System.out.println(p.getEmail().toUpperCase());
                System.out.println(p
                        .getEmail()
                        .map(String::toUpperCase)
                        .orElse("Email not provided."));
            }

            System.out.println("---");

            for (Person p : personList) {
                if (p.getEmail().isPresent()) {
                    System.out.println(p.getEmail().get());
                } else {
                    System.out.println("Email not provided.");
                }
            }

            System.out.println("---");

            for (Person p : personList) {
                p.getEmail().ifPresentOrElse(email -> {
                    System.out.println(email);
                }, () -> {
                    System.out.println("Email not provided.");
                });
            }

        }
        System.out.println("---------- ---------- ---------- ---------- ----------");
    }
}
