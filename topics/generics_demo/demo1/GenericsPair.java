package topics.generics_demo.demo1;

public class GenericsPair<K, V> {
    // data
    private K key;
    private V value;

    // constructors
    public GenericsPair() {
    }

    public GenericsPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // getters and setters
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    // methods


}
