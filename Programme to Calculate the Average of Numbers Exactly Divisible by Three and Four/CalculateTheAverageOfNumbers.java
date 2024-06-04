import java.util.Scanner;

public class CalculateTheAverageOfNumbers  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1;
        double average = 0,totalNumber = 0;

        System.out.print("Enter a number: ");
        n1 = input.nextInt();

        int i =0;

        while(i<n1){
            i++;
            System.out.println(i);
            if(i%3==0){
                average += i;
                totalNumber++;
            } else if (i%4==0){
                average += i;
                totalNumber++;
            } else{
                continue;
            }
        }

        System.out.println("Average: "+(average/totalNumber));
    }
}
