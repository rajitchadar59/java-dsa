public class Trie {
    static class Node{
     Node[] children;
     boolean eow;

     public Node(){
       children = new Node[26];//a-z
       for(int i=0 ; i <26 ;i++){
        children[i]=null;
       }
      eow=false;
     }
    }
    static Node root = new Node();
    
   public static void inserttrie(String word){
    Node currNode=root;
   for(int i =0 ; i < word.length() ; i++ ){
    int idx = word.charAt(i)-'a';
    if(currNode.children[idx]==null){
      currNode.children[idx]=new Node(); 
    }
   if(i==word.length()-1){
    currNode.children[idx].eow=true;
   }
    currNode=currNode.children[idx];
   }
   }

   public static boolean serchtrie(String key){
    Node currNode=root;
    for(int i =0 ; i <key.length();i++){
    int idx = key.charAt(i)-'a';
    if(currNode.children[idx]==null){
        return false;

    }
    if(i==key.length()-1 && currNode.children[idx].eow==false){
    return false;
    }
    currNode=currNode.children[idx];
    }
    return true;
   }
   //Q-word break problem

   public static boolean wordBreak(String key){
      if(key.length()==0){
         return true;
      }
      for(int i =1 ; i<= key.length() ; i++){
         String firstpart = key.substring(0,i);
         String secondpart =key.substring(i);
         if(serchtrie(firstpart) && wordBreak(secondpart)){
            return true;

         }
      }
      return false;
      
   }

   //Q-starts with

   public static boolean startsWith(String prefix){
      Node currNode = root;
      for(int i = 0 ; i < prefix.length() ; i++){
         int idx = prefix.charAt(i)-'a';
         if(currNode.children[idx]==null){
            return false;

         }
         else{
            currNode=currNode.children[idx];
         }

      }
      return true;
   }
   
   //Q- unique substring
   public static int countnode(Node root){
      int count=0;
      if(root==null){
         return 0;
      }
      for(int i =0; i<26 ;i++){
      if(root.children[i] !=null){
         count += countnode(root.children[i]);
      }
      }
      return count+1;

   }
   
   public static String ans ="";
   public static void longestword(Node root, StringBuilder str) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                str.append((char) (i + 'a'));
                if (str.length() > ans.length()) {
                    ans = str.toString();
                }
                longestword(root.children[i], str);
                str.deleteCharAt(str.length() - 1);
            }
        }
    }


    public static void main(String[] args) {
    String words[]={"a","bananana","app","appl","ap","apply"};
    for(int i = 0 ; i<words.length ; i++){
      inserttrie(words[i]);
    }
    longestword(root, new StringBuilder(""));
    System.out.println(ans);
    }
}
