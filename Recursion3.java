
//all posible permutation


// public class Recursion3{
//     public static void stringpermutation(String str , String permutation ){
//         if(str.length() ==0){
//             System.out.println(permutation);
//         }
//       for(int i =0 ; i < str.length() ; i++){
//         char currentchar = str.charAt(i);
//         String newstr = str.substring(0 ,i)+str.substring(i+1);
//         stringpermutation(newstr, permutation+currentchar);
//       }  
//     }
//     public static void main(String[] args){
//        String str = "abc";
//        stringpermutation(str, "");  


//     }
// }


//all total paths in a maze to move from (0,0) to ( n  , m)


// public class Recursion3{
//     public  static int  totalpaths(int i , int j , int n , int m){
//       if(i == n || j == n){
//         return 0;

//       }
//       if(i == n-1 && j == m-1){
//         return 1;

//       }
//     //move down
//     int down = totalpaths(i+1, j, n, m);

//     //right move
//     int right = totalpaths(i , j+1 , n , m);

//     return down+right;

//     }
//     public static void main(String[] args){
//     int p = totalpaths(0, 0, 3, 3);
//     System.out.println(p);

//     }
// }


//place tiles of size 1xm in a floor of size nxm  n=4 m = 2
// public class Recursion3{
//   public static int totalways(int n  , int m ){
//    if( n < m ){
//     return 1;

//    }
//    if(n==m){
//     return 2;
//    }
//    //vertically
//    int vertical = totalways(n-m , m);
//    // horizontally
//    int horizontal = totalways(n-1, m);
//    return vertical + horizontal;
//   } 
//     public static void main(String[] args){
//      int p = totalways(4,2);
//      System.out.println(p);
//     }
// }


//find the number of ways which you can invite n people to your party , single or in pairs

// public class Recursion3{
//  public static int callguest(int n ){
//    if(n <=1){
//     return 1;
//    }
   

//   //single---->
//   int single =callguest(n-1);
//   //pair------>
//   int pair =(n-1)* callguest(n-2);

//   return single+pair;

//  }
//     public static void main(String[] args){
//      int r=callguest(0);
//      System.out.println(r);
//     }
// }





