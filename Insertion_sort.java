import java.util.*;
public class Insertion_sort {
    public static void insertionSort(int [] numbersToSort) {
        int itemCount = numbersToSort.length;

        for (int value = 1; value < itemCount; value++) {
            int key = numbersToSort[value];
            int last = value - 1;

            while (last >= 0 && key < numbersToSort[last]) {
                numbersToSort[last + 1] = numbersToSort[last];
                --last;
            }

            numbersToSort[last + 1] = key;
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
        insertionSort(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
