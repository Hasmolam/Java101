import java.util.Scanner;

public class Calculator {

    static int sum(int a, int b){
        return a+b;
    }

    static int sub(int a, int b){
        return a-b;
    }

    static int mul(int a, int b){
        return a*b;
    }

    static double div(double a, double b){
        if(b == 0){
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a/b;
    }

    static int mod(int a, int b){
        return a%b;
    }

    static int pow(int a, int b){
        return (int)Math.pow(a,b);
    }

    static int fact(int a){
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }

    static int area(int a, int b){
        return a*b;
    }

    static int perimeter(int a, int b){
        return 2*(a+b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu = "1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulo\n6. Power\n7. Factorial\n8. Rectangle Area\n9. Rectangle Perimeter\n0. Exit";

        while (true) {
            System.out.println(menu);
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            if (choice == 0) {
                System.out.println("Good Bye");
                System.exit(0);
            }

            int a, b;
            if (choice == 7) {
                System.out.print("Enter a number: ");
                a = input.nextInt();
                b = 0;
            } else {
                System.out.println("Enter two numbers: ");
                a = input.nextInt();
                b = input.nextInt();
            }

            double result = 0;
            switch (choice) {
                case 1:
                    result = sum(a, b);
                    break;
                case 2:
                    result = sub(a, b);
                    break;
                case 3:
                    result = mul(a, b);
                    break;
                case 4:
                    result = div(a, b);
                    break;
                case 5:
                    result = mod(a, b);
                    break;
                case 6:
                    result = pow(a, b);
                    break;
                case 7:
                    result = fact(a);
                    break;
                case 8:
                    result = area(a, b);
                    break;
                case 9:
                    result = perimeter(a, b);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

            System.out.println("Result: " + result);
        }
    }


}
