package SplayTreesLab;

public class Node {
    Node left;
    String data;
    Node right;
    Node parent;
    public Node(String key){
        left=null;
        right=null;
        parent=null;
        data=key;
    }
}
