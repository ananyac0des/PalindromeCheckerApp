public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("     PALINDROME CHECKER APP - UC3    ");
        System.out.println("=====================================");

        // Hardcoded input string
        String original = "madam";

        String reversed = "";

        // Reverse string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Display original and reversed strings
        System.out.println("Original String : " + original);
        System.out.println("Reversed String : " + reversed);

        // Compare using equals()
        if (original.equals(reversed)) {
            System.out.println("Result : The given string is a Palindrome.");
        } else {
            System.out.println("Result : The given string is NOT a Palindrome.");
        }

        System.out.println("=====================================");
    }
}