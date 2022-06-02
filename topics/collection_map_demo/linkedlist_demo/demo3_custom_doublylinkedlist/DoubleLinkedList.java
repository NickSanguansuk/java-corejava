package topics.collection_map_demo.linkedlist_demo.demo3_custom_doublylinkedlist;

public class DoubleLinkedList {

    private Node head;
    private Node tail;

    public DoubleLinkedList() {
    }

    public void add(int data) {
        addLast(data);
    }

    public void add(int index, int data) {
        Node newNode = new Node(data);
        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.getNext();
        }
        newNode.setPrev(curr);
        newNode.setNext(curr.getNext());
        curr.setNext(newNode);
        newNode.getNext().setPrev(newNode);
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            tail = newNode;
        } else {
            head.setPrev(newNode);
        }
        newNode.setNext(head);
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        tail.setNext(newNode);
        newNode.setPrev(tail);
        tail = newNode;
    }

    public int remove(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        temp.getPrev().setNext(temp.getNext());
        temp.getNext().setPrev(temp.getPrev());
        return temp.getData();
    }

    public int removeFirst() {
        Node temp = head;
        head = temp.getNext();
        head.setPrev(null);
        return temp.getData();
    }

    public int removeLast() {
        Node temp = tail;
        tail = temp.getPrev();
        tail.setNext(null);
        return temp.getData();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node curr = head;
        while (curr.getNext() != null) {
            result.append(curr.getData()).append(", ");
            curr = curr.getNext();
        }
        result.append(curr.getData()).append("]");
        return result.toString();
    }

}
