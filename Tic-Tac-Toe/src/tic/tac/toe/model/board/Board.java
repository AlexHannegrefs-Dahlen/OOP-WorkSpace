package tic.tac.toe.model.board;

public class Board {
	private static BoardSpace[] Boardspaces = new BoardSpace[9];

	public Board() {
		for (int i = 0; i < Board.Boardspaces.length; i++) {
			Boardspaces[i] = new BoardSpace((char) (i + 49), false);
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
