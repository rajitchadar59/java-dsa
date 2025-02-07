import java.util.ArrayList;
import java.util.Collections;
public class Arraylist{
    public static void main(String[] args) {
    ArrayList<Integer> list = new  ArrayList<Integer>(); 
    ArrayList<String> list2 = new ArrayList<>();
    ArrayList<Boolean> list3 = new ArrayList<>();
     // add elements
     list.add(10);
     list.add(2);
     list.add(3);
    //  System.out.println(list);
     //get elements
    //  System.out.println(list.get(1));
      

    // add element in bitween
    list.add(0 ,5);
    System.out.println(list);
       //set element
   list.set(0 ,15);
    System.out.println(list);

   //delete element
   list.remove(0);
   System.out.println(list);
    
    //size of arraylist
    int size = list.size();
    // System.out.println(size);

   
   //looping in arrayist

    for(int i = 0 ; i < list.size() ; i++){
      System.out.println(list.get(i));

    }

    //sort
    Collections.sort(list);
    System.out.println(list);

    }
}