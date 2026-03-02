// Use Case 5 - Stack-Based Palindrome Checker

import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("     PALINDROME CHECKER APP - UC5");
        System.out.println("==========================================");

        // Hardcoded input string
        String input = "level";

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input String : " + input);

        if (isPalindrome) {
            System.out.println("Result : The given string is a Palindrome.");
        } else {
            System.out.println("Result : The given string is NOT a Palindrome.");
        }

        System.out.println("==========================================");
    }
}