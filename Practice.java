//Qn->1 Check a number is prime or not
// import java.util.Scanner;
// public class Practice{
//         public static Boolean Practice(int num){
//             if(num <= 1){
//                 return false;
//             }
//             if(num == 2){
//                 return true;
//             }
//             if(num % 2 == 0){
//                 return false;
//             }
//             return true;
//         }
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter starting  number:");
//             int start  = sc.nextInt();

//             System.out.println("Enter ending range");
//             int end = sc.nextInt();

//             int count = 0;
//             for(int i = start; i <= end;i++){
//                 if(Practice(i)){
//                     System.out.println(i);
//                     count++;
//                 }
//             }
//         }
// }

// Qn-->2 palindrome number

// import java.util.Scanner;

// public class Practice {

//     // Method to check if a number is palindrome
//     public static boolean isPalindrome(int num) {
//         int original = num;
//         int  reversed = 0;
        
//         // Reverse the number
//         while (num > 0) {
//             int digit = num % 10;
//             reversed = reversed * 10 + digit;
//             num = num / 10;
//         }
        
//         // Check if original and reversed are equal
//         return original == reversed;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
    
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();
        
//         if (number < 0) {
//             System.out.println("Please enter a positive number!");
//         } else {
//             if (isPalindrome(number)) {
//                 System.out.println(number + " is a Palindrome Number");
//             } else {
//                 System.out.println(number + " is not a Palindrome Number");
//             }
//         }
//     }
// }