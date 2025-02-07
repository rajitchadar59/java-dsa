public class Treeq{

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {

        static int index = -1;

        public static Node buildTree(int nodes[]) {
            index++;
            if (index >= nodes.length || nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }


 //   Q- NUMBER OF NODES IN THE TREE ???
    public static int numberofnodes(Node root) {
       if(root==null){
       return 0;
       }
       
       int leftnode = numberofnodes(root.left);
       int rightnode = numberofnodes(root.right);
       return leftnode+rightnode+1;
    }
    //   Q- SUM OF ALL  NODES IN THE TREE ???
   public static int sumofnodes(Node root){

      if(root==null){
       return 0;
       }
       
       int leftsum = sumofnodes(root.left);
       int rightsum = sumofnodes(root.right);
       return leftsum+rightsum+root.data;

   }
    // Q-Height of a treee ???
   public static int hight(Node root){
    if(root == null){
        return 0;

    }
    int leftheight= hight(root.left);
    int rightheight = hight(root.right);

    int myheight =  Math.max(leftheight ,rightheight );
     return myheight+1;
   }
// Q-Diameter  of a treee ???
//approch 1
    public static int diameter(Node root){
        if(root==null){
            return 0 ;
        }  
        int dia1=diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = hight(root.left)+hight(root.right)+1;
        return Math.max(dia3, Math.max(dia1, dia2) );
    }

//approch 2
static class treeinfo{
    int hi;
    int dia;
    treeinfo(int height , int diameter){
        this.hi=height;
        this.dia=diameter;
    }
}

public static treeinfo diameter2(Node root){
    if (root==null) {
       return new treeinfo(0,0);
    }
    treeinfo left = diameter2(root.left);
    treeinfo right = diameter2(root.right);
    int myheihgt = Math.max(left.hi ,right.hi)+1;
     int dia1= left.dia;
     int dia2= right.dia;
     int dia3= left.hi+right.hi+1;

     int mydia = Math.max(dia1 , Math.max(dia2 ,dia3));
    treeinfo myinfo = new treeinfo(myheihgt , mydia);
    return myinfo;

}
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("sum :"+diameter2(root).dia);
    }
}







//Q-   subtree of a treee
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     public boolean isidentical(TreeNode root, TreeNode subRoot){
//      if(root==null && subRoot==null){
//         return true;
//      }
//      if(root==null||subRoot==null){
//         return false;
//      }
//      if(root.val ==subRoot.val){
//      return isidentical(root.left , subRoot.left) && isidentical(root.right , subRoot.right);
//      }
//      return false;
//     }
//     public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//         if(subRoot==null){
//             return true;
//         }
//         if(root==null){
//             return false;
//         }
//         if(root.val == subRoot.val){
//         if(isidentical(root ,subRoot)){
//             return true;
//         }
        
//         }

//         return   isSubtree(root.left , subRoot) || isSubtree(root.right , subRoot);
        
//     }
// }