import java.util.Scanner;

public class CombinationCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.print("Enter r: ");
        int r = input.nextInt();

        int totaln = 1, totalr = 1, nminusr = n - r, totalnminusr = 1;
        double combination;

        for(int i = 1; i <= n; i++) {
            totaln *= i;
        }

        for(int i = 1; i <= r; i++) {
            totalr *= i;
        }

        for(int i = 1; i <= nminusr; i++) {
            totalnminusr *= i;
        }

        combination = totaln / (totalr * totalnminusr);

        System.out.println(combination);}
}
