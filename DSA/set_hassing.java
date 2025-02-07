import java.util.HashSet;
import  java.util.Iterator;
public class set_hassing{
    public static void main(String[] args) {
      //creating
      HashSet<Integer> set = new HashSet<>();
      
      //insert
      set.add(5);
      set.add(2);
      set.add(3);
       set.add(12);
      

      //search
      if(set.contains(5)){
      System.out.println("yes exits 5 first time");
      }
      if(!set.contains(1)){
        System.out.println("not contain");
      }
      
     //remove

     set.remove(5);
     if(set.contains(5)){
      System.out.println("yes exits");
      }
      else{
        System.out.println("not contain removed");
      }
     

     //size of set 
     System.out.println("size of set is"+set.size());

     //Iterator
     Iterator it= set.iterator();
     //it has to functions {hasNext and next}
    while(it.hasNext()){
      System.out.println(it.next());
    }
    }
}