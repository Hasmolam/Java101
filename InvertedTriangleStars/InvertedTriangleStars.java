import java.util.Scanner;

public class InvertedTriangleStars {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int digitNumber,tempNumber;

        System.out.print("Enter the number of digits: ");
        digitNumber = input.nextInt();


        // Number of Spaces
        for(int i=digitNumber; i>=1;i--){
            //Number of Stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
