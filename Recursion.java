    // n to 0 number

// public class Recursion {
//      public static void printnum(int n){
//         if(n==0){
//             return;
//         }
//         System.out.print(n);
//         printnum(n-1);
//      }

//     public static void main(String[] args) {
//      int n =5;
//      printnum(n);
   

// }
// }


    //print number 1 to 5

// public class Recursion {
//      public static void printnum(int n){
//         if(n==6){
//             return;
//         }
//         System.out.print(n);
//         printnum(n+1);
//      }

//     public static void main(String[] args) {
//      int n =1;
//      printnum(n);
   

// }
// }

//sum of n natural number

// public class Recursion {
//   public static void sumn(int n , int s , int sum){
   
//    if(n == s){
//    sum = sum+s;
//    System.out.print(sum);
//    return;
//    }
//     sum = sum+s;
//     sumn(n, s+1, sum);

//   }

//     public static void main(String[] args) {
//     int start = 1;
//     int n =5;
//    int sum=0;
//    sumn(n, start, sum);

// }
// }


      //factorial of n

// public class Recursion {
//   public static void factorial_n(int n , int fact){
//      if( n ==0){
//         System.out.print(fact);
//         return ;

//      }
//     fact = fact * n;
//     factorial_n(n-1, fact);
//   }

//     public static void main(String[] args) {
//     int n = 6;
//      int fact = 1;
//    factorial_n(n, fact);
// }
// }

//factorial of n in otherway


// public class Recursion {
// public static int calculatefact(int n){
//     if(n==1 || n==0){
//         return 1;

//     }
//  int factnm1 =  calculatefact(n-1);
//  int factn = n * factnm1;
//  return factn;



// }

//     public static void main(String[] args) {
//    int n =5;
//    int p = calculatefact(n);
//    System.out.print(p);
// }
// }


//fibonacci series
// public class Recursion {
// public static void fibonacciseries(int n ,int a ,int b){
//     if(n==0){
//         return;
//     }
//   int c = a+b;
//   System.out.print(c);
//   fibonacciseries(n-1, b , c);
// }
//  public static void main(String[] args) {
//  int n =7;
//  int a =0 ; 
//  int b = 1;
//  System.out.print(a);
//  System.out.print(b);
//  fibonacciseries(n-2 ,a ,b);

// }
// }


//print x^n stack height = n

// public class Recursion {
//  public static int calpower(int x , int n){
     
//      if(n==0){
//         return 1;   //base case 1

//      }
//      if(x==0){
//         return 0; //base case 2
//      }
//     int xpownm1 =  calpower(x , n-1);
//     int xpn = x*xpownm1;
//     return xpn;
//  }
//  public static void main(String[] args) {
     
// int x=2;
// int n =5;
// int ans = calpower(x, n);
// System.out.println(ans);

// }
// }


//print x^n stack height = logn

public class Recursion {
 public static int calpower(int x , int n){
     
     if(n==0){
        return 1;   //base case 1

     }
     if(x==0){
        return 0; //base case 2
     }
   if(n % 2 == 0){
     return   calpower(x, n/2) * calpower(x, n/2);
   }
   else{
     return  calpower(x, n/2) * calpower(x, n/2) *x;
   }
 }
 public static void main(String[] args) {
     
int x=2;
int n =5;
int ans = calpower(x, n);
System.out.println(ans);

}
}