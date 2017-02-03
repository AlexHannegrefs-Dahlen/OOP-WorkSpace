package tic.tac.toe.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import tic.tac.toe.controller.Tic_Tac_Toe;
import tic.tac.toe.model.player.OPlayer;
import tic.tac.toe.model.player.XPlayer;

public class TicTacToeGUI implements ActionListener {
	private JFrame boardWindow;

	private JPanel mainPanel;

	private JButton squareOne, squareTwo, squareThree, squareFour, squareFive, squareSix, squareSeven, squareEight,
			squareNine;

	private JButton[] buttons = new JButton[9];

	private int squareSelected = 0;

	public void initGui() {
		boardWindow = new JFrame("Tic Tac Toe");
		boardWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		boardWindow.pack();
		boardWindow.setLocationRelativeTo(null);

		mainPanel = new JPanel(new GridLayout(0, 3));
		squareOne = new JButton("1");
		squareTwo = new JButton("2");
		squareThree = new JButton("3");
		squareFour = new JButton("4");
		squareFive = new JButton("5");
		squareSix = new JButton("6");
		squareSeven = new JButton("7");
		squareEight = new JButton("8");
		squareNine = new JButton("9");

		squareOne.addActionListener(this);

		buttons[0] = squareOne;
		buttons[1] = squareTwo;
		buttons[2] = squareThree;
		buttons[3] = squareFour;
		buttons[4] = squareFive;
		buttons[5] = squareSix;
		buttons[6] = squareSeven;
		buttons[7] = squareEight;
		buttons[8] = squareNine;

		mainPanel.add(squareOne);
		mainPanel.add(squareTwo);
		mainPanel.add(squareThree);
		mainPanel.add(squareFour);
		mainPanel.add(squareFive);
		mainPanel.add(squareSix);
		mainPanel.add(squareSeven);
		mainPanel.add(squareEight);
		mainPanel.add(squareNine);

		boardWindow.add(mainPanel);

	}

	public void buttonUpdater() {
		for (int I = 0; I < buttons.length; I++) {
			if (Tic_Tac_Toe.getGameBoard().getBoardspaces()[I].getSymbol() instanceof XPlayer) {
				buttons[I].setText("X");
			} else if (Tic_Tac_Toe.getGameBoard().getBoardspaces()[I].getSymbol() instanceof OPlayer) {
				buttons[I].setText("O");
			}
		}
	}

	public void showGUI() {
		boardWindow.setVisible(true);
	}

	public int getSquare() {
		return squareSelected;
	}

	public void setSquareTo0() {
		squareSelected = 0;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == squareOne) {
			squareSelected = 1;
		} else if (e.getSource() == squareTwo) {
			squareSelected = 2;
		} else if (e.getSource() == squareThree) {
			squareSelected = 3;
		} else if (e.getSource() == squareFour) {
			squareSelected = 4;
		} else if (e.getSource() == squareFive) {
			squareSelected = 5;
		} else if (e.getSource() == squareSix) {
			squareSelected = 6;
		} else if (e.getSource() == squareSeven) {
			squareSelected = 7;
		} else if (e.getSource() == squareEight) {
			squareSelected = 8;
		} else if (e.getSource() == squareNine) {
			squareSelected = 9;
		}
		if (!Tic_Tac_Toe.getGameBoard().getBoardspaces()[squareSelected - 1].isTaken()) {
			Tic_Tac_Toe.takeSquareUserSelected(squareSelected);
		} else {
			JOptionPane.showMessageDialog(boardWindow, "Pick again");
		}
	}

}