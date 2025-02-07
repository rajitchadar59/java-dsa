
public class Quicksort{
  public static void  printarray(int arr[]){
 for(int i =0 ; i < arr.length ; i++)
   System.out.println(arr[i]);
  }


 
 public static  int partition(int arr[], int low, int high)
{
    int temp;

    int pivot = arr[low];
    int i = low + 1;
    int j = high;
    do
    {

        while ( i<= high && arr[i] <= pivot)
        {
            i++;
        }
        while ( j >=low && arr[j] > pivot)
        {
            j--;
        }
        if (i < j)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    } while (i < j);
//swap pivot with a[j];

            temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;
     return j;

}

 public static  void quicksort(int arr[], int low, int high)
{
    int partitionindex; // index of pivot after partition

    if (low < high)
    {
        partitionindex = partition(arr, low, high);

        quicksort(arr, low, partitionindex - 1);  // sort left subarray
        quicksort(arr, partitionindex + 1, high); // sort right subarray
    }
}
    public static void main(String[] args) {
     int[] arr = {45,12,45,20,13};
     int n = arr.length;
      printarray(arr);
     quicksort(arr, 0,n-1 );
     printarray(arr);
   
     
    }
}