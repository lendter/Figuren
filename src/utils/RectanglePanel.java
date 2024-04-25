package utils;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class RectanglePanel extends JPanel {
	private Rectangle rectangle;
	
	public RectanglePanel(int x, int y, int width, int height) {
		rectangle = new Rectangle(x, y, width, height);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.RED);
		g2d.fill(rectangle);
	}
}
