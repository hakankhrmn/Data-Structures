package QueueLinkedList;

public class Queue {

    private Node front; // Ptr to the front of the Q
    private Node rear; // Ptr to the rear of the Q

    Queue(){
        front = rear = null;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public void Enqueue(int item){
        // Allocate a QueueNode for the item
        Node node = new Node(item);
        if (front == null){
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        } //end-else
    }
    public int Dequeue(){
        if (isEmpty()){
            System.out.println("QueueArray.Queue is empty");
            return -1;
        } //end-if
        Node tmp = front; // Keep a ptr to the front node
        front = front.next; // Remove the front node
        if (front == null) rear = null; // Empty Q?
        // Return the item
        return tmp.item;
    }
}
