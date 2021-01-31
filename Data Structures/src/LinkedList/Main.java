package LinkedList;

import LinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {

        /**
        BinaryTreeTraversal stringTree= new BinaryTreeTraversal();

        stringTree.root = new BinaryTreeNode("A");
        stringTree.root.left = new BinaryTreeNode("C");
        stringTree.root.right = new BinaryTreeNode("D");
        stringTree.root.left.left = new BinaryTreeNode("P");                    //week 9 tree yazdırıyoruz.
        stringTree.root.right.left = new BinaryTreeNode("Z");
        stringTree.root.right.right = new BinaryTreeNode("I");
        stringTree.root.right.left.left = new BinaryTreeNode("M");
        stringTree.root.right.right.right = new BinaryTreeNode("K");

        System.out.print("Preorder: ");
        stringTree.printPreorderTraversal(stringTree.root);
        System.out.println("\n");
        System.out.print("Postorder: ");
        stringTree.printPostorderTraversal(stringTree.root);
        System.out.println("\n");
        System.out.print("Inorder: ");
        stringTree.printInorderTraversal(stringTree.root);

*/

        //Lİnket list denemesi


        LinkedList list = new LinkedList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        //list.PrintList();

        list.remove(8);
        list.PrintList();





    }
}
