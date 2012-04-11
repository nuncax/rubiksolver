package stickPanel;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class StickPanel extends JPanel{
	private Rectangle2D colorsquare;
	private Graphics2D g2d;
	private Color color;

	public StickPanel(Color color, double x, double y, double w, double h) {
		this.color = color;
		colorsquare = new Rectangle2D.Double(x, y, w, h);
	}
	
	public void paintComponent(Graphics g) {
		 super.paintComponent(g);
		g2d = (Graphics2D) g;
		g2d.setColor(this.getColor());
		g2d.fill(this.getColorsquare());
		
	}

	public Rectangle2D getColorsquare() {
		return colorsquare;
	}

	public void setColorsquare(Rectangle2D colorsquare) {
		this.colorsquare = colorsquare;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	// public void paintComponent(Graphics g) {
	// super.paintComponent(g);
	// g2d = (Graphics2D) g;
	// g2d.setColor(color.RED);
	// g2d.fill(new Rectangle2D.Double(10, 10, 33, 33));
	// // this.setBackground(new Color(175, 200, 255));
	// }

	// public static void main(String[] args) {
	// JFrame frame = new JFrame("Colors");
	// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// frame.add(new Stick(Color.blue, 0, 0, 33, 33));
	// frame.add(new Stick(Color.black, 50, 50, 33, 33));
	// frame.setSize(360, 300);
	// frame.setLocationRelativeTo(null);
	// frame.setVisible(true);
	// }

}
