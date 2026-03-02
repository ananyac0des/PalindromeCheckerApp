import java.util.Queue;
import java.util.LinkedList;
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
    }
}