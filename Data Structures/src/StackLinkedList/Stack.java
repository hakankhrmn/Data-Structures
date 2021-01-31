package StackLinkedList;

public class Stack {

    private Node top; // StackArray.Stack only has a top

    Stack(){
        top=null;
    }

    public void Push(int item){
        Node x = new Node(item);
        x.next = top;
        top = x;
    }

    public int Pop(){
        if (isEmpty()){
            System.out.println("StackArray.Stack underflow"); // Empty stack.
            return -1; // error
        }
        // Keep a pointer to the current top of the stack
        Node tmp = top;
        // Move the top of the stack to the next node
        top = top.next;
        // Return the item
        return tmp.item;
    }

    public int Top(){
        if (isEmpty()){
            System.out.println("StackArray.Stack underflow"); // Empty stack.
            return -1; // error
        } //end-if
        return top.item;
    }

    public boolean isEmpty(){
        if (top == null) return true;
        else return false;
    }
}
