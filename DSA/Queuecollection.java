import java.util.LinkedList;
import java.util.Queue;
public class Queuecollection {
    public static void main(String[] args) {
     Queue<Integer> q = new LinkedList<>(); 
    // Queue<Integer> q = new ArrayDeque<>(); 
     q.add(2);
     q.add(10);
     q.add(15);
     q.add(25);
     while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
     }


    }
}