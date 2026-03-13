import java.util.Arrays;

public class Lab5_Fri_2 {
    public static void main(String args[]) {
        int arr1[] = countBits(2);
        int arr2[] = countBits(5);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] countBits(int n) {
        int[] a = new int[n+1];
        int temp;
        int count;
        for (int i = 0; i <= n; i++) {
            count = 0;
            temp = i;
            for (int j = 0; j < n; j++) {
                if (temp % 2 == 1) {
                    count++;
                    temp = temp >> 1;
                } else {
                    temp = temp >> 1;
                }
            }
            a[i] = count;

        }
        return a;
    }

}
