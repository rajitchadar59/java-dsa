
import java.util.Stack;


public class Queueques {
    static class queue{
       static Stack<Integer> s1 = new Stack<>();
       static Stack<Integer> s2 = new Stack<>();

       public static boolean isempty(){
         return s1.isEmpty() &&s2.isEmpty();
       }
       public static void add(int data){
       while(!s1.isEmpty()){
        s2.push(s1.pop());

       }
       s1.push(data);
       while(!s2.isEmpty()){
        s1.push(s2.pop());
       }
       }


       public static int remove(){
        if(isempty()){
            System.out.println("empty queue");

        }
        int p = s1.pop();
        return p;

       }
           public static int peek(){
        if(isempty()){
            System.out.println("empty queue");

        }
        int p = s1.peek();
        return p;
        
       }
    }
    public static void main(String[] args) {
     queue q=  new queue();
     q.add(5);
     q.add(52);
     q.add(50);
     while(!q.isempty()){
        System.out.println(q.peek());
        q.remove();
     }
    }
}