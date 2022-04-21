package trainings.bfs.week5.day1.mock.q2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class LRUCache {

    private HashMap<Integer, Integer> map;
    private LinkedList<Integer> list;
    private int size;

    // Initialize the LRU cache with positive size capacity.
    public LRUCache(int capacity) {
        //your code...
        this.map = new HashMap<>();
        this.list = new LinkedList<>();
        this.size = capacity;
    }

    // Return the value of the key if the key exists, otherwise return -1.
    public int get(int key) {
        //your code and time complexity of the get method...
        if (map.containsKey(key)) {
            for (int i = 0; i < list.size(); i++) {
                int a = list.get(i);
                if (a == key) {
                    list.remove(i);
                    list.addLast(key);
                }
            }
            return map.get(key);
        } else {
            return -1;
        }
    }

    // Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
    public void put(int key, int value) {
        //your code and time complexity of the put method...
        if (list.size() == size) {
            int a = list.poll();
            map.remove(a);
        }
        list.addLast(key);
        map.put(key, value);
    }

    public static void main(String[] args) {
        LRUCache lrucache = new LRUCache(2);
        lrucache.put(1, 1); // cache is {1=1}
        lrucache.put(2, 2); // cache is {1=1, 2=2}
        //lrucache.put(3, 3);
        //lrucache.get(3);
        System.out.println(lrucache.get(1));    // return 1
        lrucache.put(3, 3); // Least Recently Used key was 2, evicts key 2, cache is now {1=1, 3=3}
        System.out.println(lrucache.get(2));    // returns -1 (not found)
        lrucache.put(4, 4); // LRU key was 1, evicts key 1, cache is now {4=4, 3=3}
        System.out.println(lrucache.get(1));    // return -1 (not found)
        System.out.println(lrucache.get(3));    // return 3
        System.out.println(lrucache.get(4));    // return 4
    }
}
