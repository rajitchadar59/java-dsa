
import java.util.ArrayList;

public class StackusingArraylist{
  static  class stack{
     static    ArrayList<Integer> list = new ArrayList<>();
        public   static  boolean isempty(){
            if(list.size() ==0 ){
                return true;
            }
            return false;
        }
        public  static  void push(int data){
            list.add(data);
        }
        public static  int pop(){
            if(isempty()){
                return-1;
            }
            int x = list.get(list.size()-1);
            list.remove(list.size()-1);
            return x;
        }
        public  static int peek(){
              if(isempty()){
                return-1;
            }
            return list.get(list.size()-1);
        }
    }
    public static  void main(String[] args){
    stack s = new stack();
    s.push(10);
    s.push(15);
    s.pop();
    System.out.println(s.peek());
   
        
    }
}