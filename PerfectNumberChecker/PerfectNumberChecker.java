import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        int n,sum=0;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++){
            if(n%i==0){
                sum +=i;
            }
        }
        sum -= n;
        if(n==sum){
            System.out.println(n + " is a perfect number");
        } else{
            System.out.println(n + " is not a perfect number");
        }

    }
}
