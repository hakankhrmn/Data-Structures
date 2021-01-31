package QueueArray;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        if (q.isEmpty()){
            System.out.println("Queue is empty"); // Q empty now
        }
        q.Enqueue(49);
        q.Enqueue(23);
        System.out.println("Front of the Q is: " + q.Dequeue()); // prints 49
        q.Enqueue(44);
        q.Enqueue(22);
        System.out.println("Front of the Q is: " + q.Dequeue()); // prints 23
        System.out.println("Front of the Q is: " + q.Dequeue()); // prints 44
        System.out.println("Front of the Q is: " + q.Dequeue()); // prints 22.
        System.out.println("Front of the Q is: " + q.Dequeue()); // prints -1
        if (q.isEmpty()){
            System.out.println("Queue is empty"); // Q empty now
        }
        System.out.println("Using Array");
    }
}
