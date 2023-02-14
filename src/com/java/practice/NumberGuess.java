package com.java.practice;

import java.util.Random;
import java.util.Scanner;

class Game{
	private int num;
	private int yourGussdedNumbe;
	private int numOfGuess;
	
	public Game(){
		// TODO Auto-generated constructor stub
		Random random = new Random();
		this.num = random.nextInt(100);
	}
	
	
	public void takeUserInput() {
		System.out.println("Enter your guess");
		Scanner scanner= new Scanner(System.in);
		this.yourGussdedNumbe = scanner.nextInt();
		this.numOfGuess++;
	}
	
	public boolean isCorrectNumber() {
		if (num == yourGussdedNumbe) {
			System.out.println("You guessed it right!");
			System.out.format("you guessed it in %d attempts",numOfGuess);
			return true;
		}
		else if (num<yourGussdedNumbe) {
			System.out.println("Little Low");
			return false;
		}
		else {
			System.out.println("Little High");
			return false;
		}
	}
	
}
public class NumberGuess {
	public static void main(String [] args) {
		Game g = new Game();
		boolean b = false;
		while (!b) {
			g.takeUserInput();
			b = g.isCorrectNumber();
			
		}
		
	}
}
