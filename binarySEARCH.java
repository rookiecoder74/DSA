import java.util.*;
public class binarySEARCH {
    public static int binary_search(int []arr,int a)
    {
        int l=0;
        int h=arr.length-1;
        while(l<=h)
        {
            int mid= l+(h-l)/2;
            if(arr[mid]==a)
                return mid;
            if(arr[mid]>a)
                h=mid-1;
            if(arr[mid]<a)
                l=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter array elements");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print("enter target element");
        int a = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(binary_search(arr,a));
    }
}
