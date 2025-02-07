public class StackusingLinked{

    static  class Node{
        int data;
        Node next;

      public Node(int data){
            this.data = data;
            next= null;

        }
    }

    static class stack{
        public static Node head;
        public static boolean isempty(){
         return head==null;

        }
        public static void push(int data){
            Node newnode =new Node(data);
           if(isempty()){
             head=newnode;
             return;
           }
           newnode.next=head;
           head=newnode;
            
        }

        public static int pop(){
            if(isempty()){
                System.out.println("cant pop an element because stack is empty");
                return -1;
            }
            int x= head.data;
            head = head.next;
            return x;

        }

        public static  int peek(){
              if(isempty()){
                System.out.println("cant peek an element because stack is empty");
                return -1;
            }
            int x = head.data;
            return x;

        }
        public static void printstack(){
            while(head != null){
                System.out.println(peek());
                head= head.next;
            }
        }
    }
    public static void main(String[] args) {
      stack s = new stack();
      s.push(5);
      s.push(10);
      s.push(11);
      s.push(73);

       
      int p = s.peek();
      int l = s.pop();
       System.out.println(l);

      System.out.println(p);
    
    }
}