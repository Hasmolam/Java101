public class PrimeNumberFinder {
    public static void main(String[] args) {
        int start = 1;
        int lastNumber = 100;
        
        System.out.println("Prime numbers between "+ 1 +" and "+ 100);
        
        for (int number = start; number <= lastNumber; number++) {
            boolean isPrime = true;
            
            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i * i <= number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}