class Student{
     String name;
     static String school;

}

public class StaticKeyword {

    public static void main(String[] args) {
      Student.school="ssm";
       Student s1 = new Student();
       s1.name="Rajit Chadar";
       System.out.println(s1.school);
    }
}