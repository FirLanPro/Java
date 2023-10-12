package DZ;
/*Пирамидальная сортировка */
import java.util.Arrays;

public class program13 {
    public static void main(String args[]) {
        int arr[] = { 5, 8, 12, 3, 6, 9};
        int n = arr.length;
        System.out.println("Initial array:");
        System.out.println(Arrays.toString(arr));
        program13.heapSort(arr, n);
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(arr));
    }
    static void buildTree(int arr[], int n, int i) {
        int max = i;
        int k = 2 * i + 1;
        int r = 2 * i + 2;
        if (k < n && arr[k] > arr[max]) {
            max = k;
        }
        if (r < n && arr[r] > arr[max]) {
            max = r;
        }
        if (max != i) {
            int temp2 = arr[i];
            arr[i] = arr[max];
            arr[max] = temp2;
            buildTree(arr, n, max);
        }
    }
    public static void heapSort(int arr[], int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            buildTree(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            buildTree(arr, i, 0);
        }
    }
}