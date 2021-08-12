package topics.oop_programming.demo_keychains;

import java.util.*;

public class Keychain {
    // Data
    //private Set<Key> keys = new TreeSet<>();
    private HashMap<Keyshape, ArrayList<Key>> keys = new HashMap<>();

    // Constructors
    public Keychain() {
    }

    public Keychain(Collection<Key> keys) {
        //this.keys.addAll(keys);
        for (Key k : keys) {
            addKey(k);
        }
    }

    // Getters and Setters


    // Methods
    public boolean addKey(Key key) {
        //return this.keys.add(key);
        if (!keys.containsKey(key.shape())) {
            keys.put(key.shape(), new ArrayList<>());
        }
        keys.get(key.shape()).add(key);
        return true;
    }

    public boolean removeKey(Key key) {
        //return this.keys.remove(key);
        if (keys.containsKey(key.shape())) {
            return keys.get(key.shape()).remove(key);
        }
        return false;
    }

    public int keyCount() {
        //return keys.size();
        int keyCount = 0;
        for (Keyshape keyshape : keys.keySet()) {
            keyCount += keys.get(keyshape).size();
        }
        return keyCount;
    }

    public boolean lock(Door door) {
        if (door.isLocked()) {
            return true; // Nothing to do
        }
        if (!door.hasKey()) {
            return false; // Door cannot be locked
        }
        if (!keys.containsKey(door.key().shape())) {
            return false;
        }
        //for (Key k : this.keys) {
        //    if (door.unlock(k)) {
        //        return true;
        //    }
        //}
        for (Key k : keys.get(door.key().shape())) {
            if (door.lock(k)) {
                return true;
            }
        }
        return false; // Sorry, no key locks this door
    }

    public boolean unlock(Door door) {
        if (!door.isLocked()) {
            return true; // Nothing to do
        }
        if (!door.hasKey()) {
            return true; // Door is already unlocked
        }
        if (!keys.containsKey(door.key().shape())) { // Don't have that key
            return false;
        }
        //for (Key k : keys) {
        //    if (door.unlock(k)) {
        //        return true;
        //    }
        //}
        for (Key k : keys.get(door.key().shape())) {
            if (door.unlock(k)) {
                return true;
            }
        }
        return false; // Sorry, no key locks this door
    }

}
