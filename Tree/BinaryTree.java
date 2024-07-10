class Node{
    int val;
    Node left;
    Node right;
    public Node(int val){
        this.val=val;
    }
}
class BinaryTree {
    Node root;
    public void insert(int val){
        root=fetch(root,val);
    }
    public Node fetch(Node root,int val){
        if(root==null){
            root=new Node(val);
        }
        else if(root.val>val){
            root.left=fetch(root.left,val);
        }
        else if(root.val<val){
            root.right=fetch(root.right,val);
        }
        return root;
    }
    public void dis(){
        display(root);
    }
    // //inorder trav--->L,Root,R
    // public void display(Node root){
    //     if(root!=null){
    //         display(root.left);
    //         System.out.println(root.val);
    //         display(root.right);


    //     }
    // }
    // //Preorder trav--->Root,L,R
    // public void display(Node root){
    //     if(root!=null){
            
    //         System.out.println(root.val);
    //         display(root.left);
    //         display(root.right);


    //     }
    // }
    //Postorder trav--->L,R,Root
    public void display(Node root){
        if(root!=null){
            display(root.left);
            display(root.right);
            System.out.println(root.val);
            


        }
    }
    
}
