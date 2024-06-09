package com.codsoft.internship;
import java.util.Random;
import java.util.Scanner;
public class NumberGame {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        int numAttempts = 3;
	        int numRounds = 3;
	        int score = 0;

	        for (int round = 1; round <= numRounds; round++) {
	            int numberToGuess = random.nextInt(100) + 1;
	            int attempts = 0;

	            System.out.println("\n*Round " + round + ":*");
	            System.out.println("I'm thinking of a number between 1 and 100.");

	            while (attempts < numAttempts) {
	                System.out.print("Enter your guess: ");
	                int guess = scanner.nextInt();

	                if (guess < numberToGuess) {
	                    System.out.println("Too low!");
	                } else if (guess > numberToGuess) {
	                    System.out.println("Too high!");
	                } else {
	                    System.out.println("Congratulations! You guessed the number in " + (attempts + 1) + " attempts.");
	                    score += 10 - attempts;
	                    break;
	                }

	                attempts++;
	            }

	            if (attempts == numAttempts) {
	                System.out.println("Sorry, you didn't guess the number. The number was " + numberToGuess);
	            }
	        }

	        System.out.println("\nYour final score is: " + score);
	        scanner.close();
	    }
	}