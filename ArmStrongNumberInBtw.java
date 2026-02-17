
import java.util.Scanner;

public class ArmStrongNumberInBtw {

    // Function to count the digit of the number.

    public static int CountDigit(int num) {
        int count = 0;
        while (num != 0) { // Until num is not equal too zero
            num = num / 10;
            count++;
        }
        return count;
    }

    // Find the sum of digit raised to power of count

    public static int FindSum(int num) {
        int sum = 0; // To store sum of digit
        int p = CountDigit(num); // Store count

        while (num != 0) { // Lop run until number become zero
            int rem = num % 10; // Give the last digit
            sum = sum + (int) Math.pow(rem, p); // reminder power count
            num = num / 10; // Remove the last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Armstrong Numbers between 1 to 100:");
        
        int count = 0;
        for(int i = 1; i <= 100; i++){
            if(i == FindSum(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total Armstrong Numbers: " + count);
    }
}
