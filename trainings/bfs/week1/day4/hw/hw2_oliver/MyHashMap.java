package trainings.bfs.week1.day4.hw.hw2_oliver;

public class MyHashMap<K, V> {
    private int capacity;
    private MyHashMapNode<K, V>[] bucket;


    public MyHashMap(int capacity) {
        this.capacity = capacity;
        this.bucket = new MyHashMapNode[capacity];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value) {
        int hash = hash(key);

        if (bucket[hash] == null) {
            bucket[hash] = new MyHashMapNode<K, V>(key, value);
        } else {
            MyHashMapNode<K, V> currentNode = bucket[hash];

            while (currentNode != null) {
                if (currentNode.getKey().equals(key)) {
                    currentNode.setValue(value);
                    break;
                }
                currentNode = currentNode.getNext();
            }

            if (currentNode == null) {
                currentNode = new MyHashMapNode<K, V>(key, value);
            }
        }
    }

    public MyHashMapNode<K, V> get(K key) {
        int hash = hash(key);

        MyHashMapNode<K, V> currentNode = bucket[hash];

        while (currentNode != null) {
            if (currentNode.getKey().equals(key)) {
                break;
            }
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bucket.length; i++) {
            sb.append("[" + i + "]: ");
            MyHashMapNode<K, V> currentNode = bucket[i];
            while(currentNode != null) {
                sb.append("{" + currentNode.getKey() + ":" + currentNode.getValue() + "} ");
                currentNode = currentNode.getNext();
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        MyHashMap<String, String> map = new MyHashMap<String, String>(10);
        map.put("Oliver", "Hi");
        System.out.println(map);
        map.put("Oliver", "hello");
        System.out.println(map);
        map.put("Tracy", "hello");
        System.out.println(map);
    }
}