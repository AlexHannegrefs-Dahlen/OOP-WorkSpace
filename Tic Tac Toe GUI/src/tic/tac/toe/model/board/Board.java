package tic.tac.toe.model.board;

import java.io.Serializable;

/**
 * 
 * @author Alex Tic Tac Toe Board
 */
public class Board implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static BoardSpace[] Boardspaces = new BoardSpace[9];

	/**
	 * makes new board
	 */
	public Board() {
		for (int i = 0; i < Board.Boardspaces.length; i++) {
			Boardspaces[i] = new BoardSpace(null, false);
		}
	}

	/**
	 * @return the boardspaces
	 */
	public BoardSpace[] getBoardspaces() {
		return Boardspaces;
	}

	/**
	 * @param boardspaces
	 *            the boardspaces to set
	 */
	public void setBoardspaces(BoardSpace[] boardspaces) {
		Boardspaces = boardspaces;
	}

}
