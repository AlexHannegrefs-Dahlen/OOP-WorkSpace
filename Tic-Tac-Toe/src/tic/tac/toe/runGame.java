package tic.tac.toe;

import java.io.IOException;

import tic.tac.toe.controller.Tic_Tac_Toe;
/**
 * 
 * @author Alex
 *	run tic tac toe
 */
public class runGame {
	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Tic_Tac_Toe game = new Tic_Tac_Toe();
		game.run();
	}

}
