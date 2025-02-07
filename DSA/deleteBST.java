public class deleteBST{
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

  public static boolean serchBST(Node root ,int key){
    /*
    ITS WRITTEN BY ME .... BELOW CODE IS ALSO CORRECT
    if(root==null){
        return false;
    }
    if(root.data==key){
      return true;
    }
   return serchBST(root.left, key)||serchBST(root.right, key);
   */
 if(root==null){
        return false;
    }
    if(root.data==key){
        return true;
    }
    else if(root.data < key){
     return serchBST(root.right, key);
    }
    else{
     return serchBST(root.left, key);
    }

  }
  
  public static Node delete(Node root , int val){
    if(root.data > val){
     root.left=delete(root.left , val);
    }
    else if(root.data < val){
      root.right=delete(root.right , val);  
    }
    else{ //root.data==val;
    //case 1:
    if(root.left==null&&root.right==null){
        return null;

    }
   //case 2:
   if(root.left==null){
    return root.right;
   }
   else if(root.right==null){
    return root.left;
   }
   //case 3:
    Node IS = inordersucccesor(root.right);
    root.data=IS.data;
    root.right=delete(root.right ,IS.data);
    }
    return root;

  }

  public static Node inordersucccesor(Node root){
  while(root.left != null){
    root = root.left;

  }
  return root;
  }
public static void main(String[] args) {
    int values[]={5,1,3,4,2,7};
    Node root=null;
    for(int i =0 ; i<values.length ; i++){
        root=insertbst(root, values[i]);
    }
    inorder(root);
     delete(root, 4);
     System.out.println("deleting.....");
      inorder(root);
}
}