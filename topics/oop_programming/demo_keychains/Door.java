package topics.oop_programming.demo_keychains;

public class Door {
    // Data
    private Key key;
    private boolean isLocked;

    // Constructors
    public Door(Key key) {
        this.key = key;
        // if key is null, Door is not locked
        this.isLocked = (key != null);
    }

    // Getters and Setters
    public Key key() {
        return this.key;
    }

    public boolean isLocked() {
        return this.isLocked;
    }

    // Methods
    public boolean hasKey() {
        return this.key != null;
    }

    public boolean lock(Key key) {
        if (this.key == null || this.key.equals(key)) {
            this.isLocked = true;
        }
        return this.isLocked;
    }

    public boolean unlock(Key key) {
        if (this.key == null || this.key.equals(key)) {
            this.isLocked = false;
        }
        // If unlock successful, the this.isLocked will be false.
        // So, this method returns true.
        return !this.isLocked;
    }


}
