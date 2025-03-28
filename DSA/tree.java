import java.util.LinkedList;
import java.util.Queue;

public class tree {
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
    

    public static void preorder(Node root){
    if(root==null){
        return;
    }
    System.out.println(root.data);
    preorder(root.left);
    preorder(root.right);
    }
    
    public static void inorder(Node root){
    if(root==null){
        return;
    }
    
    inorder(root.left);
    System.out.println(root.data);
    inorder(root.right);
    }
    public static void postorder(Node root){
    if(root==null){
        return;
    }
    
    postorder(root.left);
    postorder(root.right);
    System.out.println(root.data);
    }

    public static void levelorder(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root==null){
            System.out.println("tree empty");
            return;
        }
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
         Node currNode = q.remove();
          if(currNode ==null){
           System.out.println();
           if(q.isEmpty()){
            break;

           }
           else{
            q.add(null);
           }
          } 
          else{
          System.out.print(currNode.data);
          if(currNode.left != null){
            q.add(currNode.left);
          }
          if(currNode.right != null){
            q.add(currNode.right);
          }
          }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        levelorder(root);
    }
}