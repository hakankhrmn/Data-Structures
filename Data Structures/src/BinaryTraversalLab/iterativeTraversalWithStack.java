package BinaryTraversalLab;

import java.util.Stack;

public class iterativeTraversalWithStack {

    BinaryTree root;

    iterativeTraversalWithStack(BinaryTree treeRoot) {
        root = treeRoot;
    }

    // An iterative process to print preorder traversal of Binary tree
    void iterativePreorder(Node node) {

        // base Case
        if (node == null) {
            return;
        }

        // Create an empty stack and push root to it
        Stack<Node> nodeStack = new Stack<Node>();
        nodeStack.push(root.root);

        // here the coder used java's util class in order to simply this snippet, you may built your own stack

		/* Pop all items one by one. Do following for every popped item
         a) print it
         b) push its right child
         c) push its left child
         Note that right child is pushed first so that left is processed first */
        while (nodeStack.empty() == false) {

            // Pop the top item from stack and print it
            Node mynode = nodeStack.peek();
            System.out.print(mynode.key + " ");
            nodeStack.pop();

            // Push right and left children of the popped node to stack
            if (mynode.right != null) {
                nodeStack.push(mynode.right);
            }
            if (mynode.left != null) {
                nodeStack.push(mynode.left);
            }
        }
    }// end-of-iterativePreorder


    // fill this methods yourself
    void iterativeInorder(Node node) {

    }// end-of-iterativePreorder

    void iterativePostorder(Node node) {

    }// end-of-iterativePreorder

}
