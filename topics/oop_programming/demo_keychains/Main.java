package topics.oop_programming.demo_keychains;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Create Keys");

        Key key1 = new Key();
        Key spareKey1a = new Key(key1);
        Key spareKey1b = (Key)key1.clone();

        Key key2 = new Key();

        Key key3 = new Key();

        System.out.println(key1);
        System.out.println(spareKey1a);
        System.out.println(spareKey1b);
        System.out.println(key2);
        System.out.println(key3);

        System.out.println("Create Keychains");
        Keychain keychain1 = new Keychain(Arrays.asList(key1, key2));
        keychain1.addKey(key3);

        System.out.println("Create Doors");
        Door door1 = new Door(key2);
        Door door2 = new Door(key1);
        Door door3 = new Door(null);

        System.out.println("----------");




    }
}
