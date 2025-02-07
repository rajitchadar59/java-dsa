//  abstract class Animal{
//   abstract void walk();

// Animal(){
//     System.out.println("creating a new animal");
//   }
//   public void eat(){
//     System.out.println("animal is eating");
//   }
// }
// class Horse extends Animal{
//     public void walk(){
//     System.out.println("walks on 4 legs");
//     }
// }
// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("walk with two legs");
//     }
// }
// public class Abstraction{
//     public static void main(String[] args) {
//       Horse h1=new Horse();
//        h1.walk(); 
    
//     }
// }

     
          //Pure Abstraction
 interface Animal{
    void walk();
  
 }
interface Harvivores {
   
}
class Horse implements Animal,Harvivores{
public void walk(){
    System.out.println("horse walks on 4 legs");
}
}


public class Abstraction{
    public static void main(String[] args) {
     Horse h = new Horse();
      h.walk();
    
    }
}




