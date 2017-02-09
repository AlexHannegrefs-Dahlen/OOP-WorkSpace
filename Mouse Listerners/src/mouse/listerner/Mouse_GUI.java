package mouse.listerner;

import java.awt.Color;

import javax.swing.JFrame;

public class Mouse_GUI {
	private JFrame frame;
	private MyPanel mainPanel;

	public Mouse_GUI() {
		frame = new JFrame("Mouse GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		mainPanel = new MyPanel();
		mainPanel.setBackground(Color.WHITE);
		frame.add(mainPanel);
		frame.setVisible(true);
	}
}
