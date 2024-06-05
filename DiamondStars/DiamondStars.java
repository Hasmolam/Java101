import java.util.Scanner;

public class DiamondStars {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.println("Enter the number of rows: ");
        int n = input.nextInt();

        // Print the upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces before the stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces before the stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

