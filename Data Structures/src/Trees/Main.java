package Trees;

public class Main {
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.root=new TreeNode(5);
        TreeNode c6=tree.addChild(tree.root,6);
        TreeNode c7=tree.addChild(tree.root,7);
        TreeNode c8=tree.addChild(tree.root,8);
        TreeNode c9=tree.addChild(c8,9);
        TreeNode c10=tree.addChild(c8,10);

        System.out.println("there is no print func yet");
    }
}
