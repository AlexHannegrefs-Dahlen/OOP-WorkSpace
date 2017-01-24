package tic.tac.toe.controller;

import java.io.IOException;

import tic.tac.toe.model.board.Board;
import tic.tac.toe.model.player.OPlayer;
import tic.tac.toe.model.player.Player;
import tic.tac.toe.model.player.XPlayer;
import tic.tac.toe.view.Viewer;

public class Tic_Tac_Toe {
	private Player playerX;
	private Player playerO;
	private static Board gameBoard = new Board();

	private char O = 'O';
	private char X = 'X';

	public void run() throws IOException {
		playerX = new XPlayer(true);
		playerO = new OPlayer(false);
		boolean gameQuit = false;
		while (!gameQuit) {
			Viewer.printBoard();
			if (playerX.isTurn()) {
				Viewer.displayStringToUser("Player X's turn");
				takeSquareUserSelected(Viewer.getSquareSelection());
			} else {
				Viewer.displayStringToUser("Player O's turn");
				takeSquareUserSelected(Viewer.getSquareSelection());
			}
			Player won = checkForWinner();
			if (won == null)
				switchTurns();
		}
	}

	private void takeSquareUserSelected(int userSelection) {
		if (playerX.isTurn())
			gameBoard.getBoardspaces()[userSelection - 1].setSymbol(X);
		else
			gameBoard.getBoardspaces()[userSelection - 1].setSymbol(O);
		gameBoard.getBoardspaces()[userSelection - 1].setTaken(true);
	}

	private Player checkForWinner() {
		return null;
	}

	private void switchTurns() {
		playerO.setTurn(!playerO.isTurn());
		playerX.setTurn(!playerX.isTurn());
	}

	public static Board getGameBoard() {
		return gameBoard;
	}
}