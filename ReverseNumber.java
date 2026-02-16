import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();     // Take user input 

        for(int i = num; i >= 1; i--){      // loop until i is not equal to 1
            System.out.println(i);

        }
    }
}
