import java.util.Scanner;

public class CountDigit{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            // Take input of the number.
            System.out.println("Enter the number:");
            int num = sc.nextInt();

            // Initialize a variable count to count the number at 0.
            int count = 0;

            while(num != 0){

                // Until the num is not equal to zero count dividing the number by 10.
                num = num/10;
                count++;        // Every one lap increase a counter by 1.
            }
            System.out.println("Digits = " + count);
        }
}