package tic.tac.toe.model.player;

import java.io.Serializable;

/**
 * 
 * @author Alex
 *
 */
public abstract class Player implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean turn;

	Player(boolean turn) {
		this.setTurn(turn);
	}

	/**
	 * @return the turn
	 */
	public boolean isTurn() {
		return turn;
	}

	/**
	 * @param turn
	 *            the turn to set
	 */
	public void setTurn(boolean turn) {
		this.turn = turn;
	}

}
