package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {
		Random randomizer = new Random(); //creates a randomizer var from the Random class
		Scanner scanner = new Scanner(System.in);// creates a new Scanner

		int randomNumber = randomizer.nextInt(100) + 1; //creates an int var that chooses a random # between 1 and 100

		int guess = 0; //int var
		int guessCtr = 0;//int var

		while (guessCtr < 5) {//while loop up to 5 times
			System.out.println("Pick a number between 1 and 100: ");
			guess = scanner.nextInt(); //user inputs number to assign variable guess to

			if (guess > 100 || guess < 1) { //if statement to check to see if user "guess" is within range
				System.out.println("Your guess is not between 1 and 100, please try again.");
				guess = scanner.nextInt();
				continue;
			}
			
			if (guess == randomNumber) { // if statement if guess is correct
				System.out.println("You win!");
				break; //breaks the loop
			} else if (guessCtr < 4) { 
				if (guess < randomNumber) {
					System.out.println("Please pick a higher number: ");
				} else if (guess > randomNumber) {
					System.out.println("Please pick a lower number: ");
				}
			}
			guessCtr++;//increments guess counter
		}
		if (guess != randomNumber) { // if all guesses are made and guess does not equal randomNumber 
			System.out.println("You lose, the number to guess was " + randomNumber);
		}
		scanner.close();//closes the scanner
		
	}
}
