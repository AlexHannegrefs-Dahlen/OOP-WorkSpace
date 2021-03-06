package yeah.boi;

import java.awt.Color;

public class BallsToTheWall {
	private int x, y, width, height, xVel, yVel;
	
	private Color color;

	public BallsToTheWall() {

	}

	public BallsToTheWall(int x, int y, int width, int height, int xVel, int yVel, Color color) {
		this.setX(x);
		this.setY(y);
		this.setWidth(width);
		this.setHeight(height);
		this.setxVel(xVel);
		this.setyVel(yVel);
		this.setColor(color);
	}

	public void detectCollision(int rObjectX, int rObjectY, int lObjectX, int lObjectY) {
		if (this.x >= (rObjectX - width) || this.x < lObjectX) {
			this.xVel *= -1;
		}
		if (this.y >= (rObjectY - height) || this.y < lObjectY) {
			this.yVel *= -1;
		}
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width
	 *            the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the xVel
	 */
	public int getxVel() {
		return xVel;
	}

	/**
	 * @param xVel
	 *            the xVel to set
	 */
	public void setxVel(int xVel) {
		this.xVel = xVel;
	}

	/**
	 * @return the yVel
	 */
	public int getyVel() {
		return yVel;
	}

	/**
	 * @param yVel
	 *            the yVel to set
	 */
	public void setyVel(int yVel) {
		this.yVel = yVel;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

}
