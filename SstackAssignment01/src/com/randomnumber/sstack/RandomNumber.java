package com.randomnumber.sstack;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		int max = 100;
		String ANSI_RED = "\u001B[41m";
		int numberGuess = 1;
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int answer = random.nextInt(max) + 1;

		System.out.println("Please guess number between 1 to 100");

		int guess = input.nextInt();

		while (guess != answer) {

			System.out.println("Keep guessing between 1 to 100");
			guess = input.nextInt();
			numberGuess++;

			if (guess > answer - 10 && guess < answer + 10) {

				System.out.println(ANSI_RED + "Your guess is within 10 of correct answer " + answer);
				if (answer == 63) {
					System.out.println("Guess between 53 to 57");
					guess = input.nextInt();
				}
				break;
			} else if (numberGuess == 5) {
				System.out.println(ANSI_RED + "Sorry you exceed number of attempt " + numberGuess);
				break;
			}
		}
		input.close();
	}
}
