package QueueArray;

public class Queue {

    private static int N = 100; // size of the queue
    private int Q[]; // Array holding the queue elements (ints)
    private int front; // front of the queue
    private int rear; // rear of the queue
    private int noItems; // # of items in the queue

    Queue(){
        Q = new int[N];
        front = rear = noItems = 0;
    }

    public boolean isEmpty(){
        return noItems == 0;
    }

    public boolean isFull(){
        return noItems == N;

    }

    public int Enqueue(int item){
        if (isFull()){
            System.out.println("QueueArray.Queue is full");
            return -1;
        } //end-if
        Q[rear] = item; // Put the new item at the end
        rear++; if (rear == N) rear = 0; // Now move rear
        noItems++; // One more item in the queue
        return 0;

    }

    public int Dequeue(){
        int idx = -1;
        if (isEmpty()){
            System.out.println("QueueArray.Queue is empty");
            return -1;
        } //end-if
        idx = front; // This is where the first item is.
        front++; if (front == N) front = 0; // Move front
        noItems--; // One less item in the QueueArray.Queue
        return Q[idx]; // Return the item
    }
}
