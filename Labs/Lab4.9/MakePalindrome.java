import java.util.Scanner;

public class MakePalindrome {
    public static void main(String[] args) {
        boolean budget = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to check: ");
        String input = scanner.nextLine();
        String output = getOutput(input, budget);
        System.out.println(output);
    }

    public static String getOutput(String input, boolean budget) {
        // Fill in this method
        String rt;
        if (input.length() <= 1 && budget) {
            return input + input.charAt(0);
        } else if (input.length() <= 1) {
            return input;
        } else if (input.length() == 2 && input.charAt(0) == input.charAt(1) && budget) {
            return input + input.charAt(0);
        } else if (input.charAt(0) == input.charAt(input.length() - 1)) {
            rt = getOutput(input.substring(1, input.length() - 1), budget);
            if (rt.equals("NONE")) {
                return "NONE";
            } else {
                return input.charAt(0) + rt + input.charAt(0);
            }
        } else if (input.charAt(0) != input.charAt(input.length() - 1) && budget) {
            if (input.charAt(0) == input.charAt(input.length() - 2)) {
                input = input.charAt(input.length() - 1) + input;
                budget = false;
                rt = getOutput(input.substring(1, input.length() - 1), budget);
                if (rt.equals("NONE")) {
                    return "NONE";
                } else {
                    return input.charAt(0) + rt + input.charAt(0);
                }
            } else {
                input = input + input.charAt(0);
                budget = false;
                rt = getOutput(input.substring(1, input.length() - 1), budget);
                if (rt.equals("NONE")) {
                    return "NONE";
                } else {
                    return input.charAt(0) + rt + input.charAt(0);
                }
            }
        } else {

            return "NONE";
        }

    }
}