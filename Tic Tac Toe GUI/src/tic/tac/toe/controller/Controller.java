package tic.tac.toe.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import tic.tac.toe.model.board.Board;
import tic.tac.toe.model.player.OPlayer;
import tic.tac.toe.model.player.Player;
import tic.tac.toe.model.player.XPlayer;
import tic.tac.toe.view.GUI;

public class Controller {
	private static Board gameBoard;

	private static Player playerWon;
	private static OPlayer playerO;
	private static XPlayer playerX;

	private static GUI GUI;

	private static int turnCounter;

	public static void main(String[] args) {
		runGame();
	}

	public static void runGame() {
		turnCounter = 0;
		gameBoard = new Board();
		playerO = new OPlayer(false);
		playerX = new XPlayer(true);
		playerWon = null;
		GUI = new GUI();
		GUI.initGUI(gameBoard);
	}

	public static void takeSquare(int square) {
		if (!gameBoard.getBoardspaces()[square - 1].isTaken()) {
			if (playerX.isTurn()) {
				gameBoard.getBoardspaces()[square - 1].setSymbol(playerX);
			} else {
				gameBoard.getBoardspaces()[square - 1].setSymbol(playerO);
			}
			gameBoard.getBoardspaces()[square - 1].setTaken(true);
			switchTurns();
			turnCounter++;
			checkTurnCounter();
		}
	}

	private static void checkTurnCounter() {
		if (turnCounter >= 3) {
			playerWon = checkForWinner();
			if (playerWon != null) {
				if (playerWon instanceof XPlayer)
					GUI.showMessage("Player X Won!");
				else
					GUI.showMessage("Player O Won!");
				if (GUI.checkPlayAgain() == 0) {
					runGame();
				} else
					System.exit(0);
			}
		}
		if (turnCounter == 9) {
			GUI.showMessage("Tie Game");
			if (GUI.checkPlayAgain() == 0) {
				runGame();
			} else
				System.exit(0);
		}
	}

	private static Player checkForWinner() {
		if (gameBoard.getBoardspaces()[0].getSymbol() == gameBoard.getBoardspaces()[1].getSymbol()
				&& gameBoard.getBoardspaces()[0].getSymbol() == gameBoard.getBoardspaces()[2].getSymbol()) {
			if (gameBoard.getBoardspaces()[0].getSymbol() instanceof XPlayer) {
				return playerX;
			} else if (gameBoard.getBoardspaces()[0].getSymbol() instanceof OPlayer) {
				return playerO;
			} else {
				return playerWon;
			}
		} else if (gameBoard.getBoardspaces()[3].getSymbol() == gameBoard.getBoardspaces()[4].getSymbol()
				&& gameBoard.getBoardspaces()[3].getSymbol() == gameBoard.getBoardspaces()[5].getSymbol()) {
			if (gameBoard.getBoardspaces()[3].getSymbol() instanceof XPlayer) {
				return playerX;
			} else if (gameBoard.getBoardspaces()[3].getSymbol() instanceof OPlayer) {
				return playerO;
			} else {
				return playerWon;
			}
		} else if (gameBoard.getBoardspaces()[6].getSymbol() == gameBoard.getBoardspaces()[7].getSymbol()
				&& gameBoard.getBoardspaces()[6].getSymbol() == gameBoard.getBoardspaces()[8].getSymbol()) {
			if (gameBoard.getBoardspaces()[6].getSymbol() instanceof XPlayer) {
				return playerX;
			} else if (gameBoard.getBoardspaces()[6].getSymbol() instanceof OPlayer) {
				return playerO;
			} else {
				return playerWon;
			}
		} else if (gameBoard.getBoardspaces()[0].getSymbol() == gameBoard.getBoardspaces()[3].getSymbol()
				&& gameBoard.getBoardspaces()[0].getSymbol() == gameBoard.getBoardspaces()[6].getSymbol()) {
			if (gameBoard.getBoardspaces()[0].getSymbol() instanceof XPlayer) {
				return playerX;
			} else if (gameBoard.getBoardspaces()[0].getSymbol() instanceof OPlayer) {
				return playerO;
			} else {
				return playerWon;
			}
		} else if (gameBoard.getBoardspaces()[1].getSymbol() == gameBoard.getBoardspaces()[4].getSymbol()
				&& gameBoard.getBoardspaces()[1].getSymbol() == gameBoard.getBoardspaces()[7].getSymbol()) {
			if (gameBoard.getBoardspaces()[1].getSymbol() instanceof XPlayer) {
				return playerX;
			} else if (gameBoard.getBoardspaces()[1].getSymbol() instanceof OPlayer) {
				return playerO;
			} else {
				return playerWon;
			}
		} else if (gameBoard.getBoardspaces()[2].getSymbol() == gameBoard.getBoardspaces()[5].getSymbol()
				&& gameBoard.getBoardspaces()[2].getSymbol() == gameBoard.getBoardspaces()[8].getSymbol()) {
			if (gameBoard.getBoardspaces()[2].getSymbol() instanceof XPlayer) {
				return playerX;
			} else if (gameBoard.getBoardspaces()[2].getSymbol() instanceof OPlayer) {
				return playerO;
			} else {
				return playerWon;
			}
		} else if (gameBoard.getBoardspaces()[0].getSymbol() == gameBoard.getBoardspaces()[4].getSymbol()
				&& gameBoard.getBoardspaces()[0].getSymbol() == gameBoard.getBoardspaces()[8].getSymbol()) {
			if (gameBoard.getBoardspaces()[0].getSymbol() instanceof XPlayer) {
				return playerX;
			} else if (gameBoard.getBoardspaces()[0].getSymbol() instanceof OPlayer) {
				return playerO;
			} else {
				return playerWon;
			}
		} else if (gameBoard.getBoardspaces()[2].getSymbol() == gameBoard.getBoardspaces()[4].getSymbol()
				&& gameBoard.getBoardspaces()[2].getSymbol() == gameBoard.getBoardspaces()[6].getSymbol()) {
			if (gameBoard.getBoardspaces()[2].getSymbol() instanceof XPlayer) {
				return playerX;
			} else if (gameBoard.getBoardspaces()[2].getSymbol() instanceof OPlayer) {
				return playerO;
			} else {
				return playerWon;
			}
		}
		return playerWon;
	}

	private static void switchTurns() {
		playerO.setTurn(!playerO.isTurn());
		playerX.setTurn(!playerX.isTurn());
	}

	public static void saveGame(String filePath) throws FileNotFoundException, IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath));
		Object[] game = new Object[] { playerO, playerX, playerWon, gameBoard, GUI };
		out.writeObject(game);
		out.close();
	}

	public static void loadGame(String filePath) throws IOException, ClassNotFoundException {
		ObjectInputStream in = null;
		
		in = new ObjectInputStream((new FileInputStream(filePath)));

		Object obj = in.readObject();
		if (!(obj instanceof Object[]))
			GUI.showMessage("Could not load");
		Object[] game = (Object[]) obj;
		playerO = (OPlayer) game[0];
		playerX = (XPlayer) game[1];
		if (game[2] instanceof OPlayer)
			playerWon = (OPlayer) game[2];
		else
			playerWon = (XPlayer) game[2];
		gameBoard = (Board) game[3];
		GUI = (GUI) game[4];
		in.close();
	}

}
