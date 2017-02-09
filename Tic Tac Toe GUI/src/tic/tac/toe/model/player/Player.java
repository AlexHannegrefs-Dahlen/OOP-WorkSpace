package tic.tac.toe.model.player;

/**
 * 
 * @author Alex
 *
 */
public abstract class Player {

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
