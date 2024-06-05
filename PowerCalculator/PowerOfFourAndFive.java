import java.util.Scanner;

public class PowerOfFourAndFive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Enter the number: ");
        n = input.nextInt();

        System.out.print("Power of 4: ");
        for(int i=1; i<=n ; i*=4) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.print("Power of 5: ");
        for(int i=1; i<=n ; i*=5) {
            System.out.print(i + ",");
        }
}
}
