# ATM Project

This Java program simulates an ATM where users can manage their bank account.

## Features

- Log in with a username and password.
- Perform the following operations:
  - Deposit money into the account.
  - Withdraw money from the account (if sufficient balance is available).
  - Check the account balance.
  - Exit the ATM.

## Usage

1. Compile the program: `javac ATM.java`
2. Run the program: `java ATM`
3. Follow the prompts to log in and perform transactions.

## Notes

- The program uses a `Scanner` object to read user input.
- It handles incorrect login attempts and blocks the account after 3 failed attempts.
- Users can deposit, withdraw, and check their account balance.
- The program runs in a loop until the user chooses to exit.

