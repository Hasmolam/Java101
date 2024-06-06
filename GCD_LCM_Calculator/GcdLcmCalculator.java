import java.util.Scanner;

public class GcdLcmCalculator {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int n1,n2,i=1,gcd=1;

        System.out.print("Enter the 1st number: ");
        n1 = input.nextInt();

        System.out.print("Enter the 2st number: ");
        n2 = input.nextInt();

        if (n2>n1){
            while(i <= n1){
                if (n1%i==0 && n2%i==0){
                    gcd = i;
                }
                
                i++;
            }
        } else if (n1 > n2){
            while(i <= n2){
                if (n1%i==0 && n2%i==0){
                    gcd = i;
                }
                
                i++;
            }
        } else if(n1 == n2){
            while(i <= n1){
                if (n1%i==0 && n2%i==0){
                    gcd = i;
                }
                
                i++;
            }
        } else{
            System.out.println("Invalid input.");
        }

        
        System.out.println("GCD: " + gcd);
        int lcm = (n1*n2)/gcd;
        System.out.println("LCM: " + lcm);

    }
}
