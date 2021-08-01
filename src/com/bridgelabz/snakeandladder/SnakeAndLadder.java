package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {
	public static void main(String args[]) {
		System.out.println("Welcome to Snake and Ladder..!");
		Random random = new Random();
		int randomNumber = 1 + random.nextInt(6);
		System.out.println("Number shown by die is : " + randomNumber);
	}
}
