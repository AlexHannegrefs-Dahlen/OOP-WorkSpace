package yeah.boi;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BallFactory {
	private static Random gen = new Random();

	public static List<BallsToTheWall> newBalls(int howMany, int minWidth, int maxWidth, int minHeight, int maxHieght,
			int minPosX, int maxPosX, int minPosY, int maxPosY, int minXV, int maxXV, int minYV, int maxYV) {
		List<BallsToTheWall> balls = new ArrayList<>();
		for (int i = 0; i < howMany; i++) {
			balls.add(newBall(minWidth, maxWidth, minHeight, maxHieght, minPosX, maxPosX, minPosY, maxPosY, minXV,
					maxXV, minYV, maxYV));
		}
		return balls;
	}

	public static BallsToTheWall newBall(int minWidth, int maxWidth, int minHeight, int maxHieght, int minPosX,
			int maxPosX, int minPosY, int maxPosY, int minXV, int maxXV, int minYV, int maxYV) {
		BallsToTheWall ball = new BallsToTheWall();
		ball.setWidth(gen.nextInt(maxWidth - minWidth) + minWidth);
		ball.setHeight(gen.nextInt(maxHieght - minHeight) + minHeight);
		ball.setX(gen.nextInt(maxPosX - minPosX) + minPosX);
		ball.setY(gen.nextInt(maxPosY - minPosY) + minPosY);
		ball.setxVel(gen.nextInt(maxXV - minXV) + minXV);
		ball.setyVel(gen.nextInt(maxYV - minYV) + minYV);
		ball.setColor(new Color(gen.nextInt(255), gen.nextInt(255), gen.nextInt(255)));
		return ball;
	}
}
