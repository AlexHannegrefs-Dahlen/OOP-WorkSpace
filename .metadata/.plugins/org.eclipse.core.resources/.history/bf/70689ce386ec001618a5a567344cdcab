package yeah.boi;

import javax.swing.JFrame;

public class Graphics {

	public static void main(String[] args0) throws InterruptedException {
		JFrame frame = new JFrame("Graphics");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		Drawing drawingPane1 = new Drawing();
		frame.getContentPane().add(drawingPane1);
		frame.setVisible(true);
		Thread.sleep(1000);
		drawingPane1.startAnimation();
	}
}
