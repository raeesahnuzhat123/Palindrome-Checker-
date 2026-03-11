/**
 * =========================================================
 * MAIN CLASS – UseCase7PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque.
 * Characters are inserted into the deque and compared
 * from both front and rear ends.
 *
 * Concepts Used:
 * - Deque (Double Ended Queue)
 * - Front and Rear access
 * - Optimized comparison logic
 *
 * @author Developer
 * @version 7.0
 */

import java.util.Deque;
import java.util.ArrayDeque;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define the input string
        String input = "refer";

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Compare front and rear elements
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}