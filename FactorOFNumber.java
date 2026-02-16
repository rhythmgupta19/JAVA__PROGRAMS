import java.util.Scanner;
public class FactorOFNumber {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number:");  // Input the number.
            int num = sc.nextInt();

            System.out.println("Factors are");

            for(int i = 1; i <= num;i++){       // continue loop until i is lesser equal to number.
                if(num % i == 0){               // If number modulo i is equal to zero is factor else not.
                    System.out.println(i);
                }
            }
        }
}
