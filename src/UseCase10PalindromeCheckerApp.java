/**
 * =========================================================
 * MAIN CLASS – UseCase10PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Description:
 * This class validates a palindrome while ignoring
 * spaces and letter case differences.
 *
 * Concepts Used:
 * - String preprocessing
 * - Regular expressions
 * - Case normalization
 *
 * @author Developer
 * @version 10.0
 */

public class main {

    public static void main(String[] args) {

        // Input with spaces and mixed case
        String input = "Madam In Eden Im Adam";

        // Step 1: Normalize string
        // Remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        int start = 0;
        int end = normalized.length() - 1;

        // Step 2: Apply palindrome logic
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        System.out.println("Original Input : " + input);
        System.out.println("Normalized Input : " + normalized);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}