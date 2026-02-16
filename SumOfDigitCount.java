import java.util.Scanner;
public class SumOfDigitCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();         // Taking user input

        int count = 0;
        int sum = 0;                    // Store sum.

        while(num != 0){

            int rem = num % 10;         // To find last number.
            sum  = sum+rem;

            num = num/10;               // to find count of number.
            count++;
            
        }
        System.out.println("Digit count " + count);
        System.out.println("Sum " +sum);
    }
}
