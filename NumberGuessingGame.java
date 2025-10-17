import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1; // random number between 1 and 100
        int userGuess = 0;
        int attempts = 0;

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess it!\n");

        // Loop until the user guesses correctly
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.\n");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.\n");
            } else {
                System.out.println("🎉 Congratulations! You guessed the correct number " + numberToGuess + "!");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }

        sc.close();
    }
}
