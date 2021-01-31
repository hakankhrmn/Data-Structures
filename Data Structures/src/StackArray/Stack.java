package StackArray;

public class Stack {

    private static int N = 100; // size of the stack
    private int S[]; //StackArray.Stack elements are positive integers
    private int top; // Current top of the stack

    Stack(){
        S = new int[N];
        top = -1;
    }

    public int Push(int item){
        if (isFull()){
            // StackArray.Stack is full. Can’t insert the new element
            System.out.println("StackArray.Stack overflow");
            return -1;
        }
        top++;
        S[top] = item;
        return 0;
    }

    public int Pop(){
        if (isEmpty()){
            // StackArray.Stack is empty! Return error
            System.out.println("StackArray.Stack underflow");
            return -1;
        } //end-if
        int idx = top; // Save current top
        top--; // Remove the item
        return S[idx];
    }

    public int Top(){
        if (isEmpty()){
            // StackArray.Stack is empty! Return error
            System.out.println("StackArray.Stack underflow");
            return -1;
        } //end-if
        return S[top];

    }

    public boolean isEmpty(){
        if (top < 0) return true;
        else return false;
    }

    public boolean isFull(){
        if (top == N-1) return true;
        else return false;
    }
}
