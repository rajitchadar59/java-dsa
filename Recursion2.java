//Tower of hanoi

// public class Recursion2 {
//     public static void towerofhanoi(int n , String src , String helper , String dest){
//       if(n==1){
//         System.out.println("transfer disk "+n+" from "+src+" to "+dest);
//         return;
//       }
//       towerofhanoi(n-1 ,src ,dest , helper);
//               System.out.println("transfer disk "+n+" from "+src+" to "+dest);
//       towerofhanoi(n-1 ,helper ,src ,dest);

//     }
//     public static  void main(String[] args){
//     int n =15;
    
//     towerofhanoi(n, "S", "H", "D");

//     }
// }

//reverse a string

// public class Recursion2 {
//    public static void reverse(int i , String s){
//    if(i==-1){
//     return;
//    }
//    System.out.println(s.charAt(i));
//    reverse(i-1, s);
//    }
//     public static  void main(String[] args){
//     String s = "abcd";
//     int i = s.length()-1;
//      reverse(i, s);
//     }
// }

//first and last occurance in the string

// public class Recursion2 {
//   public static int first = -1;
//   public static int last = -1;
//  public static void occur(String s , int index , char el){
//   if(index == s.length()){
//     System.out.println(first);
//     System.out.println(last);
//     return ;

//   }
//  char currentchar = s.charAt(index);
//  if(currentchar == el){
//   if(first==-1){
//   first = index;
//   }
//   else{
//     last=index;
//   }
//  }
//  occur(s, index+1, el);
//  }
//     public static  void main(String[] args){
//   String s = "abbachgfya";
//   int index = 0;
//   char element = 'a';
//   occur(s, index, element);
//     }
// }

//cheack if an array is sorted strictly incresing
// public class Recursion2 {
//     public static boolean issorted(int arr[] , int i){
//      if(i==arr.length-1){
//         return true;
//      }
//      if(arr[i] < arr[i+1]){
//       //array is sored till now
//        return issorted(arr, i+1);
    
//      }
//      else{
//         return false;
//      }
//     }

//     public static  void main(String[] args){
//     int arr[]={10 ,15,16,18,20 ,20};
//     int index=0;
//    boolean r =issorted(arr, index);
//     if(r==true){
//         System.out.println("sorted!");
//     }
//     else{
//         System.out.println("not sorted!");
//     }
//     }
// }

//move all the x to the end of the string
// public class Recursion2 {
//   public static boolean[] map = new boolean[26];
//   public static void removeduplicates(String str , int index  , String newstr){
//      if(index==str.length()){
//         System.out.println(newstr);
//         return;
//      }

//     char currentchar = str.charAt(index);
//     if(map[currentchar-'a']){
//         removeduplicates(str, index+1, newstr);
//     }
//     else{
//         newstr = newstr+currentchar;
//         map[currentchar-'a'] =true;
//         removeduplicates(str, index+1, newstr);
//     }
//   }

//     public static  void main(String[] args){
//     String s = "abcdabcd";
//     removeduplicates(s, 0, "");
//     }
// }

//subsequence of a string

// public class Recursion2 {
//  public static void subsequences(String str , int index , String newString){
//     if(index == str.length()){
//         System.out.println(newString);
//         return;
//     }
//     char currentchar = str.charAt(index);
//     // to be come in a subsequences
//     subsequences(str, index+1, newString+currentchar);
//     // to not be come 
//     subsequences(str, index+1, newString);
    
//  }
//     public static  void main(String[] args){
//     String str = "abc";
//     subsequences(str, 0, "");

//     }
// }


//unique subsequences
// import java.util.HashSet;
// public class Recursion2 {
//  public static void subsequences(String str , int index , String newString , HashSet<String> set){
//     if(index == str.length()){
//         if(set.contains(newString)){
//             return;
//         }
//        else{
//         System.out.println(newString);
//         set.add(newString);
//         return ;


//        }
//     }
//     char currentchar = str.charAt(index);
//     // to be come in a subsequences
//     subsequences(str, index+1, newString+currentchar ,set);
//     // to not be come 
//     subsequences(str, index+1, newString ,set);
    
//  }
//     public static  void main(String[] args){
//     String str = "aaa";
//     HashSet<String> set = new HashSet<>();
//     subsequences(str, 0, "" , set);

//     }
// }

//print keypad combintion


public class Recursion2 {
 public static String[] keypad ={"." , "abc" , "def" ,"ghi" , "jkl" ,"mno" ,"pqrs" ,"tu" ,"vwx" ,"yz"};
  public static void printcombination(String str , int index , String combination){
  if(index==str.length()){
    System.out.println(combination);
    return;

  }
  char currentchar = str.charAt(index);
  String mapping = keypad[currentchar-'0'];
   for(int i = 0 ; i< mapping.length() ; i++){
   printcombination(str, index+1, combination+mapping.charAt(i));

   }
    
  }
    public static  void main(String[] args){
    String str = "23";
    printcombination(str, 0, "");

    }
}


