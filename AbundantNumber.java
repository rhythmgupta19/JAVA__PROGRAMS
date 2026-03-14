import java.util.Scanner;

public class AbundantNumber {
    
    /*
     * An abundant number is a number for which the sum of its proper divisors
     * (excluding the number itself) is greater than the number.
     * Example: 12 -> divisors: 1,2,3,4,6  sum=16 >12 so 12 is abundant.
     */
    public static boolean isAbundant(int num) {
        if (num < 1) {
            return false;
        }
        int sum = 0;
        // find proper divisors
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum > num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Abundant Number Checker =====");
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number!");
        } else {
            if (isAbundant(number)) {
                System.out.println("\n" + number + " is an Abundant Number.");
            } else {
                System.out.println("\n" + number + " is NOT an Abundant Number.");
            }
            // print divisors and sum for clarity
            int sum = 0;
            System.out.print("Proper divisors: ");
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                    sum += i;
                }
            }
            System.out.println("\nSum = " + sum);
        }
        sc.close();
    }
}
