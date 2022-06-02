package topics.collection_map_demo.linkedlist_demo.demo2_custom_linkedlist;

public class MyLinkedList {
    Node head;

    public MyLinkedList() {
        this.head = null;
    }

    public MyLinkedList(Node head) {
        this.head = head;
    }

    public void add(int value) {
        if (this.head == null) {
            head = new Node(value);
            return;
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = new Node(value);
    }

    public MyLinkedList remove(int value) {
        if (this.head == null) {
            return null;
        }
        Node dummy = new Node(0);
        Node prev = dummy;
        prev.next = head;
        Node curr = head;
        while (curr != null) {
            if (curr.data == value) {
                prev.next = curr.next;
                break;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return new MyLinkedList(prev.next);
    }

    public void print() {
        Node tmp = this.head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

}
