import java.util.Scanner;

public class ReverseDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();     // Input the number

        int reverse  = 0;       // counter to store the reverse of number

        while(num != 0){
            int last = num % 10;      // To find the last digit we create variable 'last' 

            reverse = reverse * 10 + last;      // Jab bhi digits ko number me convert karna ho → multiply by base (10) then add digit
            num = num / 10;
        }
        System.out.println("Reverse = " + reverse);
    }
}