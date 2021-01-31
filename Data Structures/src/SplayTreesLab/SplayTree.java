package SplayTreesLab;

public class SplayTree {

    public Node root;
    public SplayTree(){
        root=null;
    }

    public void splay(Node n){

        while (n.parent!=null){ // n became root

            if(n.parent ==root){

                if (n==n.parent.left){
                    rotateRight(n.parent);

                }else if (n==n.parent.right){
                    rotateLeft(n.parent);

                }
            }
            else{
                Node tParent=n.parent;
                Node gParent=n.parent.parent;

                if ((tParent.left==n)&&(gParent.left==tParent)){
                    rotateRight((gParent));
                    rotateRight(tParent);
                }else  if ((tParent.right==n)&&(gParent.left==tParent)){
                    rotateLeft((gParent));
                    rotateRight(tParent);
                }else  if ((tParent.right==n)&&(gParent.right==tParent)){
                    rotateLeft((gParent));
                    rotateLeft(tParent);
                }else  if ((tParent.left==n)&&(gParent.right==tParent)){
                    rotateRight((gParent));
                    rotateLeft(tParent);
                }
            }


        }
    }

    private void rotateLeft(Node subRoot) {

        ///////////Tekrar bak

        Node tobeRoot=subRoot.left;

        subRoot.right=tobeRoot.left;

        //tobeRoot.right=subRoot;

        //////////
        if (tobeRoot.right !=null){
            tobeRoot.right.parent=tobeRoot;
        }
        if (subRoot.parent==null){
            root=tobeRoot;
        }

        else if (subRoot==subRoot.parent.left){
            subRoot.parent.left=tobeRoot;
        }

        else if (subRoot==subRoot.parent.right){
            subRoot.parent.right=tobeRoot;
        }
        else{
            subRoot.parent.right=tobeRoot;
        }
        tobeRoot.right=subRoot;
        subRoot.parent=tobeRoot;

    }

    private void rotateRight(Node subRoot) {
        Node tobeRoot=subRoot.left;

        subRoot.left=tobeRoot.right;

        //tobeRoot.right=subRoot;

        //////////
        if (tobeRoot.right !=null){
            tobeRoot.right.parent=tobeRoot;
        }
        if (subRoot.parent==null){
            root=tobeRoot;
        }

        else if (subRoot==subRoot.parent.left){
            subRoot.parent.left=tobeRoot;
        }

        else if (subRoot==subRoot.parent.right){
            subRoot.parent.right=tobeRoot;
        }
        else{
            subRoot.parent.right=tobeRoot;
        }
        tobeRoot.right=subRoot;
        subRoot.parent=tobeRoot;
    }


}
