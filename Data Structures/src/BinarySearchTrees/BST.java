package BinarySearchTrees;

public class BST {
    private BSTNode root;

    public BST(){root=null;}

    public void Insert(int key){
        BSTNode pp = null; /* pp is the parent of p */
        BSTNode p = root; /* Start at the root and go down */
        while (p != null){
            pp = p;
            if (key == p.key) return; /* Already exists */
            else if (key < p.key) p = p.left;
            else /* key > p.key */ p = p.right;
        } /* end-while */
        BSTNode z = new BSTNode(); /* New node to store the key */
        z.key = key; z.left = z.right = null;
        if (root == null) root = z; /* Inserting into empty tree */
        else if (key < pp.key) pp.left = z;
        else pp.right = z;
    }

    public void Delete(int key){}

    public BSTNode Find(int key){
        BSTNode p = root;
        while (p != null){
            if (key == p.key) return p;
            else if (key < p.key) p = p.left;
            else /* key > p.key */ p = p.right;
        } /* end-while */
        return null;

        //return DoFind(root, key);    //for not iterative
    }

      /* for not iterative
    private BSTNode DoFind(BSTNode root,
                   int key){
        if (root == null) return null;
        if (key == root.key)
            return root;
        else if (key < root.key)
            return DoFind(root.left, key);
        else  if(key > root.key)
            return DoFind(root.right, key);
    }
    */

    public BSTNode Min(){
        if (root == null)
            return null;
        BSTNode p = root;
        while (p.left != null){
            p = p.left;
        } //end-while
        return p;
    }

    public BSTNode Max(){
        if (root == null)
            return null;
        BSTNode p = root;
        while (p.right != null){
            p = p.right;
        } //end-while
        return p;
    }
}
