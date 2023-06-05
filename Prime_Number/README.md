Here's the algorithm for the given code:

1. Start the program.
2. Prompt the user to enter a prime number.
3. Read and store the user's input in the `number` variable.
4. Call the `isPrimeNumber()` method, passing the `number` as an argument.
5. Inside the `isPrimeNumber()` method:
   - Check if the `number` is less than or equal to 1.
     - If it is, return `false` since prime numbers are greater than 1.
   - Iterate from 2 to `number - 1` (exclusive) using a `for` loop.
     - For each iteration, check if the `number` is divisible evenly by the current value of `i`.
       - If it is, return `false` since it has a factor other than 1 and itself.
   - If no factors are found within the loop, return `true` to indicate that the `number` is a prime number.
6. Based on the return value of the `isPrimeNumber()` method, print the appropriate message to the console.
7. End the program.

This algorithm initializes the `number`, asks the user to input a number, checks if it is prime using the `isPrimeNumber()` method, and prints the result accordingly. The `isPrimeNumber()` method iterates through numbers from 2 to `number - 1` and checks for divisibility to determine if the `number` is prime or not.