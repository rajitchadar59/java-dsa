public class Ll{
    private int size;
    Ll(){
        this.size =0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
 
   Node head;
    // add - first , last
    public void addfist(String data){
        Node newnode = new Node(data);
        size++;
        if(head==null){
         head = newnode;
         return;

        }

        newnode.next = head;
        head = newnode;
        
    }
    
    //add last
    public void addlast(String data){
        Node newnode = new Node(data);
        if(head==null){
         head = newnode;
         return;

        }

        Node currNode = head;
        while(currNode.next != null){
            currNode= currNode.next;
        }
        currNode.next=newnode;
        size++;
    }
    
    public void printlist(){
        if(head == null){
            System.out.println("list is empty");
        }
         Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode= currNode.next;
        }
        System.out.print("null");
    }
   
   public void deletehead(){

    
     if(head==null){
        System.out.println("list is empty cant delete element");
         return;

        }
        size--;
    head = head.next;

   }

   public void deletend(){
   
       if(head==null){
        System.out.println("list is empty cant delete element");
         return;

        }
        size--;
       if(head.next==null){
        head = null;

       }
        Node backnode = head;
         Node currNode = head.next;
        while(currNode.next != null){
            backnode =backnode.next;  
            currNode= currNode.next;
        }
        backnode.next =null;
   }

   public void size(){
    System.out.println("size:"+size);
   }

    public static void main(String[] args) {
     Ll list = new Ll();
     list.addfist("r"); 
     list.addlast("last");
     list.addfist("a");
     list.addfist("a");
    
     list.printlist();
 
     list.deletend();
     System.out.println();
     list.printlist();
          System.out.println();
    list.size();

    }
}



                    //LINKED LIST USING COLLECTION FRAMEWORK







//  import java.util.LinkedList;
//  public class Ll{
//     public static void main(String[] args) {
     
//      LinkedList<String> list = new LinkedList<>();
//      list.addFirst("r");
//      list.addFirst("a");
//      list.addLast("ry");
//      list.add("rajit"); // by default add at last
//      System.out.print(list);

//      //size
//      System.out.println(list.size());
//      for(int i =0 ; i < list.size() ; i++){
//         System.out.print(list.get(i)+"->");
//      }
//      System.out.println("null");

//      list.removeFirst();
//      System.out.println(list);

//     }

    
// }                    