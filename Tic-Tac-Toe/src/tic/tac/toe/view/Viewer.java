package tic.tac.toe.view;

import java.io.IOException;

import ConsoleUI.ConsoleUI;
import tic.tac.toe.controller.Tic_Tac_Toe;

public class Viewer {

	public static void printBoard() {
		for (int i = 0; i < Tic_Tac_Toe.getGameBoard().getBoardspaces().length; i++) {
			if(Tic_Tac_Toe.getGameBoard().getBoardspaces()[i].getSymbol() == null)
				System.out.print(i+1);
			else if(Tic_Tac_Toe.getGameBoard().getBoardspaces()[i].getSymbol() == Tic_Tac_Toe.getXPlayer())
				System.out.print("X");
			else
				System.out.print("O");
			if (i == 2 || i == 5 || i == 8)
				System.out.println("");
		}
	}

	public static int getSquareSelection() throws IOException {
		boolean valid = false;
		int squareSelection = 0;
		while (!valid) {
			squareSelection = ConsoleUI.promptForInt("What square do you want?", 1, 9);
			if ((Tic_Tac_Toe.getGameBoard().getBoardspaces()[squareSelection - 1].isTaken()))
				displayStringToUser("Space already taken");
			else
				valid = true;
		}
		return squareSelection;
	}

	public static void displayStringToUser(String message) {
		System.out.println(message);
	}
}
