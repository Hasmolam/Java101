import java.util.Scanner;

public class PalindromeNumberChecker {

    public static String isPalindrome(int number) {
        int temoraryNumber = number;
        int reverse = 0;
        while(temoraryNumber != 0) {
            int lastDigit = temoraryNumber % 10;
            reverse = reverse * 10 + lastDigit;
            temoraryNumber /= 10;
        }
        if(number == reverse) {
            return number + " is a palindrome number";
        }else{
            return number + " is not a palindrome number";
        }
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println(isPalindrome(number));
    }

}