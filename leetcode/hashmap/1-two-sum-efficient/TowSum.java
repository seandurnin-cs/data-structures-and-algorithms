import java.util.HashMap;

public class TowSum {
    public static void main(String args[]) {
        int[] nums = new int[] { 3, 3 };
        int target = 6;
        int[] res = twoSum(nums, target);
        System.out.println(res[0] + " " + res[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hNums = new HashMap<>();
        int temp;
        for (int i = 0; i < nums.length; i++) {
            temp = target - nums[i];
            if (hNums.containsKey(temp)) {
                return new int[] {hNums.get(temp), i};
            }
            hNums.put(nums[i], i);
        }

        return nums;
    }
}