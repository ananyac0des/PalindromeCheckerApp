// Demonstration of FIFO vs LIFO using Queue and Stack

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

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