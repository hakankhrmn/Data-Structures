package BinaryTraversalLab;

public class BinaryTreeTraversal {
    // Root of Binary Tree
    BinaryTree root;

    BinaryTreeTraversal(BinaryTree treeRoot) {
        root = treeRoot;
    }


    void printPreOrder(Node node) {

        if(node==null) {
            return ;}  // base-case

        System.out.print(node.key + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }


    void printInOrder(Node node) {

        if(node==null) {
            return ;}  // base-case

        printInOrder(node.left);
        System.out.print(node.key + " ");
        printInOrder(node.right);
    }


    void printPostOrder(Node node) {

        if(node==null) {
            return ;}  // base-case

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.key + " ");
    }
}
