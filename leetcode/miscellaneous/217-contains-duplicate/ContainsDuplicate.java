import java.util.Arrays;
public class ContainsDuplicate {
    public static void main(String args[]) {
        int[] nums = new int[] {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
    
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int temp;
        for(int i = 0; i < nums.length; i++) {
            temp = nums[i];
            nums[i] = nums[i] - 1;
            if(Arrays.binarySearch(nums, temp) >= 0) {
                nums[i] = temp;
                return true;
            } else {
                nums [i] = temp;
            }
        }
        return false;
    }
}