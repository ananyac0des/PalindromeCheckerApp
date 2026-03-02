import java.util.Queue;
import java.util.LinkedList;
// Demonstration of FIFO vs LIFO using Queue and Stack

import java.util.Queue;
import java.util.LinkedList;
// Use Case 5 - Stack-Based Palindrome Checker

import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "RADAR";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            queue.add(input.charAt(i));   // Enqueue (FIFO)
            stack.push(input.charAt(i));  // Push (LIFO)
        }

        boolean isPalindrome = true;

        System.out.println("Original String: " + input);
        System.out.println("\nComparing Dequeue (Queue) vs Pop (Stack):");

        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();  // Dequeue
            char fromStack = stack.pop();     // Pop

            System.out.println("Queue: " + fromQueue + " | Stack: " + fromStack);

            if (fromQueue != fromStack) {
                isPalindrome = false;
            }
        }

        if (isPalindrome) {
            System.out.println("\nResult: The string is a Palindrome.");
        } else {
            System.out.println("\nResult: The string is NOT a Palindrome.");
        }
        System.out.println("========================================");
        System.out.println("   FIFO vs LIFO Demonstration");
        System.out.println("========================================");

        String input = "HELLO";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert characters into both structures
        for (int i = 0; i < input.length(); i++) {
            queue.add(input.charAt(i));   // Enqueue
            stack.push(input.charAt(i));  // Push
        }

        System.out.println("Original String : " + input);

        System.out.print("Queue Output (FIFO) : ");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove());
        }

        System.out.println();

        System.out.print("Stack Output (LIFO) : ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        System.out.println("\n========================================");
    }
}