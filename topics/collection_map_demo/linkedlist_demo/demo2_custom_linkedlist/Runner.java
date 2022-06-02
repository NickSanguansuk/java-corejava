package topics.collection_map_demo.linkedlist_demo.demo2_custom_linkedlist;

public class Runner {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(5);
        list.add(7);
        list.add(10);
        list.print();
        System.out.println("-----");
        list.remove(7);
        list.print();
    }
}
