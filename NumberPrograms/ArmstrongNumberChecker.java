import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        for(int i=1; i<=n; i++){
            int tempNumber = i;
            int digitNumber = 0;
            int result = 0;
            
            while(tempNumber != 0){
                tempNumber /= 10;
                digitNumber++;
            }
            
            tempNumber = i;
            
            while(tempNumber != 0){
                int lastDigit = tempNumber%10;
                int basePow = 1;
                for(int j=1; j<=digitNumber; j++){
                    basePow *= lastDigit;
                }
                result += basePow;
                tempNumber /= 10;
            }
            
            if(i == result){
                System.out.print(i+" ");
            }
        }
    }
}

