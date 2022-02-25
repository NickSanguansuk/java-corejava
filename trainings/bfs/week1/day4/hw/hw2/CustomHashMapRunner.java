package trainings.bfs.week1.day4.hw.hw2;

public class CustomHashMapRunner {

    public static void main(String[] args) {

        System.out.println("---");

        CustomHashMap<Integer, String> hashMap = new CustomHashMap<>();
        hashMap.put(50, "Nick");
        hashMap.put(62, "David");
        hashMap.put(28, "Nancy");
        hashMap.put(37, "Tracy");
        hashMap.put(89, "Brian");
        hashMap.put(41, "Eric");
        hashMap.put(12, "Lance");
        hashMap.put(8, "Kevin");
        hashMap.put(77, "Lita");
        hashMap.put(65, "Oscar");
        hashMap.display();

        System.out.println("---");

        System.out.println(hashMap.get(89));
        System.out.println(hashMap.get(37));
        System.out.println(hashMap.get(77));

        System.out.println("---");

        hashMap.remove(12);
        hashMap.remove(28);
        hashMap.remove(50);
        hashMap.remove(8);
        hashMap.display();

        System.out.println("---");

    }
}
