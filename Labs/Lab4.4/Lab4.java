
import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to be compressed: ");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println("Compression ratio: " + superCrusher(input) + "%");
    }

    public static double superCrusher(String input) {
        int temp;
        int rleScore = 2147483647;
        int dltPos = 0;
        int k = input.length() / 2;
        String compressed;
        for (int i = 0; i <= input.length() - k; i++) {
            temp = runLengthEncode(input.substring(0,i) + input.substring(i+k, input.length())).length();
            if(temp < rleScore) {
                rleScore = temp; 
                dltPos = i;
            }
        }
        compressed = runLengthEncode(input.substring(0,dltPos) + input.substring(dltPos+k, input.length()));
        return (compressed.length()*100.0) / input.length();

    }

    public static String runLengthEncode(String input) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (i + 1 < chars.length && c == chars[i + 1]) {
                count++;
            } else {
                result.append(count).append(c);
                count = 1;
            }
        }
        return result.toString();
    }
}
