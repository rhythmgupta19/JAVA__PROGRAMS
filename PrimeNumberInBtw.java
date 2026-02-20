import java.util.Scanner;

public class PrimeNumberInBtw {
    
    // Function to count the total number of factors
    public static int CountFactor(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {        // Continue loop until i is lesser equal to number.
            if (num % i == 0) {                 // If number modulo i is equal to zero is a factor.
                count++;                         // Increment count of factors
            }
        }
        return count;
    }
    
    // Function to check if a number is prime
    public static boolean isPrimeNumber(int num) {
        // A prime number has exactly 2 factors (1 and itself)
        if (CountFactor(num) == 2) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter starting range:");
        int start = sc.nextInt();
        
        System.out.println("Enter ending range:");
        int end = sc.nextInt();
        
        System.out.println("\nPrime Numbers between " + start + " and " + end + ":");
        
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
                count++;
            }
        }
        
        System.out.println("Total Prime Numbers are: " + count);
    }
}