




public class Reverselinkedlist{
    private int size;
    Reverselinkedlist(){
        this.size =0;
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        Node head;
    // add - first , last
    public void addfist(int data){
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
    public void addlast(int data){
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
  public void reverseiter(){
    if(head == null || head.next == null){
        return ;
        
    }
    
    Node previouNode = head;
    Node currNode = head.next;
    
    while(currNode != null) { 
       Node nextNode = currNode.next;
       currNode.next = previouNode;
       //update
       previouNode = currNode;
       currNode= nextNode;
    }
    head.next=null;
    head = previouNode;
   
   }

  
    public static void main(String[] args) {
     Reverselinkedlist list = new Reverselinkedlist();
  list.addlast(1);
  list.addlast(2);
  list.addlast(3);
  list.addlast(4);
    list.printlist();

 list.reverseiter();
  list.printlist();
    }
}