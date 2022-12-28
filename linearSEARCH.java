import java.util.Scanner;

public class linearSEARCH {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of elements");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("enter array elements");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print("enter target element");
        int a= sc.nextInt();
        System.out.print(linear_search(arr,a));

    }
    private static int linear_search(int[] arr, int a) {
        for(int i=0;i<arr.length;i++)
            if (arr[i]==a)
                return i;
        return -1;
    }
}