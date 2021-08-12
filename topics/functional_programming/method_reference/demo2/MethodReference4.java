package topics.functional_programming.method_reference.demo2;

import java.util.function.Supplier;

class School {

}

public class MethodReference4 {

    public static void main(String[] args) {

        // D) Reference to a constructor
        // ClassName::new

        //Creating objects using lambda
        Supplier<School> lambdaSupplier = () -> new School();
        lambdaSupplier.get();

        //Creating objects using constructor references
        Supplier<School> referenceSupplier = School::new;
        referenceSupplier.get();

    }
}
