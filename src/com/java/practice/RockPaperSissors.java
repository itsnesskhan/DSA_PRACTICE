package com.java.practice;

import java.util.Random;
import java.util.Scanner;

public class RockPaperSissors {
	public static void RockPaperSissors(int yourInput, int computerInput) {
		if (yourInput == computerInput) {
			System.out.println("DRAW");
		}
		else if((yourInput == 0 && computerInput ==2) || (yourInput == 2  &&  computerInput == 1) || (yourInput == 1 && computerInput ==0)) {
			System.out.println("YOU WIN");
	
		}
		else {
			System.out.println("YOU LOOSE");
		}
		System.out.println("Computer input"+computerInput);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Game");
		System.out.println("Enter a number between 1 to 3");
		System.out.println("0 for Rock");
		System.out.println("1 for Paper");
		System.out.println("2 for Sissors");
		Scanner scanner = new Scanner(System.in);
		int YourInput = scanner.nextInt();
		Random random = new Random();
		int computerInput = random.nextInt(3);
		RockPaperSissors(YourInput, computerInput);
		
	}

}
