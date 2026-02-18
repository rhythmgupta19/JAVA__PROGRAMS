import java.util.Scanner;
public class SquareOfNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();         // USer Input

        // Calculate square using loop
        int square = 0;
        for(int i = 1; i <= num; i++) {
            square += num;          // Every time loop run it add 5 in number.
        }
        System.out.println(square);
    }
}