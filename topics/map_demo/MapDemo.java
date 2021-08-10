package topics.map_demo;

import java.security.KeyPair;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {

        System.out.println("---------- ---------- ---------- ---------- ----------");

        System.out.println("Map (Interface)");
        // Map are stored in key value pairs.
        // Key are unique value associate with elements or values.

        // Map ---> HashMap, TreeMap, EnumMap

        System.out.println("---------- ---------- ---------- ---------- ----------");

        System.out.println("HashMap");
        // HashMap allows null value element but there should be only one null key, you cannot store duplicate key.

        HashMap<Integer, String> map1 = new HashMap<>();

        map1.put(1, "New York NY"); // got replaced
        map1.put(4, "Chicago IL");
        map1.put(2, "Atlanta GA");
        map1.put(3, "Columbus OH");
        map1.put(1, "New Jersey NJ");
        map1.put(null, "Dallas TX"); // got replaced
        map1.put(null, "Seattle ST");

        System.out.println(map1);

        System.out.println(map1.size());

        System.out.println("----------");
        System.out.println("Print out");

        for (Map.Entry<Integer, String> e : map1.entrySet()) {
            System.out.println("Entry: " + e + "     Key: " + e.getKey() + "     Value: " + e.getValue());
        }

        System.out.println("---");

        for (Object o : map1.entrySet()) {
            System.out.println(o);
        }

        System.out.println("---");

        Set<Map.Entry<Integer, String>> entrySet = map1.entrySet();
        System.out.println(entrySet);

        System.out.println("---");

        System.out.println(map1);

        System.out.println("---");

        map1.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

        System.out.println("---------- ---------- ---------- ---------- ----------");

        System.out.println("TreeMap");




    }
}
