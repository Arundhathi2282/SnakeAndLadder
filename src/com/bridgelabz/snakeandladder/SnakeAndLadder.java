package com.bridgelabz.snakeandladder;
import java.util.Random;

public class SnakeAndLadder {
	static Random random = new Random();
	static int playerOnePosition = 0, playerTwoPosition = 0;

	/**
	 * Rolling the dice to get a number between 1 to 6
	 * 
	 * @return
	 */
	private static int rollDie() {
		int randomNumber = 1 + random.nextInt(6);
		return randomNumber;
	}

	/**
	 * Getting a random number between 0 to 2 to choose an option like No play,
	 * Ladder and Snake
	 * 
	 * @return
	 */
	private static int randomOption() {
		int randomOption = random.nextInt(3);
		return randomOption;
	}

	/**
	 * This method will give you the position of the first player
	 */
	public static void playerOneTurn() {
		int playerOneOption = randomOption();
		if (playerOneOption == 1) {
			playerOnePosition += rollDie();
			System.out.println("Player one position : " + playerOnePosition);
		} else if (playerOneOption == 2) {
			playerOnePosition -= rollDie();
			System.out.println("Player one Position : " + playerOnePosition);
		} else {
			playerOnePosition = playerOnePosition;
			System.out.println("Player one Position : " + playerOnePosition);
		}
	}

	/**
	 * This method will give you the position of the second player
	 */
	public static void playerTwoTurn() {
		int playerTwoOption = randomOption();
		if (playerTwoOption == 1) {
			playerTwoPosition += rollDie();
			System.out.println("Player two Position : " + playerTwoPosition);
		} else if (playerTwoOption == 2) {
			playerTwoPosition -= rollDie();
			System.out.println("Player two Position : " + playerTwoPosition);
		} else {
			playerTwoPosition = playerTwoPosition;
			System.out.println("Player two Position : " + playerTwoPosition);
		}
	}

	/**
	 * This the main method of the Snake and Ladder Program
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		System.out.println("Welcome to the Snake and Ladder");
		while (true) {
			playerOneTurn();
			if (playerOneWinCheck() == true) {
				break;
			}
			playerTwoTurn();
			if (playerTwoWinCheck() == true) {
				break;
			}
		}
	}

	/**
	 * This method will checks the winning position of the player two
	 * 
	 * @return
	 */
	private static boolean playerTwoWinCheck() {
		if (playerTwoPosition < 0) {
			playerTwoPosition = 0;
			return false;
		} else if (playerTwoPosition > 100) {
			playerTwoPosition -= rollDie();
			return false;
		} else {
			if (playerTwoPosition == 100) {
				System.out.println("The player two has won the game by reaching winning position");
				return true;
			}
			return false;
		}

	}

	/**
	 * This method will checks the winning position of the player one
	 * 
	 * @return
	 */
	private static boolean playerOneWinCheck() {
		if (playerOnePosition < 0) {
			playerOnePosition = 0;
			return false;
		} else if (playerOnePosition > 100) {
			playerOnePosition -= rollDie();
			return false;
		} else {
			if (playerOnePosition == 100) {
				System.out.println("The player one has won the game by reaching winning position");
				return true;
			}
			return false;
		}
	}
}