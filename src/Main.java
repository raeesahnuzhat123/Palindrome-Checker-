/**
 * =========================================================
 * MAIN CLASS – UseCase5PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack.
 * Characters are pushed into the stack and popped
 * to compare in reverse order.
 *
 * Concepts Used:
 * - Stack (LIFO principle)
 * - Push operation
 * - Pop operation
 * - Reversal logic
 *
 * @author Developer
 * @version 5.0
 */

import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        // Declare and initialize input string
        String input = "noon";

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Pop from stack and compare with original string
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}