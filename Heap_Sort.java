import java.util.*;
import java.util.PriorityQueue;

public class Heap_Sort {
    public static void sort(int[] arr) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i : arr) {
            heap.add(i);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = heap.poll();
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
            Heap_Sort.sort(arr);
            System.out.println("Sorted array:");
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }

}

