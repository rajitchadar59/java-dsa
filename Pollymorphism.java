//function overloadding

class Student{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(this.name);
    }
    public void printInfo(int age){
        System.out.println(this.age);
    }

    public void printInfo( String name,int age){
        System.out.println(this.name +" "+this.age);
        
    }
}

public class Pollymorphism{
    public static void main(String[] args) {
     Student s1 = new Student();
     s1.age=20;
     s1.name="Rajit Chadar";
     s1.printInfo(s1.name  );   
    }
}