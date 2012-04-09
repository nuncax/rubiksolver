package stickPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Stick extends JComponent{
	public Rectangle2D colorsquare;
	public Graphics2D g2d;
	public Color color;

	public Stick(Color color, double x, double y, double w, double h) {
		super();
		this.color = color;
		colorsquare = new Rectangle2D.Double(x, y, w, h);
		
	}

//	public void paintComponent(Graphics g) {
//		super.paintComponent(g);
//		g2d = (Graphics2D) g;
//		g2d.setColor(color.RED);
//		g2d.fill(new Rectangle2D.Double(10, 10, 33, 33));
//		// this.setBackground(new Color(175, 200, 255));
//	}

//	public static void main(String[] args) {
//		JFrame frame = new JFrame("Colors");
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.add(new Stick(Color.blue, 0, 0, 33, 33));
//		frame.add(new Stick(Color.black, 50, 50, 33, 33));
//		frame.setSize(360, 300);
//		frame.setLocationRelativeTo(null);
//		frame.setVisible(true);
//	}

}
