package BinaryTrees;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree =new BinaryTree();
        tree.root = tree.CreateNode(4);
        tree.root.left = tree.CreateNode(6);
        tree.root.right = tree.CreateNode(12);
        tree.root.left.left = tree.CreateNode(45);
        tree.root.right.left = tree.CreateNode(7);
        tree.root.right.right = tree.CreateNode(1);
    }
}
