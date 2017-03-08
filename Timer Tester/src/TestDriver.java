import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class TestDriver implements ActionListener {
	private Timer milli = new Timer(0, this), second = new Timer(1000, this);
	
	private double milliSeconds = 0;
	
	private JFrame frame;
	public static void main(String[] args) {
		TestDriver driver = new TestDriver();
		driver.frame = new JFrame();
		driver.frame.setVisible(true);
		driver.milli.start();
		driver.second.start();

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == milli)
			milliSeconds += .01;
		if(arg0.getSource() == second)
			stopTimers();
	}
	private void stopTimers() {
		System.out.println(milliSeconds);
	}

}
