package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {
	/**
	 * Checking for an option like NoPlay, Ladder and Snake
	 *  Moving the player position according to the option
	 */
	public void checkingOfAnOption() {
		int playerPosition = 0;
		Random random = new Random();
		int randomCheck = random.nextInt(3);
		int randomNumber = 1 + random.nextInt(6);
		switch (randomCheck) {
		case 1:
			System.out.println("The player lands at the base of the ladder");
			playerPosition += randomNumber;
			System.out.println("The position of player is : " + playerPosition);
			break;
		case 2:
			System.out.println("The player lands on a top of a snake");
			playerPosition -= randomNumber;
			System.out.println("The position of player is : " + playerPosition);
			break;
		default:
			System.out.println("The player has choosen to noplay");
			playerPosition = playerPosition;
			System.out.println("The position of player is : " + playerPosition);
		}
	}

	public static void main(String args[]) {
		System.out.println("Welcome to Snake and Ladder..!");
		SnakeAndLadder object = new SnakeAndLadder();
		object.checkingOfAnOption();
	}
}
