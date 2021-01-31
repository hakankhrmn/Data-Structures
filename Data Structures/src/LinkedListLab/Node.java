package LinkedListLab;

// Node is a data struct to build a Linked list
public class Node {

    int data;
    Node next;

//  Node previous --> if you need to build double link list

    // constructor
    // Next is initialized as null by default
    // otherwise, it crashes on run

    Node(int d)
    {
        data = d;
        next = null;
    }


}
