package topics.collection_map_demo.linkedlist_demo.demo3_custom_doublylinkedlist;

public class Runner {

    public static void main(String[] args) {

        DoubleLinkedList list = new DoubleLinkedList();
        list.addFirst(3);
        list.addFirst(9);
        list.addFirst(40);
        list.add(7);
        list.addFirst(17);
        list.addLast(22);
        list.addFirst(91);
        list.addLast(4);

        System.out.println(list); // [91, 17, 40, 9, 3, 7, 22, 4]
        System.out.println("----------");

        list.add(1, 33);

        System.out.println(list); // [91, 33, 17, 40, 9, 3, 7, 22, 4]
        System.out.println("----------");

        System.out.println("removeFirst()");
        list.removeFirst();

        System.out.println(list); // [33, 17, 40, 9, 3, 7, 22, 4]
        System.out.println("----------");

        System.out.println("removeLast()");
        list.removeLast();

        System.out.println(list); // [33, 17, 40, 9, 3, 7, 22]
        System.out.println("----------");

        System.out.println("remove at index 3");
        list.remove(3);

        System.out.println(list); // [33, 17, 40, 3, 7, 22]
        System.out.println("----------");
    }
}
