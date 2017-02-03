package yeah.boi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Drawing extends JPanel implements ActionListener {

	private Timer timer = new Timer((int) (1000 / 30), this);

	private List<BallsToTheWall> balls = null;

	public Drawing() {
		this.setBackground(Color.MAGENTA);
	}

	public void startAnimation() {
		balls = BallFactory.newBalls(10, 10, 200, 10, 200, 0, this.getWidth(), 0, this.getHeight(), 10, 60, 10, 60);
		timer.start();
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
		for(BallsToTheWall ball: balls){
			ball.setX(ball.getX() + ball.getxVel());
			ball.setY(ball.getY() + ball.getyVel());
			ball.detectCollision(this.getWidth(), this.getHeight(), 0, 0);
		}
		this.repaint();
	}
}
