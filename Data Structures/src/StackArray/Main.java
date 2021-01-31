package StackArray;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        if (s.isEmpty()){
            System.out.println("Stack is empty"); // Empty stack
        }
        s.Push(49);
        s.Push(23);
        System.out.println("Top of the stack is: " + s.Pop()); // prints 23
        s.Push(44);
        s.Push(22);
        System.out.println("Top of the stack is: " + s.Pop()); // prints 22
        System.out.println("Top of the stack is: "+ s.Pop()); // prints 44
        System.out.println("Top of the stack is: " + s.Top()); // prints 49.
        System.out.println("Top of the stack is: " + s.Pop()); // prints 49.
        if (s.isEmpty()){
            System.out.println("Stack is empty"); // Empty stack
        }

    }
}
