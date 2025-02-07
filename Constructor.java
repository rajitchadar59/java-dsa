class Student{
   String name;
   int age;

   public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
   }
  

  Student (){
    ///defalutconstructor
  }

  // parametrized constructor
//    Student(String name, int age){
//     this.name=name;
//     this.age=age;

//    }

   //copy constructor
 Student (Student s2){
    this.name=s2.name;
    this.age=s2.age;
 }

}

public class Constructor{
    public static void main(String[] args) {
        

    Student s1 = new Student();
    s1.age=20;
    s1.name="Rajit Chadar";
    
    Student s2 = new Student(s1);
    s2.printInfo();
    }
}