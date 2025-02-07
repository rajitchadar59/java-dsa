import java.util.ArrayList;
public class BSTquestions{
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
 //Q-print node in range x=? to y=? x and y is included
  public static void printinrange(Node root , int x , int y){
    if(root==null){
        return;
    }
    if(root.data >= x && root.data <= y){
      printinrange(root.left, x, y); 
      System.out.println(root.data+" "); 
      printinrange(root.right, x, y);  
    }
    else if(root.data > y){
        printinrange(root.left, x, y);  
    }
    else {
        printinrange(root.right, x, y);
    }
  }

//  Q-root to leaf paths ??


  public static void printpath(ArrayList<Integer> path){
   for(int i =0 ; i <path.size() ; i++){
    System.out.print(path.get(i)+"-->");
    
   } 
   System.out.println();
  }
  public static void printroot2leafpath(Node root ,ArrayList<Integer> path){
    if(root==null){
      
        return;

    }
    path.add(root.data);
    if(root.left==null && root.right==null){
        //for leaf node 
         printpath(path);
          
    }
    else{
        //for non leaf node 
   printroot2leafpath(root.left, path);
   printroot2leafpath(root.right, path);
    }
   
  
   path.remove(path.size()-1);

  }
public static void main(String[] args) {
    int values[]={8,5,3,6,10,11,14};
    Node root=null;
    for(int i =0 ; i<values.length ; i++){
        root=insertbst(root, values[i]);
    }
    printroot2leafpath(root , new ArrayList<>());
}
}