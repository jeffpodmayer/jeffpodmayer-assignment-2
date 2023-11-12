package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {
		Random randomNumber = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int random = randomNumber.nextInt(100) + 1;
		
		System.out.println("Pick a number between 1 and 100: ");
		int guess = scanner.nextInt();

			for (int i = 0; i < 5; i++) {
				if (guess > 100 || guess < 1) {
					System.out.println("Your guess is not between 1 and 100, please try again.");
					guess = scanner.nextInt();
					i--;
				} else if (guess == random) {
					System.out.println("You win!");
					scanner.close();
					break;
				} else if (i == 4){
					System.out.println("You lose, the number to guess was " + random);
				} else if (guess < random) {
					System.out.println("Please pick a higher number: ");
					guess = scanner.nextInt();
				} else if (guess > random) {
					System.out.println("Please pick a lower number: ");
					guess = scanner.nextInt();
				} 
			}			
	    }
   }
		
		
 

