import java.util.Scanner;
public class FactorialOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();             // User input.
;
        long fact = 1;          // Variable to store factorial of the number.

        for(int i = 1;i <= num;i++){        // Loop until i is not lesser equal to number.
            fact = fact*i;                  // multiply i with fact every time when value of i increment.
        }
        System.out.println("Factorial is " + fact);
    }
}
