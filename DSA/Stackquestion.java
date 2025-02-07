
// //push the data at bottom of stack not top of the stack
// import java.util.Stack;
// public class Stackquestion{
//     public static void pushatbottom(int data ,Stack<Integer> s){
//         if(s.isEmpty()){
//          s.push(data);
//           return;
//         }
//      int top = s.pop();
//      pushatbottom(data, s);
//      s.push(top);
//     }
//     public static void main(String[] args) {
//         Stack <Integer> s = new Stack<>();
//         s.push(5);
//         s.push(10);
//         s.push(15);
//         s.push(11);
//         pushatbottom(20 ,s);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }  
//     }
// }



//reverse a stack
import java.util.Stack;
public class Stackquestion{
    public static void pushatbottom(int data ,Stack<Integer> s){
        if(s.isEmpty()){
         s.push(data);
          return;
        }
     int top = s.pop();
     pushatbottom(data, s);
     s.push(top);
    }

    public static void reversestack(Stack<Integer> s){
     if(s.isEmpty()){
        return;

     }
     int top  = s.pop();
     reversestack(s);
     pushatbottom(top, s);
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(11);
        reversestack(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }  
    }
}