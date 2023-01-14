import java.util.*;
public class quick_sort {
    public static int arrayPartition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = (start - 1);
        for (int ele = start; ele < end; ele++) {
            if (array[ele] <= pivot) {
                i++;
                int swap = array[i];
                array[i] = array[ele];
                array[ele] = swap;
            }
        }
        int swap = array[i + 1];
        array[i + 1] = array[end];
        array[end] = swap;
        return i + 1;
    }
    public static void quickSortAlgo(int[] arrayTobeSorted, int start, int end) {
        if (start < end) {
            int pivot = arrayPartition(arrayTobeSorted, start, end);
            quickSortAlgo(arrayTobeSorted, start, pivot - 1);
            quickSortAlgo(arrayTobeSorted, pivot + 1, end);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        quickSortAlgo(arr, 0, arr.length - 1);
        for (int ar : arr) {
            System.out.print(ar + " ");
        }
    }
}
