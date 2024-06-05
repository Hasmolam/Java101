import java.util.Scanner;

public class FourMultiplesSum {
    public static void main(String[] args) {
        
        int n, sum=0;

        Scanner input = new Scanner(System.in);


        do{
            System.out.print("Enter a number: ");
            n = input.nextInt();

            if(n%4==0){
                sum+=n;
            }
        }while(n%2==0);

        System.out.println("Sum of 4 multiples: " + sum);
    }
}
