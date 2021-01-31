package Trees;

public class Tree {
    TreeNode root;
    public TreeNode addSibling(TreeNode node,int key){
        if (node==null){
            return null;
        }else if (node.sibling!=null){
            node=node.sibling;
            return addSibling(node,key);
        }
        node.sibling=new TreeNode(key);
        return node;
    }

    public TreeNode addChild(TreeNode node,int key){
        if (node==null){
            return null;
        }else if (node.sibling!=null){
            node=node.firstChild;
            return addSibling(node,key);
        }
        node.sibling=new TreeNode(key);
        return node;
    }

}
