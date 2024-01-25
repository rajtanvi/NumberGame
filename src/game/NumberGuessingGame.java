package game;
	import java.util.Scanner;
	import java.util.concurrent.ThreadLocalRandom;

	public class NumberGuessingGame {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101); // Generate random number between 1 and 100
	        int maxAttempts = 10;
	        int guessCount = 0;

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("I'm thinking of a number between 1 and 100.");

	        while (guessCount < maxAttempts) {
	            System.out.print("Guess a number: ");
	            int guess = scanner.nextInt();
	            guessCount++;

	            if (guess == randomNumber) {
	                System.out.println("Congratulations! You guessed the number in " + guessCount + " attempts.");
	                break;
	            } else if (guess < randomNumber) {
	                System.out.println("Too low. Try again.");
	            } else {
	                System.out.println("Too high. Try again.");
	            }

	            if (guessCount == maxAttempts) {
	                System.out.println("Sorry, you ran out of attempts. The number was " + randomNumber + ".");
	            }
	        }
	    }
	}

