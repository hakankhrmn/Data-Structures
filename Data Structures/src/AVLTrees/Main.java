package AVLTrees;

public class Main {
    public static void main(String[] args) {


        AVLTree tree = new AVLTree();


        tree.Insert(10);
        tree.Insert(20);
        tree.Insert(30);
        tree.Insert(40);
        tree.Insert(50);
        tree.Insert(25);
        tree.Insert(30);


        tree.Delete(30);
        tree.Delete(30);
        //System.out.println("count:"+tree.Find(30).count);
        System.out.println("height of 25:"+tree.Find(25).height);
        System.out.println("max:"+tree.Max().key);
        System.out.println("min:"+tree.Min().key);
        System.out.println("depth:"+tree.Depth());
        System.out.println("number:"+tree.NoOfNodes());
        System.out.println("root:"+tree.Root().key);

        System.out.println("Inorder traversal" + " of constructed tree is : ");
        tree.Print();

        System.out.println(tree.height(tree.Find(50)));

    }
}
