import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class hashmap_hashing{
    public static void main(String[] args){
        //country --population
    HashMap<String ,Integer> map = new HashMap<>();
    //Insersion
    map.put("India" ,120);
    map.put("use" ,30);
    map.put("china",125);
     map.put("china",180);
    System.out.println(map); 
    //Search
    if(map.containsKey("India")){
        System.out.println("exits");
    }

    System.out.println(map.get("china"));
    System.out.println();
    System.out.println(map.get("chinahko"));
    

   /* System.out.println("for loop new method");
   int arr[]={4,5,6,4};
   for(int val:arr){
    System.out.println(val);
   }
   */

  for( Map.Entry<String ,Integer> e:map.entrySet()){
    // System.out.println(e.getKey());
    // System.out.println(e.getValue());
    System.out.print(e.getKey()+":");
    System.out.println(e.getValue());
  }

// to make a key set
//another way to iterate on a HashMap
System.out.println("key set--->");
  Set<String> keys= map.keySet();
  for(String key:keys){
    System.out.println(key+":"+map.get(key));
  }

  //remove in a map
   map.remove("china");
   System.out.println(map);
    }
}