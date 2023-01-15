import java.util.*;

public class QuickSort {
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        Random rand = new Random();
        int pivotIndex = rand.nextInt(right - left + 1) + left;
        int pivot = arr[pivotIndex];


        swap(arr, pivotIndex, right);


        int partitionIndex = partition(arr, left, right, pivot);


        sort(arr, left, partitionIndex - 1);
        sort(arr, partitionIndex + 1, right);
    }

    private static int partition(int[] arr, int left, int right, int pivot) {
        int partitionIndex = left;
        for (int i = left; i < right; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(arr, partitionIndex, right);
        return partitionIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        QuickSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
