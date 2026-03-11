/**
 * =========================================================
 * MAIN CLASS – UseCase3PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Description:
 * This class reverses a string using a loop and checks
 * whether it is a palindrome.
 *
 * Concepts Used:
 * - For Loop
 * - String Immutability
 * - String Concatenation
 * - equals() Method
 *
 * @author Developer
 * @version 3.0
 */

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String input = "madam";
        String reversed = "";

        // Reverse string using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Display original and reversed
        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);

        // Compare using equals()
        if (input.equals(reversed)) {
            System.out.println("Result : It is a Palindrome");
        } else {
            System.out.println("Result : It is NOT a Palindrome");
        }
    }
}