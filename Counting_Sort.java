import java.util.*;
public class Counting_Sort {
    public static void countingSort(int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i : arr) {
            if (count.containsKey(i)) {
                count.put(i, count.get(i) + 1);
            } else {
                count.put(i, 1);
            }
        }

        int j = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            while (value > 0) {
                arr[j++] = key;
                value--;
            }
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
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
