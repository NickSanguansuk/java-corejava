package topics.collection_map_demo.interface_map_demo;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------- ---------- ---------- ---------- ----------");

        System.out.println("Map (Interface)");
        // Map are stored in key value pairs.
        // Key are unique value associate with elements or values.

        // Map ---> HashMap, TreeMap, EnumMap

        // HashMap allows null value element but there should be only one null key, you cannot store duplicate key.
        // However, if you try to store duplicate key with another key, it will replace the value
        // HashMap contains only unique key
        // HashMap maintains no order

        // Treemap: KEy and Value pair in asc sorted order
        // Treemap contain only unique key and contain value based on the keys,
        // Treemap cannot have null key but can have multiple null values

        // Here are some of the most commonly use Map methods:
        // clear()			    removes all mappings
        // containsKey(K key)	tests whether the map includes the given key
        // containsValue(V v)	tests whether the map includes the given value
        // get(K key)		    gets the value associated with the given key
        // put(K key, V value)	associates value with the given key
        // keySet()			    returns the Set<K> of all keys in the map.
        // remove(K key)		removes the key and its associated value from the map
        // replace(K key, V value)	replaces the entry for the given key

        System.out.println("---------- ---------- ---------- ---------- ----------");

        System.out.println("HashMap");

        Map<Integer, String> map1 = new HashMap<>();

        map1.put(1, "New York NY"); // got replaced
        map1.put(4, "Chicago IL");
        map1.put(2, "Atlanta GA");
        map1.put(3, "Columbus OH");
        map1.put(1, "New Jersey NJ");
        map1.put(null, "Dallas TX"); // got replaced
        map1.put(null, "Seattle ST");

        map1.replace(2, "Replace by this");

        System.out.println(map1);

        System.out.println(map1.size());

        System.out.println("----------");
        System.out.println("Print out");

        Set<Integer> set1 = map1.keySet();
        System.out.println(set1);

        Collection<String> list1 = map1.values();
        System.out.println(list1);

        System.out.println("----------");
        System.out.println("Print out pairs");

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

        Map<Integer, String> map2 = new TreeMap<>();

        map2.put(6, "NYC");
        map2.put(7, "PHX");
        map2.put(3, "NC");
        map2.put(4, "TX");
        map2.put(5, "AL");
        map2.put(1, "CAL");
        map2.put(6, "SAN");
        //map2.put(null, "SAN"); null key not allow
        map2.put(8, null);
        map2.put(9, null);

        System.out.println(map2);

        System.out.println("----------");

        TreeMap<Integer, String> tMap2 = (TreeMap<Integer, String>)map2;

        System.out.println(tMap2.descendingKeySet());
        System.out.println(tMap2.descendingMap());

        System.out.println("---");

        // headmap() return key-value pairs whose keys are less than or equal to the specified key
        System.out.println(tMap2.headMap(5, false));
        System.out.println(tMap2.headMap(5, true));

        System.out.println("---");

        System.out.println(tMap2.tailMap(5, false));
        System.out.println(tMap2.tailMap(5, true));

    }
}
