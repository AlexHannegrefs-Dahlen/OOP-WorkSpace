package yeah.boi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.List;

import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Drawing extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Timer timer = new Timer((int) (1000 / 30), this);

	private List<BallsToTheWall> balls = null;

	public Drawing() {
		this.setBackground(Color.ORANGE);
	}

	public void startAnimation() {
		balls = BallFactory.newBalls(100, 20, 30, 20, 30, 0, this.getWidth() - 200, 0, this.getHeight() - 200, 50, 80,
				50, 80);
		// timer.start();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if (balls != null) {
			for (BallsToTheWall ball : balls) {
				g.setColor(ball.getColor());
				g.fillOval(ball.getX(), ball.getY(), ball.getWidth(), ball.getHeight());
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == this.timer) {
			for (BallsToTheWall ball : balls) {
				ball.setX(ball.getX() + ball.getxVel());
				ball.setY(ball.getY() + ball.getyVel());
				ball.detectCollision(this.getWidth(), this.getHeight(), 0, 0);
			}
			this.repaint();
		} else if (arg0.getSource() instanceof JMenuItem) {
			JMenuItem sourceMenuItem = (JMenuItem) arg0.getSource();
			if (sourceMenuItem.getText().equals("Start")) {
				timer.start();
			} else
				timer.stop();
		}
	}
}
