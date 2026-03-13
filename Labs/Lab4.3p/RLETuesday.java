
import java.util.Scanner;

public class RLETuesday {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to be compressed: ");
        String input = scanner.nextLine();
        scanner.close();
        String compressed = compress(input);
        System.out.println("Compressed as: " + compressed);

    }
