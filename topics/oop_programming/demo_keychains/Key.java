package topics.oop_programming.demo_keychains;

import java.util.UUID;

public class Key implements Cloneable, Comparable<Key> {
    // Data
    private UUID key;
    private Keyshape shape = Keyshape.Unknown;

    // Constructors
    public Key() {
        this.key = UUID.randomUUID();
    }

    public Key(Keyshape shape) {
        this(); // Initialize key using the default constructor
        this.shape = shape;
    }

    // Copy Constructors
    public Key(Key original) {
        this.key = original.key;
        this.shape = original.shape;
    }

    // Getters and Setters
    public Keyshape shape() {
        return this.shape;
    }

    // Methods
    @Override
    protected Object clone() {
        return new Key(this);
    }

    @Override
    public int hashCode() {
        return this.key.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!getClass().isInstance(obj)) {
            return false;
        }
        Key other = (Key) obj;
        return this.key.equals(other.key);
    }

    @Override
    public int compareTo(Key o) {
        return this.key.compareTo(o.key);
    }

    @Override
    public String toString() {
        return key.toString();
    }


}
