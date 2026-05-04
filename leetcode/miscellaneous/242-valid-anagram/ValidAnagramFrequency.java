
public class ValidAnagramFrequency {

    public static void main(String args[]) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] nums = new int[26];

        for (int i = 0; i < s.length(); i++) {
            nums[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            nums[t.charAt(i) - 'a']++;
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) return false;
        }

        return true;

    }
}
