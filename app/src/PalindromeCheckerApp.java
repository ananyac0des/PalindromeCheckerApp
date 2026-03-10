import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Two-pointer approach
    public static boolean checkPalindromeTwoPointer(String input) {

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method 2: Stack approach
    public static boolean checkPalindromeStack(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Method 3: Deque approach
    public static boolean checkPalindromeDeque(String input) {

        Deque<Character> deque = new LinkedList<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "madam";

        // Two Pointer timing
        long start1 = System.nanoTime();
        boolean result1 = checkPalindromeTwoPointer(input);
        long end1 = System.nanoTime();

        // Stack timing
        long start2 = System.nanoTime();
        boolean result2 = checkPalindromeStack(input);
        long end2 = System.nanoTime();

        // Deque timing
        long start3 = System.nanoTime();
        boolean result3 = checkPalindromeDeque(input);
        long end3 = System.nanoTime();

        System.out.println("Two Pointer Result: " + result1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Result: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");

        System.out.println("Deque Result: " + result3);
        System.out.println("Execution Time: " + (end3 - start3) + " ns");
    }
}