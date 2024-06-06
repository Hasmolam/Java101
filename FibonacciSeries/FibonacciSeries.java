import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n1,n2=0,n3=1;

        System.out.print("Enter the number of elements: ");
        n1 = input.nextInt();

        for(int i=1; i<=n1;i++){
            System.out.print(n2+" ");
            n3=n2+n3;
            n2=n3-n2;    
        }
    }
}
