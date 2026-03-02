// Use Case 4 - Character Array Based Palindrome Check

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("     PALINDROME CHECKER APP - UC4");
        System.out.println("==========================================");

        // Hardcoded input string
        String input = "racecar";

        // Convert string to character array
        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
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