public class Queuelinked {
   static  class node{
        int data;
        node next;

       node(int data) {
        this.data = data;
        next = null;

        }
  
    }

    static class queue{
     static node head = null;
     static node tail =null;


    public static boolean  isempty(){
        return head==null&&tail==null;
    }


    public static void enqueue(int data){
      node newnode =  new node(data); 
      if(tail==null){
        head=tail=newnode;
      }
      tail.next = newnode;
      tail = newnode;

    }


    public static int dequeue(){
      if(isempty())  {
        System.out.println("can't pop an element :");
        return -1;
      }
      if(head== tail){
        tail=null;
      }
      int f = head.data;
      head= head.next;
      return f;
    }




    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}