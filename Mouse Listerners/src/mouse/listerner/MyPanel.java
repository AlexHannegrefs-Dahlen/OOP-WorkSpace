package mouse.listerner;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel implements MouseListener, MouseMotionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int x = 50, y = 50, width = 60, height = 60;

	private boolean inDraggingModeOrSomethingLikeThat = false;

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLACK);
		g.fillOval(x, y, width, height);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		/*
		 * x = e.getX() - width/2; y = e.getY() - height/2; repaint();
		 */
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getX() >= x && e.getX() <= x + width && e.getY() >= y && e.getY() <= y + height){
			inDraggingModeOrSomethingLikeThat = true;
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		inDraggingModeOrSomethingLikeThat = false;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if (inDraggingModeOrSomethingLikeThat) {
			x = e.getX();
			y = e.getY();
			repaint();
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		/*
		 * x = e.getX() - width/2; y = e.getY() - height/2; repaint();
		 */
	}
}
