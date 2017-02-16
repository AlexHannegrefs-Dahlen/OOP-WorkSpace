package tic.tac.toe.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import tic.tac.toe.controller.Controller;
import tic.tac.toe.model.board.Board;
import tic.tac.toe.model.player.OPlayer;
import tic.tac.toe.model.player.XPlayer;

public class GUI implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static JFrame frame;

	private static JPanel mainPanel;

	private static JButton square_One, square_Two, square_Three, square_Four, square_Five, square_Six, square_Seven,
			square_Eight, square_Nine, getFilePath;

	private static JLabel filePathLabel;

	private static JTextArea filePathTextArea;

	private static JMenuBar menu;

	private static JMenu game;

	private static JMenuItem newGame, saveGame, loadGame, exitGame;

	private static Board gameBoard;

	private boolean clickedSave = false;

	public void initGUI(Board gameBoard) {
		GUI.gameBoard = gameBoard;

		frame = new JFrame("Tic Tac Toe");
		frame.setExtendedState(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 650);
		frame.setLocationRelativeTo(null);

		square_One = new JButton();
		square_One.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Controller.takeSquare(1);
				buttonUpdater(square_One, 1);
			}
		});
		square_Two = new JButton();
		square_Two.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Controller.takeSquare(2);
				buttonUpdater(square_Two, 2);
			}
		});
		square_Three = new JButton();
		square_Three.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Controller.takeSquare(3);
				buttonUpdater(square_Three, 3);
			}
		});
		square_Four = new JButton();
		square_Four.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Controller.takeSquare(4);
				buttonUpdater(square_Four, 4);
			}
		});
		square_Five = new JButton();
		square_Five.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Controller.takeSquare(5);
				buttonUpdater(square_Five, 5);
			}
		});
		square_Six = new JButton();
		square_Six.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Controller.takeSquare(6);
				buttonUpdater(square_Six, 6);
			}
		});
		square_Seven = new JButton();
		square_Seven.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Controller.takeSquare(7);
				buttonUpdater(square_Seven, 7);
			}
		});
		square_Eight = new JButton();
		square_Eight.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Controller.takeSquare(8);
				buttonUpdater(square_Eight, 8);
			}
		});
		square_Nine = new JButton();
		square_Nine.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Controller.takeSquare(9);
				buttonUpdater(square_Nine, 9);
			}
		});

		filePathLabel = new JLabel("File path:");
		filePathTextArea = new JTextArea();
		getFilePath = new JButton("Give file path");
		getFilePath.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (clickedSave)
					try {
						sendFilePathToController(1);
					} catch (ClassNotFoundException | IOException e2) {
						showMessage("Could not save" + e2);
					}
				else
					try {
						sendFilePathToController(2);
					} catch (ClassNotFoundException | IOException e1) {
						showMessage("Could not load");
					}
				clickedSave = false;
			}
		});

		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(0, 3));
		mainPanel.add(square_One);
		mainPanel.add(square_Two);
		mainPanel.add(square_Three);
		mainPanel.add(square_Four);
		mainPanel.add(square_Five);
		mainPanel.add(square_Six);
		mainPanel.add(square_Seven);
		mainPanel.add(square_Eight);
		mainPanel.add(square_Nine);

		newGame = new JMenuItem("New Game");
		newGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Controller.runGame();
			}
		});
		saveGame = new JMenuItem("Save Game");
		saveGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clickedSave = true;
				mainPanel.add(filePathLabel);
				mainPanel.add(filePathTextArea);
				mainPanel.add(getFilePath);
			}

		});
		loadGame = new JMenuItem("Load Game");
		loadGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainPanel.add(filePathLabel);
				mainPanel.add(filePathTextArea);
				mainPanel.add(getFilePath);
			}

		});
		exitGame = new JMenuItem("Exit Game");
		exitGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		game = new JMenu("Game");
		game.add(newGame);
		game.add(saveGame);
		game.add(loadGame);
		game.add(exitGame);

		menu = new JMenuBar();
		menu.add(game);

		frame.setJMenuBar(menu);
		frame.add(mainPanel);
		frame.setVisible(true);
	}

	private static void buttonUpdater(JButton button, int buttonNumber) {
		if (gameBoard.getBoardspaces()[buttonNumber - 1].getSymbol() instanceof XPlayer) {
			button.setText("X");
		} else if (gameBoard.getBoardspaces()[buttonNumber - 1].getSymbol() instanceof OPlayer) {
			button.setText("O");
		}
	}

	public void showMessage(String string) {
		JOptionPane.showMessageDialog(frame, string);
	}

	public int checkPlayAgain() {
		return JOptionPane.showConfirmDialog(frame, "Play Again?", "Game Over", JOptionPane.YES_NO_OPTION);
	}

	public void sendFilePathToController(int save_load)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		mainPanel.remove(filePathLabel);
		mainPanel.remove(filePathTextArea);
		mainPanel.remove(getFilePath);
		if (save_load == 1) {
			Controller.saveGame(filePathTextArea.getText());
		} else if (save_load == 2) {
			Controller.loadGame(filePathTextArea.getText());
		}

	}

}
