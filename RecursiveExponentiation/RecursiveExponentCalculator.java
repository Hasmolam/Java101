import java.util.Scanner;

public class RecursiveExponentCalculator {

    public static int exponentCalculator(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * exponentCalculator(base, exponent - 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = input.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();
        System.out.println("The result is " + exponentCalculator(base, exponent));
    }

}
