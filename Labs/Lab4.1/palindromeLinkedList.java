import java.util.Scanner;

public class palindromeLinkedList {
public static boolean isPalindrome(LinkedList list) {
 // You must fill in the methods to let the program runs.
 // You cannot change LinkedList and Link.
 }

public static void main (String args[]) {
 LinkedList list = new LinkedList();
 Scanner scanner = new Scanner(System.in);
 System.out.println("Please enter integers (separated by spaces, ending with 'a'");
 // Input "10 20 30 20 10 a"

 while (scanner.hasNextInt()) {
 int value = scanner.nextInt();
 list.insert(value);
 }
 scanner.close();

 System.out.println(isPalindrome(list));
// It should return true
}
}