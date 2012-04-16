package stickPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class StickPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7799991488480017776L;
	private Rectangle2D square;
	private Graphics2D g2d;
	private Color color;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	private int w;
	private int oX;
	private int oY;

	public StickPanel(Color color, int x, int y, int w) {
		oX = x;
		oY = y;
		this.color = color;
		this.w = w;

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g2d = (Graphics2D) g;
		square = new Rectangle2D.Double(oX * w, oY * w, w, w);
		g2d.setColor(this.color);
		g2d.fill(this.square);
	}

	@Override
	public String toString() {
		return "StickPanel [color=" + color + ", oX=" + oX + ", oY=" + oY + "]";
	}
}
