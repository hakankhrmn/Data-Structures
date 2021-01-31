package Trees;

public class TreeNode {
    int key;
    TreeNode firstChild,sibling;

    public TreeNode(int key){
        this.key=key;
        firstChild=null;
        sibling=null;
    }
}
