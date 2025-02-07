
public class Pattern {

    public static void main(String[] args) {
 //Q- 1      //      * * * * *
        //      * * * * *
        //      * * * * *
        //      * * * * *

        // for (int i = 0; i < 4; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

 //Q- 2      // * * *  * *
        // *        *
        // *        *
        // * * *  * *

      //   int n=4;
      //   int m =5;

      //  for(int i = 1 ; i <= n ; i++){

      //   for(int j =1 ; j<= m ; j++){
      //     if((i==1) || (j==1) || (i==n) || (j==m)){
      //      System.out.print("*");
      //     }
      //     else{
      //       System.out.print(" ");
      //     }

      //   }
      //   System.out.println();
      //  }
//Q- 3
      //  *
      //  * *
      //  * * *
      //  * * * *
     
    

    //  for(int i=0 ; i<4 ; i++){

    //  for(int j =0  ; j <=i ;j++){
    //      System.out.print("*");
    //  }
    //   System.out.println();

    //  }//Q-


//Q-4  // * * * *
    // * * *
    // * *
    // * 


    
    //  for(int i=4 ; i>=1 ; i--){

    //  for(int j =1  ; j <=i ;j++){
    //      System.out.print("*");
    //  }
    //   System.out.println();

    // //Q- }


//Q-5  //  *
  //     * *
  //   * * *
  // * * * *

  //  int n =4;  
  // for(int i= 0 ; i < n ; i++){
  //    for(int k = 0 ; k < n-i ; k++){
  //       System.out.print(" ");
  //     }
  //    for(int j =0 ; j <= i ; j++ ){
      
  //     System.out.print("*");
  //   }

  //   System.out.println();
  // }

    //Q- 6 
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5

    // for(int i = 1 ; i <= 5 ; i++){
    //   for(int j =1 ; j <= i ; j++){

    //     System.out.print(j+" ");


    //   }
    //   System.out.println();
    // }

//Q-7

          // 1 2 3 4 5
          // 1 2 3 4
          // 1 2 3
          // 1 2 
          // 1




    //   for(int i = 5 ; i > 0 ; i--){
    //   for(int j =1 ; j <= i ; j++){

    //     System.out.print(j+" ");


    //   }
    //   System.out.println();
    // }

   //Q- 8

    // 1
    // 2  3
    // 4  5  6
    // 7  8  9 10
    // 11 12 13 14 15


  //   int k=1;
  //  for(int i =0; i <5 ; i++){
    
  //   for(int j=0; j<=i ; j++){
  //    System.out.print(k+" ");
  //     k++;
  //   }
   
  //   System.out.println();
  //  }


//Q- 9


    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1

    // int n =5;

    // for(int i=1 ; i <= n ; i++){

    //   for(int j =1 ; j<= i ; j++){
    //     int sum = i+j;
    //     if(sum % 2==0){
    //       System.out.print("1 "); 

    //     }
    //     else{
    //       System.out.print("0 ");
    //     }
    //   }
    //   System.out.println();
    // }


               //SOME ADVANCED PATTERN QUESTIONS

    // Q=1      *             *
    //       * *         * *
    //       * * *     * * *
    //       * * * * * * * *       
    //       * * * * * * * *
    //       * * *     * * *
    //       * *         * *
    //       *             *

    //  int n= 5;
    //  for(int i =1 ; i <= n ; i++){

    //  for(int j =1 ; j <= i ; j++){
    //   System.out.print("*");
    //  }
      
    //  int spaces = 2*(n-i);
    //  for(int j= 1 ; j<=spaces ; j++){
    //   System.out.print(" ");
    //  }
     
    //    for(int j =1 ; j <= i ; j++){
    //   System.out.print("*");
    //  }
    //  System.out.println();
    //  }



    //    for(int i = n; i >= 1 ; i--){

    //  for(int j =1 ; j <= i ; j++){
    //   System.out.print("*");
    //  }
      
    //  int spaces = 2*(n-i);
    //  for(int j= 1 ; j<=spaces ; j++){
    //   System.out.print(" ");
    //  }
     
    //    for(int j =1 ; j <= i ; j++){
    //   System.out.print("*");
    //  }
    //  System.out.println();
    //  }


//Q-2
//        *****
//       *****
//      *****
//     *****
//    *****

    // int n = 5;

    // for(int i =0 ; i < n ; i++ ){
    // for(int k =0 ; k < n-i ; k++){
    //   System.out.print(" ");
    // }
    // for(int j = 0 ; j < n ; j++){
    //   System.out.print("*");
    // }
    // System.out.println();
    // }

      //      1
      //     2 2
      //    3 3 3
      //   4 4 4 4
      //  5 5 5 5 5

    //  int n=5;
    //  for(int i =1 ; i <= n ; i++){
      
    //   for(int k=1 ; k<= n-i ; k++){
    //     System.out.print(" ");
    //   }

    //  for(int j =1 ; j<= i ; j++){
    //   System.out.print(i+" ");
    //  }
    //  System.out.println();
    //  }


  //  Q-4
  //          1
  //        2 1 2
  //      3 2 1 2 3
  //    4 3 2 1 2 3 4
  //  5 4 3 2 1 2 3 4 5 
   
      
    // int n =5;
    // for(int i = 1 ; i<= n ; i++){
    //   for(int k =1 ; k <= n-i ; k++){
    //     System.out.print(" ");
    //   }
    //   for(int j = i ; j>=1 ;j-- ){
    //     System.out.print(j);
    //   }
    //   for(int m=2  ; m<=i ; m++ ){
    //     System.out.print(m);
    //   }
    //   System.out.println();
    // }
 
//  Q-5
  //     *
  //    ***
  //   *****
  //  *******
  //  *******
  //   *****
  //    ***
  //     *

  // int n=4;
  // for(int i = 0 ; i < n ; i++){
  //    for(int k =1; k < n-i ; k++){
  //       System.out.print(" ");
  //     }
  //     int r = (2*i)+1; 
  //     for(int j =1 ; j <=r ; j++){
  //       System.out.print("*");
  //     }
  //    System.out.println();
  // }
  

  //  for(int i = n ; i > 0 ; i--){
  //    for(int k =1 ; k <= n-i ; k++){
  //       System.out.print(" ");
  //     }
  //     int r = (2*i)-1; 
  //     for(int j =1 ; j <=r ; j++){
  //       System.out.print("*");
  //     }
  //    System.out.println();
  // }
  


    }
}
