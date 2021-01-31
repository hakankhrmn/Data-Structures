package BinaryTrees;

public class BinaryTree {
    BinaryTreeNode root = null;

    /* Creates, initializes and returns
     * a binary tree node
     */
    public BinaryTreeNode CreateNode(int key){
        BinaryTreeNode node = new BinaryTreeNode();
        node.key = key;
        node.left = null;
        node.right = null;
        return node;
    } /* CreateNode */
}
