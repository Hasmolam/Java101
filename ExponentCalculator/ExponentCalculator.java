import java.util.Scanner;

public class ExponentCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n,k,total=1;

        System.out.print("Enter base number: ");
        n = input.nextInt();
        System.out.print("Enter exponent number: ");
        k = input.nextInt();

        for(int i=1;i<=k;i++){
            total*=n;
        }
        System.out.println(total);      
    }
}
