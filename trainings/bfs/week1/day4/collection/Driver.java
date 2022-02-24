package trainings.bfs.week1.day4.collection;

import java.util.*;
import java.util.stream.Collectors;

public class Driver {

    public static void main(String[] args) {

        // List
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        // Insertion order is preserved
        System.out.println(arrayList);
        // Can contain duplicate element
        arrayList.add(4);
        System.out.println(arrayList);
        // User can define insertion point
        arrayList.add(2, 3);
        System.out.println(arrayList);
        // Element can be accessed by position
        System.out.println(arrayList.get(3));

        System.out.println("----------");

        // Queue
        Queue<Integer> linkedListQueue = new LinkedList<>();
        linkedListQueue.offer(1);
        linkedListQueue.offer(2);
        linkedListQueue.offer(3);
        System.out.println(linkedListQueue);
        System.out.println(linkedListQueue.poll());
        System.out.println(linkedListQueue);

        System.out.println("---");

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(2);
        priorityQueue.offer(3);
        priorityQueue.offer(4);
        priorityQueue.offer(2);
        priorityQueue.offer(1);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);

        System.out.println("---");

        // LinkedList's different implementation
        List<Integer> list = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("----------");

        // Set
        Set<String> hashSet = new HashSet<>();
        hashSet.add("New Jersey");
        hashSet.add("New York");
        hashSet.add("California");
        // Insertion order is not preserved
        System.out.println(hashSet);
        // Does not contain duplicates
        hashSet.add("New Jersey");
        System.out.println(hashSet);

        System.out.println("---");

        // LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("New Jersey");
        linkedHashSet.add("New York");
        linkedHashSet.add("California");
        // Insertion order is preserved
        System.out.println(linkedHashSet);

        System.out.println("---");

        // TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("New Jersey");
        treeSet.add("New York");
        treeSet.add("California");
        // Sorted order
        System.out.println(treeSet);

        System.out.println("----------");

        // == and .equals()
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        // .hashcode()
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        System.out.println("----------");

        // Sorting
        List<String> fruitList = Arrays.asList("Grape", "Watermelon", "Apple", "Banana");
        System.out.println(fruitList);
        Collections.sort(fruitList);
        System.out.println(fruitList);

        System.out.println("----------");

        // Custom Sorting
        List<Teacher> teacherList = Arrays.asList(
                new Teacher(10),
                new Teacher(1),
                new Teacher(11),
                new Teacher(3),
                new Teacher(2),
                new Teacher(9),
                new Teacher(7)
        );
        //System.out.println(teacherList);
        //Collections.sort(teacherList);
        //System.out.println(teacherList);

        System.out.println("---");

        // Comparator
        //System.out.println(teacherList);
        //TeacherComparator teacherComparator = new TeacherComparator();
        //Collections.sort(teacherList, teacherComparator);
        //System.out.println(teacherList);

        System.out.println("---");

        // Lambda Expression
        System.out.println(teacherList);
        Collections.sort(teacherList, (t1, t2) -> {
            return t1.getId() - t2.getId();
        });
        System.out.println(teacherList);

        System.out.println("----------");

        // Stream API
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> oddNumber = integerList.stream().filter((i) -> i % 2 != 0).collect(Collectors.toList());
        System.out.println(oddNumber);
        System.out.println(integerList);
    }
}
