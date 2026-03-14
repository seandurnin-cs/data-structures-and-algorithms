import java.util.Arrays;

public class CountBitsEfficient {
    public static void main(String args[]) {
        int arr1[] = countBits(2);
        int arr2[] = countBits(5);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] countBits(int n) {
        int[] a = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = a[i >> 1] + (i & 1);
        }
        return a;
    }

}
