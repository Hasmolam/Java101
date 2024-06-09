import java.util.*;

public class NumberModifier {

    public static void numberModifier(int n) {
        // Print the initial number
        System.out.println(n);

        // Base case: if the number is less than or equal to 0, print it and return
        if (n <= 0) {
            System.out.println(n);
            return;
        }

        // Recursive step: subtract 5 from the number and call the method again
        numberModifier(n - 5);

        // Print the modified number at the current step
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        numberModifier(n);
    }
}
