package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {
		Random randomizer = new Random();
		Scanner scanner = new Scanner(System.in);

		int randomNumber = randomizer.nextInt(100) + 1;

		int guess = 0;
		int guessCtr = 0;

		while (guessCtr < 5) {
			System.out.println("Pick a number between 1 and 100: ");
			guess = scanner.nextInt();

			if (guess > 100 || guess < 1) {
				System.out.println("Your guess is not between 1 and 100, please try again.");
				guess = scanner.nextInt();
				continue;
			}
			
			if (guess == randomNumber) {
				System.out.println("You win!");
				break;
			} else if (guessCtr < 4) {
				if (guess < randomNumber) {
					System.out.println("Please pick a higher number: ");
				} else if (guess > randomNumber) {
					System.out.println("Please pick a lower number: ");
				}
			}
			guessCtr++;
		}
		if (guess != randomNumber) {
			System.out.println("You lose, the number to guess was " + randomNumber);
		}
		scanner.close();
		
	}
}
