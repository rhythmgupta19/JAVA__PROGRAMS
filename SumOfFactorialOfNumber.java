import java.util.Scanner;
public class SumOfFactorialOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();     // Take input from user.

        long fact = 1;      //To store factorial.
        long sum = 0;       //To store sum of factorial.

        for(int i = 1;i <= num;i++){
            fact = fact*i;          // Factorial increment.
            sum = sum+fact;         // Sum increment
        }
        System.out.println(fact);
        System.out.println(sum);
    }
}
