import java.util.Scanner;

public class StrongNumber {
    // Function to calculate factorial of a number
    static long calculateFactorial(int num) {
        long fact = 1; // Variable to store factorial of the number
        
        for (int i = 1; i <= num; i++) { // Loop until i is not less than or equal to number
            fact = fact * i; // multiply i with fact every time when value of i increments
        }
        
        return fact;
    }
    
    // Function to check if a number is a strong number
    static boolean isStrongNumber(int num) {
        long sumOfFactorials = 0;
        int temp = num;
        
        // Extract each digit and add its factorial to sum
        while (temp > 0) {
            int digit = temp % 10;
            sumOfFactorials += calculateFactorial(digit);
            temp /= 10;
        }
        
        // Check if sum of factorials equals original number
        return sumOfFactorials == num;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isStrongNumber(num)) {
            System.out.println(num + " is a Strong Number");
        } else {
            System.out.println(num + " is not a Strong Number");
        }
        
        sc.close();
    }
}

