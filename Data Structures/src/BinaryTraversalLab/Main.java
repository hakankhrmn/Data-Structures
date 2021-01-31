package BinaryTraversalLab;

public class Main {


    // Driver method
    public static void main(String[] args)
    {
        BinaryTree	stringTree = new BinaryTree();

        // In order to use this three for different class,
        // I separated data structures from the class which contains traversal algorithms

        stringTree.root = new Node("A");
        stringTree.root.left = new Node("C");
        stringTree.root.right = new Node("D");
        stringTree.root.left.left = new Node("P");
        stringTree.root.right.left = new Node("Z");
        stringTree.root.right.right = new Node("I");
        stringTree.root.right.left.left = new Node("M");
        stringTree.root.right.right.right = new Node("K");

        // testing recursive algorithms

        System.out.println(" ******** Recursive Traversal Algorithms ********");
        BinaryTreeTraversal recursiveTraverse = new BinaryTreeTraversal(stringTree);
        System.out.println("Preorder traversal of binary tree is : ");
        recursiveTraverse.printPreOrder(stringTree.root);
        System.out.println("\nInorder Traversal : ");
        recursiveTraverse.printInOrder(stringTree.root);
        System.out.println("\nPostorder Traversal : ");
        recursiveTraverse.printPostOrder(stringTree.root);

        //  testing iterative traversal algorithms

        System.out.println("\n ********Iterative Traversal Algorithms ********");
        iterativeTraversalWithStack iterativeTraverse = new iterativeTraversalWithStack(stringTree);
        System.out.println("Preorder traversal of binary tree is : ");
        iterativeTraverse.iterativePreorder(stringTree.root);
        System.out.println("\nInorder traversal of binary tree is : ");
        iterativeTraverse.iterativeInorder(stringTree.root);
        System.out.println("\nPostorder traversal of binary tree is : ");
        iterativeTraverse.iterativePostorder(stringTree.root);


        //  testing level-by-level traversal algorithm
        System.out.println("\n ********Level-by-level Traversal Algorithms ********");
        LevelByLevel levelTraverse = new LevelByLevel(stringTree);
        System.out.println("Level-by-level iterative Traversal : ");
        levelTraverse.printLevelOrder();
        System.out.println("\n Level-by-level traversal with With a QueueArray.Queue : ");
        levelTraverse.printLevelOrderQueue();
    } //end-of-main

}
