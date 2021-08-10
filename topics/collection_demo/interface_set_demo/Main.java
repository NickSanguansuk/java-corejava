package topics.collection_demo.interface_set_demo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------");
        System.out.println("Set (Interface)");

        // Set
        //
        //

        Set<Integer> hSetInt = new HashSet<>();
        Set<String> hSetStr = new HashSet<>();
        Set<Integer> tSetInt = new TreeSet<>();
        Set<String> tSetStr = new TreeSet<>();

        System.out.println("----------");
        System.out.println(".add() and .addAll()");

        hSetInt.add(20);
        hSetInt.add(10);
        hSetInt.add(2);
        hSetInt.add(1);
        hSetInt.add(3);

        hSetInt.add(1);
        hSetInt.add(20);

        System.out.println(hSetInt);

        for (Integer i : hSetInt) {
            System.out.println(i + "\t" + i.hashCode());
        }




    }
}
