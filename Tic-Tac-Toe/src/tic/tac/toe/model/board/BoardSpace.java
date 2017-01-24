package tic.tac.toe.model.board;

public class BoardSpace {

	private char symbol;
	private boolean taken;

	BoardSpace(char symbol, boolean taken) {
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
	public char getSymbol() {
		return symbol;
	}

	/**
	 * @param symbol
	 *            the symbol to set
	 */
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
}
