/**
 * =========================================================
 * MAIN CLASS – UseCase9PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 * It compares the first and last characters recursively
 * until the base condition is reached.
 *
 * Concepts Used:
 * - Recursion
 * - Base condition
 * - Call Stack
 *
 * @author Developer
 * @version 9.0
 */

public class main {

    // Recursive method
    public static boolean isPalindrome(String input, int start, int end) {

        // Base condition: If pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters don’t match
        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(input, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "madam";

        boolean result = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}