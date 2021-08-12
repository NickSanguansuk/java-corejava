package topics.collection_map_demo.linkedlist_demo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------");
        System.out.println("LinkedList");

        // LinkedList implements these interfaces:
        //      Iterable<E>
        //      Collection<E>
        //      List<E>
        //      Queue<E>
        //      Deque<E>
        //      Cloneable
        //      Serializable

        // LinkedList:
        // Each element has memory addresses of the previous and next item used internally.
        // A linked list is a linear collection of data elements whose order is not given by their physical placement in memory.
        // Instead, each element points to the next element.
        // Its  data structure consisting of a collection of nodes which together represent a sequence.
        // Each node contains: data, and a reference (in other words, a link) to the next node in the sequence.
        //  In a linked list, each node contains, besides the next-node link, a second link field pointing to the 'previous' node in the sequence.
        //  The two links may be called 'forward('s') and 'backwards', or 'next' and 'prev'('previous').

        // Here are a few of the LinkedList methods:
        // add(E e)			    appends an element to the end of the list
        // add(int index, E e)	inserts an element at the specified index
        // get(int index)		returns the element at the specified index
        // set(int index, E e)	replaces the element at the given index with e.
        // indexOf(Object o)	returns the index of the specified element, or -1 if the 					element is not found
        // remove(int index)	removes and returns the element at the given index
        // size()			    returns the number of elements in the list

        Queue q0 = new LinkedList();
        Queue<String> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        List list0 = new LinkedList();
        List<String> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        LinkedList<String> linkedList1 = new LinkedList<>();

        System.out.println("----------");
        System.out.println(".add() and .offer() ---> from Queue");

        linkedList1.add("A");
        linkedList1.add("B");
        linkedList1.add("C");
        linkedList1.add("D");
        linkedList1.add("E");
        linkedList1.offer("F");
        linkedList1.offer("G");

        System.out.println("----------");

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(4, 2, 5, 3, 1));
        System.out.println(linkedList);

    }
}
