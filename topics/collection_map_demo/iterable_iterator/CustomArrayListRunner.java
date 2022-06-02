package topics.collection_map_demo.iterable_iterator;

import java.util.Iterator;

public class CustomArrayListRunner {

    public static void main(String[] args) {

        CustomArrayList<String> myCustomArrayList = new CustomArrayList<>();

        myCustomArrayList.add("Test value 1");
        myCustomArrayList.add("Custom value 2");
        myCustomArrayList.add("3rd value");

        for (String str : myCustomArrayList) {
            System.out.println(str);
        }

        System.out.println("----------");

        myCustomArrayList.forEach((x) -> {
            System.out.println(x);
        });
        //myCustomArrayList.forEach(System.out::println);

        System.out.println("----------");

        Iterator<String> it = myCustomArrayList.iterator();
        while (it.hasNext()) {
            String element = it.next();
            System.out.println(element);
        }
    }
}
