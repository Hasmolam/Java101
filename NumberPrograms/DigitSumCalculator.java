import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n,sum=0;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        int tempNumber = n;
        while(tempNumber != 0){
            sum += tempNumber%10;
            tempNumber /= 10;
        }
        System.out.println("Sum of digits of "+n+" is "+sum);
        
        } 
        
    }
