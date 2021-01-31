package AVLTrees;

public class AVLTree {
    private Node root;
    private int noOfNodes;

    public AVLTree(){root=null; noOfNodes=0;}

    public Node Root(){return root;}


    public int NoOfNodes(){return noOfNodes;}


    public Node Find(int key){
        Node node=root;
        node=findRecursive(node,key);
        return node;
    }


    public Node Min(){

        Node current = root;

        /* loop down to find the leftmost leaf */
        while (current.left != null)
            current = current.left;

        return current;

    }

    public Node Max(){
        Node current = root;

        /* loop down to find the leftmost leaf */
        while (current.right != null)
            current = current.right;

        return current;
    }

    public int Depth(){
        return root.height-1;
    }

    public Node Insert(int key){
        root=insertRecursive(root,key);
        noOfNodes++;
        return root;
    }

    public int Delete(int key){
        Node node=root;
        root=deleteRecursive(root,key);
        if (node==root){
            noOfNodes--;
            return 0;
        }
        return -1;
    } //end-Delete

    public void Print(){
        inOrderPrintRecursive(root);
    }

    public int height(Node node) {

        if (node == null){
            return 0;
        }
        else{
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            return max(leftHeight, rightHeight) + 1;

        }


    }



    private Node findRecursive(Node node, int key){
        if (node==null || node.key==key){
            return node;
        }else if (node.key > key){
            return findRecursive(node.left,key);
        }else if(node.key < key){
            return findRecursive(node.right,key);
        }
        return null;
    }

    private int max(int a, int b) {
        return (a > b) ? a : b;
    }

    private int min(int a, int b) {
        return (a < b) ? a : b;
    }


    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;


        // Return new root
        return x;
    }


    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        //  Update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }


    private int getBalance(Node node) {
        if (node == null)
            return 0;

        return height(node.left) - height(node.right);
    }

    private Node insertRecursive(Node node, int key) {

        /* 1.  Perform the normal BST insertion */
        if (node == null)
            return (new Node(key));

        if (key < node.key)
            node.left = insertRecursive(node.left, key);
        else if (key > node.key)
            node.right = insertRecursive(node.right, key);
        else if (key == node.key){
            node.right = insertRecursive(node.right, key);
            node.count++;
            node.right.count++;
        }


        /* 2. Update height of this ancestor node */
        node.height = 1 + max(height(node.left),
                height(node.right));


        /* 3. Get the balance factor of this ancestor
              node to check whether this node became
              unbalanced */
        int balance = getBalance(node);

        // If this node becomes unbalanced, then there
        // are 4 cases Left Left Case
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // Right Right Case
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // Left Right Case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        if (balance > 1 && key == node.left.key)
            return rightRotate(node);

        // Right Right Case
        if (balance < -1 && key == node.right.key)
            return leftRotate(node);

        /* return the (unchanged) node pointer */
        return node;
    }

    private Node deleteRecursive(Node node, int key){
        // STEP 1: PERFORM STANDARD BST DELETE
        if (node == null)
            return node;

        // If the key to be deleted is smaller than
        // the root's key, then it lies in left subtree
        if (key < node.key)
            node.left = deleteRecursive(node.left, key);

            // If the key to be deleted is greater than the
            // root's key, then it lies in right subtree
        else if (key > node.key)
            node.right = deleteRecursive(node.right, key);

            // if key is same as root's key, then this is the node
            // to be deleted
        else
        {

            // node with only one child or no child
            if ((node.left == null) || (node.right == null))
            {
                Node temp = null;
                if (temp == node.left)
                    temp = node.right;
                else
                    temp = node.left;

                // No child case
                if (temp == null)
                {
                    temp = node;
                    node = null;
                }
                else // One child case
                    node = temp; // Copy the contents of
                // the non-empty child
            }
            else
            {

                // node with two children: Get the inorder
                // successor (smallest in the right subtree)
                Node temp = minValueNode(node.right);

                // Copy the inorder successor's data to this node
                node.key = temp.key;

                // Delete the inorder successor
                node.right = deleteRecursive(node.right, temp.key);
            }
        }

        // If the tree had only one node then return
        if (node == null)
            return node;

        // STEP 2: UPDATE HEIGHT OF THE CURRENT NODE
        node.height = max(height(node.left), height(node.right)) + 1;

        // STEP 3: GET THE BALANCE FACTOR OF THIS NODE (to check whether
        // this node became unbalanced)
        int balance = getBalance(node);

        // If this node becomes unbalanced, then there are 4 cases
        // Left Left Case
        if (balance > 1 && getBalance(node.left) >= 0)
            return rightRotate(node);

        // Left Right Case
        if (balance > 1 && getBalance(node.left) < 0)
        {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Right Case
        if (balance < -1 && getBalance(node.right) <= 0)
            return leftRotate(node);

        // Right Left Case
        if (balance < -1 && getBalance(node.right) > 0)
        {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    private Node minValueNode(Node node)
    {
        Node current = node;

        /* loop down to find the leftmost leaf */
        while (current.left != null)
            current = current.left;

        return current;
    }
    private void inOrderPrintRecursive(Node node) {
        if (node != null) {
            inOrderPrintRecursive(node.left);
            System.out.print(node.key + " ");
            inOrderPrintRecursive(node.right);
        }
    }
}
