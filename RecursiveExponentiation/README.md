# RecursiveExponentCalculator

This Java program calculates the result of raising a base number to an exponent using a recursive method.

## Usage

1. Compile the program: `javac RecursiveExponentCalculator.java`
2. Run the program: `java RecursiveExponentCalculator`
3. Enter the base number when prompted.
4. Enter the exponent when prompted.
5. The program will calculate and display the result of raising the base number to the exponent.

## Notes

- The program uses a recursive method `exponentCalculator` to calculate the result of raising a base number to an exponent.
- The base case for the recursion is when the exponent is 0, in which case the result is 1.
- For other values of the exponent, the program recursively calls itself with the exponent decremented by 1, multiplying the base number each time.

