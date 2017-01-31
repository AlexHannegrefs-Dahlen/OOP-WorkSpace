package tic.tac.toe.model.board;

import tic.tac.toe.model.player.Player;

/**
 * 
 * @author Alex
 * 
 */
public class BoardSpace {

	private Player symbol;
	private boolean taken;

	BoardSpace(Player symbol, boolean taken) {
		this.setSymbol(symbol);
		this.setTaken(taken);
	}

	/**
	 * @return the taken
	 */
	public boolean isTaken() {
		return taken;
	}

	/**
	 * @param taken
	 *            the taken to set
	 */
	public void setTaken(boolean taken) {
		this.taken = taken;
	}

	/**
	 * @return the symbol
	 */
	public Player getSymbol() {
		return symbol;
	}

	/**
	 * @param symbol
	 *            the symbol to set
	 */
	public void setSymbol(Player symbol) {
		this.symbol = symbol;
	}
}
