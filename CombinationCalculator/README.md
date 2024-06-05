# CombinationCalculator

This Java program calculates the combination (C(n, r)) of two numbers n and r.

## Usage

1. Compile the program: `javac CombinationCalculator.java`
2. Run the program: `java CombinationCalculator`
3. Enter the values for n and r when prompted.
4. The program will calculate and display the combination C(n, r).


## Notes

- The program uses a `Scanner` object to read user input for n and r.
- It calculates the factorial of n, r, and (n-r) to determine the combination.
- The combination C(n, r) is calculated using the formula: C(n, r) = n! / (r! * (n-r)!).
- The result is displayed as a double.

## Limitations

- This program assumes that n and r are non-negative integers and that n is greater than or equal to r.

