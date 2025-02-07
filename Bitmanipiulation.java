
import java.util.Scanner;

public class Bitmanipiulation {

    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int Bitmask = 1<<pos;

        
       //fo get
      // if((Bitmask & n)==0){
      //   System.out.println("bit was zero");
      // }
      // else{
      //   System.out.println("bit was one");
      // }

       //for set 
      //  int newnumber = Bitmask | n;
      //  System.out.println(newnumber);

      //for clear
          
      // int bitnot = ~Bitmask;
      // int newnumber = bitnot & n;
      // System.out.println(newnumber);

      //for update
       Scanner sc = new Scanner(System.in);
       System.out.println("what you want to update");
       int ni =sc.nextInt();
       int updatenum;
       if(ni==1){
        updatenum = Bitmask | n;

       }
       else{
        int temp = ~Bitmask;
        updatenum = temp & n;

       }
       System.out.println(updatenum);
       

    }
    

}