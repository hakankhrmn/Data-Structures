package AVLTrees;

public class Node {
    public int key, height;
    public int count;
    public Node left;
    public Node right;

    Node(int key) {
        this.key = key;
        this.height = 1;

        this.count=1;
    }
}
