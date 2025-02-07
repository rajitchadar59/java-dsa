
import java.util.Stack;

public class Stackusingcollection{
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(11);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}