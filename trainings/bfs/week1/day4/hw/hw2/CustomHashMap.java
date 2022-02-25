package trainings.bfs.week1.day4.hw.hw2;

import java.util.Map;

public class CustomHashMap<K, V> {

    // Fields
    private int capacity = 16;
    private CustomEntry<K, V>[] buckets;

    // Constructors
    public CustomHashMap() {
        this.buckets = new CustomEntry[this.capacity];
    }

    public CustomHashMap(int capacity) {
        this.capacity = capacity;
        this.buckets = new CustomEntry[this.capacity];
    }

    // put the new CustomEntry at the end of the LinkedList
    public void put(K key, V value) {
        int index = index(key);
        CustomEntry<K, V> newEntry = new CustomEntry<>(key, value, null);
        if (this.buckets[index] == null) {
            this.buckets[index] = newEntry;
        } else {
            CustomEntry<K, V> prevNode = null;
            CustomEntry<K, V> currNode = this.buckets[index];
            while (currNode != null) {
                if (currNode.getKey().equals(key)) {
                    currNode.setValue(value);
                    break;
                }
                prevNode = currNode;
                currNode = currNode.getNext();
            }
            if (prevNode != null) {
                prevNode.setNext(newEntry);
            }
        }
    }

    public V get(K key) {
        V value = null;
        int index = index(key);
        CustomEntry<K, V> currNode = this.buckets[index];
        while (currNode != null) {
            if (currNode.getKey().equals(key)) {
                value = currNode.getValue();
                break;
            }
            currNode = currNode.getNext();
        }
        return value;
    }

    public void remove(K key) {
        int index = index(key);
        CustomEntry<K, V> prevNode = null;
        CustomEntry<K, V> currNode = this.buckets[index];
        while (currNode != null) {
            if (currNode.getKey().equals(key)) {
                if (prevNode == null) {
                    currNode = currNode.getNext();
                    this.buckets[index] = currNode;
                    return;
                } else {
                    prevNode.setNext(currNode.getNext());
                    return;
                }
            }
            prevNode = currNode;
            currNode = currNode.getNext();
        }
    }

    public void display() {
        for (int i = 0; i < this.capacity; i++) {
            if (this.buckets[i] != null) {
                CustomEntry<K, V> currNode = this.buckets[i];
                while (currNode != null) {
                    System.out.println(i + "\t" + currNode);
                    currNode = currNode.getNext();
                }
            }
        }
    }

    // To find the bucket index (position)
    private int index(K key) {
        if (key == null) {
            return 0;
        }
        return Math.abs(key.hashCode() % this.capacity);
    }
}
