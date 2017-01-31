package tic.tac.toe.controller;

import java.io.IOException;

import tic.tac.toe.model.board.Board;
import tic.tac.toe.model.player.OPlayer;
import tic.tac.toe.model.player.Player;
import tic.tac.toe.model.player.XPlayer;
import tic.tac.toe.view.Viewer;

/**
 * 
 * @author Alex tic tac toe controller
 */
public class Tic_Tac_Toe {
	private static Player playerX;
	private static Player playerO;
	private static Board gameBoard;

	private final int SQUARE_ONE = 0;
	private final int SQUARE_TWO = 1;
	private final int SQUARE_THREE = 2;
	private final int SQUARE_FOUR = 3;
	private final int SQUARE_FIVE = 4;
	private final int SQUARE_SIX = 5;
	private final int SQUARE_SEVEN = 6;
	private final int SQUARE_EIGHT = 7;
	private final int SQUARE_NINE = 8;

	/**
	 * start
	 * 
	 * @throws IOException
	 */
	public void run() throws IOException {
		do {
			gameBoard = new Board();
			playerX = new XPlayer(true);
			playerO = new OPlayer(false);
			Player won = null;
			boolean gameQuit = false;
			int turnCounter = 0;
			while (!gameQuit) {
				Viewer.printBoard();
				if (playerX.isTurn()) {
					Viewer.displayStringToUser("Player X's turn");
					takeSquareUserSelected(Viewer.getSquareSelection());
				} else {
					Viewer.displayStringToUser("Player O's turn");
					takeSquareUserSelected(Viewer.getSquareSelection());
				}
				won = checkForWinner(SQUARE_ONE, SQUARE_TWO, SQUARE_THREE);
				if (won == null) {
					won = checkForWinner(SQUARE_FOUR, SQUARE_FIVE, SQUARE_SIX);
					if (won == null) {
						won = checkForWinner(SQUARE_SEVEN, SQUARE_EIGHT, SQUARE_NINE);
						if (won == null) {
							won = checkForWinner(SQUARE_ONE, SQUARE_FIVE, SQUARE_NINE);
							if (won == null) {
								won = checkForWinner(SQUARE_SEVEN, SQUARE_FIVE, SQUARE_THREE);
								if (won == null) {
									won = checkForWinner(SQUARE_ONE, SQUARE_FOUR, SQUARE_SEVEN);
									if (won == null) {
										won = checkForWinner(SQUARE_TWO, SQUARE_FIVE, SQUARE_EIGHT);
										if (won == null) {
											won = checkForWinner(SQUARE_THREE, SQUARE_SIX, SQUARE_NINE);
											if (won == null) {
												switchTurns();
												turnCounter++;
											}
										}
									}
								}
							}
						}
					}
				}
				if (won != null || turnCounter == 9) {
					gameQuit = true;
				}
			}
			if (won != null) {
				Viewer.displayStringToUser((checkWhoOne(won) + " is the winner!"));
				Viewer.printBoard();
			} else {
				Viewer.displayStringToUser("Tie game");
			}
		} while (Viewer.replayGame());
	}

	private String checkWhoOne(Player winner) {
		if (winner instanceof XPlayer)
			return "Player X";
		else
			return "Player O";
	}

	private void takeSquareUserSelected(int userSelection) {
		if (playerX.isTurn())
			gameBoard.getBoardspaces()[userSelection - 1].setSymbol(playerX);
		else
			gameBoard.getBoardspaces()[userSelection - 1].setSymbol(playerO);
		gameBoard.getBoardspaces()[userSelection - 1].setTaken(true);
	}

	private Player checkForWinner(int checkOne, int checkTwo, int checkThree) {
		if (gameBoard.getBoardspaces()[checkOne].getSymbol() == gameBoard.getBoardspaces()[checkTwo].getSymbol()
				&& gameBoard.getBoardspaces()[checkOne].getSymbol() == gameBoard.getBoardspaces()[checkThree]
						.getSymbol()) {
			if (gameBoard.getBoardspaces()[checkOne].getSymbol() == playerX) {
				return playerX;
			} else if (gameBoard.getBoardspaces()[checkOne].getSymbol() == playerO) {
				return playerO;
			}
		}
		return null;
	}

	private void switchTurns() {
		playerO.setTurn(!playerO.isTurn());
		playerX.setTurn(!playerX.isTurn());
	}

	/**
	 * 
	 * @return board
	 */
	public static Board getGameBoard() {
		return gameBoard;
	}

	/**
	 * 
	 * @return OPlayer
	 */
	public static Player getOPlayer() {
		return playerO;
	}

	/**
	 * 
	 * @return XPlayer
	 */
	public static Player getXPlayer() {
		return playerX;
	}
}
