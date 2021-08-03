package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {
	Random random = new Random();

	/**
	 * Checking for an option like NoPlay, Ladder and Snake Moving the player
	 * position according to the option Reporting the number of times the dice was
	 * played to win the game and also the position after every die roll
	 */
	public void checkingOfAnOption() {
		int playerPosition = 0;
		int count = 1;
		while (count > 0) {
			int randomCheck = random.nextInt(3);
			int randomNumber = 1 + random.nextInt(6);
			switch (randomCheck) {
			case 1:
				playerPosition += randomNumber;
				break;
			case 2:
				playerPosition -= randomNumber;
				break;
			default:
				playerPosition = playerPosition;
			}
			if (playerPosition < 0) {
				playerPosition = 0;
			} else if (playerPosition > 100) {
				playerPosition -= randomNumber;
			} else {
				if (playerPosition == 100) {
					System.out.println("The player has won the game by reaching winning position");
					break;
				}
			}
			System.out.println("The position of the player after " + count + " roll is : " + playerPosition);
			count += 1;
		}
		System.out.println("Total count is : " + count);
	}

	public void choosePlayer() {
		int toss = random.nextInt(2);
		switch (toss) {
		case 1:
			System.out.println("Player1 has won the toss");
			checkingOfAnOption();
			break;
		default:
			System.out.println("Player2 has won the toss");
			checkingOfAnOption();
		}
	}

	public static void main(String args[]) {
		System.out.println("Welcome to Snake and Ladder..!");
		SnakeAndLadder object = new SnakeAndLadder();
		object.choosePlayer();
	}
}