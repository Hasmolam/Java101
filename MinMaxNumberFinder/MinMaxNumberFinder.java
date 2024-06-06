import java.util.Scanner;

public class MinMaxNumberFinder {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        int mainNumber, minNumber=0,maxNumber=0,number,one=1;

        System.out.print("How many numbers will you enter: ");
        mainNumber = input.nextInt();

        for(int i= 1,j=1; i<=mainNumber; i++,j++){
            System.out.print("Enter the "+ j +"st number: ");
            number = input.nextInt();
            while(one == 1){
                maxNumber=number;
                minNumber=number;
                one--;
            }

            if(number > maxNumber){
                maxNumber = number;
            }
            if(number < minNumber){
                minNumber = number;
            }

        }

        System.out.println("Max Number: "+maxNumber);
        System.out.println("Min Number: "+minNumber);
    }
}
