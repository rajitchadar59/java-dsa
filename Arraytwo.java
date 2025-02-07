
import java.util.Scanner;

public  class Arraytwo{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int rows = sc.nextInt();
      int cols = sc.nextInt();
     int x=15;
      int num[][] = new int[rows][cols];
      for(int i =0 ; i < rows ; i++){

        for(int j = 0 ; j < cols ; j++){
            num[i][j]= sc.nextInt();
        }
      }
     
     for(int i =0 ; i < rows ; i++){
        for(int j =0 ; j< cols ; j++){
            System.out.print(num[i][j]+" ");
        }
        System.out.println();
     }
     

      
     for(int i =0 ; i < rows ; i++){
        for(int j =0 ; j< cols ; j++){
            if(num[i][j]==x){
                System.out.println("element is found at index :"+"("+i+","+j+")");
            }
        }
      
     }


    }
}