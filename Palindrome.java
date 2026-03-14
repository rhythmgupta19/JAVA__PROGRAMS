import java.util.Scanner;

public class Palindrome {
    
    // Method to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        int original = num;
        int  reversed = 0;
        
        // Reverse the number
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        
        // Check if original and reversed are equal
        return original == reversed;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if (number < 0) {
            System.out.println("Please enter a positive number!");
        } else {
            if (isPalindrome(number)) {
                System.out.println(number + " is a Palindrome Number");
            } else {
                System.out.println(number + " is not a Palindrome Number");
            }
            
            // // Show the reversed number
            // long reversed = 0;
            // long temp = number;
            // while (temp > 0) {
            //     long digit = temp % 10;
            //     reversed = reversed * 10 + digit;
            //     temp = temp / 10;
            // }
            // System.out.println("Original: " + number);
            // System.out.println("Reversed: " + reversed);
        }
    }
}
