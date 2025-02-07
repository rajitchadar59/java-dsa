class Pen{
    String colour;
    String type;

    public void write(){
        System.out.println("Writing something");
    }
    public void printdeatails(){
       System.out.println(this.colour);
       System.out.println(this.type); 
    }
}

class Student{
   String name;
   int age;

   public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
   }
}
public class Oops{
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.age=20;
    s1.name="Rajit Chadar";
    s1.printInfo();

    }
}