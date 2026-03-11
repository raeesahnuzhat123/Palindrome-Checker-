/**
 * =========================================================
 * MAIN CLASS – UseCase6PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * both Queue (FIFO) and Stack (LIFO) to highlight
 * their behavioral differences.
 *
 * Concepts Used:
 * - Queue (FIFO)
 * - Stack (LIFO)
 * - Enqueue & Dequeue
 * - Push & Pop
 * - Logical comparison
 *
 * @author Developer
 * @version 6.0
 */

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class main {

    public static void main(String[] args) {

        // Define the input string to validate
        String input = "civic";

        // Create a Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);      // Enqueue
            stack.push(c);     // Push
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {

            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}