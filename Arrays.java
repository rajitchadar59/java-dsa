import java.util.*;
public class Arrays{

    public static void main(String[] args) {
    //  int[] marks = new int[3];
    // int marks[] = new int[3];
    // int marks[] ={97 ,98 ,95};
    //  marks[0]=97;
    //  marks[1]=98;
    //  marks[2]=95;
    //  System.out.println(marks[0]);
    //   System.out.println(marks[1]);
    //    System.out.println(marks[2]);

//        for(int i =0 ; i < 3 ; i++){
//     System.out.println(marks[i]);
//    }



      //user se input leke array design
  
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter size");
     int size = sc.nextInt();
    int num[] = new int[size];
    

    for(int i =0 ; i < size ;i++ ){
        System.out.print("enter the "+(i+1)+"element ");
        num[i] = sc.nextInt();
    }

    for(int i =0 ; i < size ; i++){
    System.out.println(num[i]);
    }
    



    }
}