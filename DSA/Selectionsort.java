public class Selectionsort{
    public static void printarray(int arr[]){
        for(int i =0 ; i <arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] ={5,8,1,2,14};
         printarray(arr);
         System.out.println("sorted");
        for(int i =0 ; i< arr.length-1 ; i++){
            int im= i; int temp;

           for(int j = i + 1 ; j < arr.length ; j++){
            if(arr[j] < arr[im]){
                im = j;

            }

           }
           temp = arr[i];
           arr[i]= arr[im];
           arr[im]= temp;
        }

        printarray(arr);
    }
}




