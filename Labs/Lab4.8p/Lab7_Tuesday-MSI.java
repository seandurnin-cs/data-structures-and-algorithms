
import java.util.*;

public class Lab7_Tuesday {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        recQuickSort(arr, 0, n - 1);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        in.close();
    }

    public static void recQuickSort(int[] array, int left, int right) {
        // Complete this method
        int p = right;
        int temp;
        int leftPtr = left;
        int rightPtr = right - 1;

        if (right - left <= 0) {
            return;
        }

        while (!(rightPtr - leftPtr <= 0)) {
            while (!(array[leftPtr] > array[p] || leftPtr == p)) {
                leftPtr++;
            }
            while (!(array[rightPtr] < array[p] || rightPtr == left)) {
                rightPtr--;
            }
            if (!(rightPtr - leftPtr <= 0)) {
                temp = array[leftPtr];
                array[leftPtr] = array[rightPtr];
                array[rightPtr] = temp;
            }
        }

            temp = array[leftPtr];
            array[leftPtr] = array[p];
            array[p] = temp;

        recQuickSort(array, left, leftPtr - 1);
        recQuickSort(array, leftPtr + 1, right);

    }
}
