package LinkedListLab;



public class LinkedList {

    Node head; // head of list


// **********************************************************************

    // This function first builds new node with the given data
    // than adds it to the LinkedList
    // new nodes are added to the tail of LinkedList

    public static LinkedList insert(LinkedList list, int data) {

        Node new_node = new Node(data) ;
        new_node.next = null;
        //if the LinkedList is empty
        if(list.head == null) {
            list.head = new_node;
        }


        //traverse through the last node
        else {
            Node last = list.head;
            while(last.next != null) {

                last = last.next;
            }
            last.next = new_node;

        }

        return list;
    }
// **********************************************************************

    // overload this method as new nodes are added to given position (int pos)
    // fill the rest
    public static LinkedList insert(LinkedList list, int data, int pos) {

        Node new_node = new Node(data) ;
        new_node.next = null;


        return list;
    }

// **********************************************************************

    // This method finds how many node are exist in LinkedList
    public static int findSize(LinkedList list) {
        int LinkedListSize=0;


        return LinkedListSize;
    }
// **********************************************************************

    // This functions delete a node in the LinkedList by a given "data"
    // parameter name changed as key in order to prevent confusion

    public static LinkedList deleteByKey(LinkedList list, int key) {
        Node currentNode = list.head;  // make a copy of head

        // iterate  through	LinkedList and search for a node which's data == key

        // Case 1 :  If head node itself holds the key to be deleted

        // Case 2 :  If the key is somewhere other than at head

        // Case 3 :  The key cannot be found


        return list;

    }

// **********************************************************************

    // This functions delete a node in the LinkedList by a given position
    public static LinkedList deleteByPosition(LinkedList list, int pos) {
        Node currentNode = list.head;  // make a copy of head

        // Case 1:  If pos is 0, then head node itself is to be deleted


        // Case 2:  If the index is greater than 0 but less than the size of LinkedList


        // Case 3:  If pos greater than size of LinkedList


        return list;
    }


// **********************************************************************

    // That function prints  the LinkenList
    public static void PrintList(LinkedList list) {


        Node currentNode = list.head;  // make a copy of head

        // never operate on "head", otherwise you will lost the linkedlist
        //unless you want to change "head"

        while(currentNode != null) {
            System.out.println(currentNode.data + " ");

            currentNode = currentNode.next;  // iterate to next node
        }}

    // **********************************************************************


}
