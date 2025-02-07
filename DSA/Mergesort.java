public class Mergesort {

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void conqure(int arr[], int start, int mid, int end) {
        int[] merged = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                merged[k] = arr[i];
                i++;
            } else {
                merged[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            merged[k] = arr[i];
            i++;
            k++;
        }

        while (j <= end) {
            merged[k] = arr[j];
            j++;
            k++;
        }

        // Copying the merged array back to the original array
        for (int l = 0; l < merged.length; l++) {
            arr[start + l] = merged[l];
        }
    }

    public static void devide(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2; // (start+end)/2;
        devide(arr, start, mid);
        devide(arr, mid + 1, end);
        conqure(arr, start, mid, end);
    }

    public static void main(String[] args) {
        int arr[] = {14, 15, 2, 46, 82};
        int n = arr.length;
        System.out.println("Without sort:");
        printarray(arr);
        devide(arr, 0, n - 1);
        System.out.println("After sort:");
        printarray(arr);
    }
}
