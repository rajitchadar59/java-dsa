public class BST{
    static class Node{
     int data;
     Node right;
     Node left;
   Node(int data){
    this.data=data;
    left=null;
    right=null;

   }
    }

 public static Node  insertbst(Node root , int val){
    if(root==null){
    root= new Node(val);
    return root;
    }
    if(root.data > val){
     root.left=  insertbst(root.left , val);
    }
    else{
     root.right=  insertbst(root.right, val);
    }
    return root;

 }
    public static void inorder(Node root){
    if(root==null){
        return;
    }
    
    inorder(root.left);
    System.out.println(root.data);
    inorder(root.right);
    }
    
public static void main(String[] args) {
    int values[]={5,1,3,4,2,7};
    Node root=null;
    for(int i =0 ; i<values.length ; i++){
        root=insertbst(root, values[i]);
    }
    inorder(root);
}
}