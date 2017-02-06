package yeah.boi;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Graphics {

	public static void addMenu(JFrame frame, Drawing drawingPane1) {
		JMenuItem startsAnimation = new JMenuItem("Start");
		startsAnimation.addActionListener(drawingPane1);
		JMenuItem stopAnimation = new JMenuItem("Stop");
		stopAnimation.addActionListener(drawingPane1);
		JMenu menu = new JMenu("Animation");
		JMenuBar menubar = new JMenuBar();
		menu.add(stopAnimation);
		menu.add(startsAnimation);
		menubar.add(menu);
		frame.setJMenuBar(menubar);
	}

	public static void main(String[] args0) throws InterruptedException {
		JFrame frame = new JFrame("Graphics");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		Drawing drawingPane1 = new Drawing();
		frame.getContentPane().add(drawingPane1);
		addMenu(frame, drawingPane1);
		frame.setVisible(true);
		Thread.sleep(2000);
		drawingPane1.startAnimation();
	}

}
