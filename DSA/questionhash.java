//Q-subarray sum =k ;

import java.util.HashMap;

public class questionhash {

    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};
        int k = -10;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int ans = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];

            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);

            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);

            }

        }

        System.out.println(ans);
    }
}

//Q-print iternaries (path)
// import java.util.HashMap;
// public class questionhash {
//     public static  String getstart(HashMap<String , String> map ){
//       HashMap<String , String> revmap= new HashMap<>();
//       for(String key: map.keySet()){
//         revmap.put(map.get(key) ,key);
//       }
//       for(String key : map.keySet()){
//          if(!revmap.containsKey(key)){
//             return key;
//          }
//       }
//      return null;
//     }
//     public static void main(String[] args) {
//      HashMap<String , String> map = new HashMap<>();
//       map.put("chennai" ,"bangluru");
//       map.put("mumbai" ,"delhi");
//       map.put("goa" ,"chennai");
//       map.put("delhi" ,"goa");
//         String start = getstart(map);
//         while (map.containsKey(start)) {
//            System.out.print(start+"-->");
//            start= map.get(start);
//         }
//            System.out.print(start);
//     }
// }



//Q-intersection of two arrays
// import java.util.HashSet;
// public class questionhash {
//  public static int intersection(int arr1[] , int arr2[]){
//     HashSet<Integer> set =  new HashSet<>();
//     int count=0;
//     for(int i =0 ; i< arr1.length ; i++){
//         set.add(arr1[i]);
//     }
//     for(int j =0; j<arr2.length ;j++){
//      if(set.contains(arr2[j])){
//         count++;
//         System.out.print(arr2[j]+" ");
//         set.remove(arr2[j]);
//      }
//     }
//     System.out.println();
//   return  count;
//  }
//     public static void main(String[] args) {
//     int arr1[]={1,2,3,4,5,8};
//     int arr2[]={4,5,8,9,10};
//     System.out.println("the size of element after intersection is:"+intersection(arr1, arr2));
//     }
// }


// //Q-union of two arrrays
// import java.util.HashSet;
// public class questionhash {
//  public static int union(int arr1[] , int arr2[]){
//     HashSet<Integer> set =  new HashSet<>();
//     for(int i =0 ; i < arr1.length ; i++){
//         set.add(arr1[i]);
//     }
//     for(int i =0 ; i < arr2.length ; i++){
//         set.add(arr2[i]);
//     }
//     int size= set.size();
//     return size;
//  }
//     public static void main(String[] args) {
//     int arr1[]={1,2,3,4,5};
//     int arr2[]={4,5,8,9,10};
//     System.out.println(union(arr1, arr2)); 
//     }
// }


//Q-MAJORITY ELEMENT

// import java.util.HashMap;
// public class questionhash {
//    public static void majority_element(int nums[]){
//    HashMap<Integer ,Integer> map = new HashMap<>();
//    int n = nums.length;
//    for(int i =0 ; i < n ; i++){
//     if(map.containsKey(nums[i])){
//     map.put(nums[i] ,map.get(nums[i])+1);
//     }
//     else{
//         map.put(nums[i] ,1);
//     }
//    }
//    for(int key:map.keySet()){
//     if(map.get(key)>n/3){
//         System.out.println("majority element is :"+key);
//     }
//    }
//    }
//     public static void main(String[] args) {
//     int nums[]={1,1,1,1,2,2,2,2,2};
//     majority_element(nums);
//     }
    
// }
