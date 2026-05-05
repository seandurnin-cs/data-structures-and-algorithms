public class MoveZeroes {
    public static void main(String args[]) {
        int[] nums = new int[] { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int temp;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                count++;
            }
        }
    }
}