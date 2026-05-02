public class RunningSum {
    public static void main(String args[]) {
        int[] nums = new int[]{3,1,2,10,1};

        runningSum(nums);

        System.out.println("Result is: ");
        for(int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.print(nums[nums.length - 1]);
    }
    
    public static int[] runningSum(int[] nums) {
        int temp = 0;
        for(int i = 0; i < nums.length; i++) {
            temp = temp + nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
