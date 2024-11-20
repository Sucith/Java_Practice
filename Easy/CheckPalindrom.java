
package Easys;
import java.util.Scanner;

public class CheckPalindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        long original = in.nextLong();
        
        if (original < 0) {
            System.out.println("Invalid");
            return; 					// No need to continue if the number is negative
        }

        long number = original;  		// Store the original value for later comparison
        long rev = 0;

        // Reverse the number
        while (number != 0) {
            int last = (int) number % 10;  // Extract last digit
            rev = rev * 10 + last;  // Build the reversed number
            number = number / 10;  // Remove last digit from the number
        }

        // Compare the reversed number with the original number
        if (original == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}