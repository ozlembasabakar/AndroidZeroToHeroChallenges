Write a program to simulate a number guessing game. The program generates a random integer between `1` and `100`. The user has 10 attempts to guess the number. After each incorrect guess, the program should indicate whether the guess is too high or too low.

### Function Description
Implement the function `guessNumber() -> String`.

- The program should validate that the user's input is a non-blank string and a valid integer between `1` and `100`.

The function should return:

- If the guess is correct, it should display: `You win! The number was {randomNumber}.`
- If the guess is incorrect, it should display: 
    - `Too high!` if the guess is greater than the random number.
    - `Too low!` if the guess is less than the random number.
- If all attempts are used and the number is not guessed, it should display: `You lose! The number was {randomNumber}.`
    
**Sample Input 1**
```
guess = 50  
randomNumber = 30  
attempts = 4
```
**Sample Output 1**
```
Too high!
```
**Sample Input 2**
```
guess = 30  
randomNumber = 30  
attempts = 3
```
**Sample Output 2**
```
You win! The number was 30
```
