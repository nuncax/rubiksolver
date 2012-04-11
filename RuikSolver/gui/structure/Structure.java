package structure;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;

import javax.swing.JPanel;

import stickPanel.StickPanel;

public class Structure extends JPanel {
	private Graphics2D g2d;
	private Color color;
	private Double line;

	public void paintComponent(Graphics g) {
		// super.paintComponent(g);
		g2d = (Graphics2D) g;
		g2d.setColor(Color.black);
		line = new Line2D.Double(25, 125, 425, 125);
		g2d.draw(line);
		line = new Line2D.Double(25, 126, 425, 126);
		g2d.draw(line);
		line = new Line2D.Double(25, 124, 425, 124);
		g2d.draw(line);
		line = new Line2D.Double(25, 158, 425, 158);
		g2d.draw(line);
		line = new Line2D.Double(25, 191, 425, 191);
		g2d.draw(line);
		line = new Line2D.Double(25, 224, 425, 224);
		g2d.draw(line);
		line = new Line2D.Double(25, 225, 425, 225);
		g2d.draw(line);
		line = new Line2D.Double(25, 226, 425, 226);
		g2d.draw(line);
		line = new Line2D.Double(125, 24, 225, 24);
		g2d.draw(line);
		line = new Line2D.Double(125, 25, 225, 25);
		g2d.draw(line);
		line = new Line2D.Double(125, 26, 225, 26);
		g2d.draw(line);
		line = new Line2D.Double(125, 58, 225, 58);
		g2d.draw(line);
		line = new Line2D.Double(125, 91, 225, 91);
		g2d.draw(line);
		line = new Line2D.Double(125, 258, 225, 258);
		g2d.draw(line);
		line = new Line2D.Double(125, 291, 225, 291);
		g2d.draw(line);
		line = new Line2D.Double(125, 324, 225, 324);
		g2d.draw(line);
		line = new Line2D.Double(125, 325, 225, 325);
		g2d.draw(line);
		line = new Line2D.Double(125, 326, 225, 326);
		g2d.draw(line);
		line = new Line2D.Double(24, 125, 24, 225);
		g2d.draw(line);
		line = new Line2D.Double(25, 125, 25, 225);
		g2d.draw(line);
		line = new Line2D.Double(26, 125, 26, 225);
		g2d.draw(line);
		line = new Line2D.Double(58, 125, 58, 225);
		g2d.draw(line);
		line = new Line2D.Double(91, 125, 91, 225);
		g2d.draw(line);
		line = new Line2D.Double(124, 25, 124, 325);
		g2d.draw(line);
		line = new Line2D.Double(125, 25, 125, 325);
		g2d.draw(line);
		line = new Line2D.Double(126, 25, 126, 325);
		g2d.draw(line);
		line = new Line2D.Double(158, 25, 158, 325);
		g2d.draw(line);
		line = new Line2D.Double(191, 25, 191, 325);
		g2d.draw(line);
		line = new Line2D.Double(224, 25, 224, 325);
		g2d.draw(line);
		line = new Line2D.Double(225, 25, 225, 325);
		g2d.draw(line);
		line = new Line2D.Double(226, 25, 226, 325);
		g2d.draw(line);
		line = new Line2D.Double(258, 125, 258, 225);
		g2d.draw(line);
		line = new Line2D.Double(291, 125, 291, 225);
		g2d.draw(line);
		line = new Line2D.Double(324, 125, 324, 225);
		g2d.draw(line);
		line = new Line2D.Double(325, 125, 325, 225);
		g2d.draw(line);
		line = new Line2D.Double(326, 125, 326, 225);
		g2d.draw(line);
		line = new Line2D.Double(358, 125, 358, 225);
		g2d.draw(line);
		line = new Line2D.Double(391, 125, 391, 225);
		g2d.draw(line);
		line = new Line2D.Double(424, 125, 424, 225);
		g2d.draw(line);
		line = new Line2D.Double(425, 125, 425, 225);
		g2d.draw(line);
		line = new Line2D.Double(426, 125, 426, 225);
		g2d.draw(line);

		StickPanel stickPanel = new StickPanel(Color.blue, 191,191, 33, 33);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.orange, 225,191, 33, 33);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.yellow, 191, 225,33, 33);
		stickPanel.paintComponent(g2d);
		
	stickPanel = new StickPanel(color.black, 225, 191,33, 33);
		stickPanel.paintComponent(g2d);
		
		//stickPanel = new StickPanel(color.red, 25, 191, 33, 33);
		//stickPanel.paintComponent(g2d);
		
//		stickPanel = new StickPanel(color.red, 25, 191, 33, 33);
//		stickPanel.paintComponent(g2d);
//		
//		stickPanel = new StickPanel(color.red, 25, 191, 33, 33);
//		stickPanel.paintComponent(g2d);
//		
//		stickPanel = new StickPanel(color.red, 25, 191, 33, 33);
//		stickPanel.paintComponent(g2d);
//		
//		stickPanel = new StickPanel(color.red, 25, 191, 33, 33);
//		stickPanel.paintComponent(g2d);
//		
//		stickPanel = new StickPanel(color.red, 25, 191, 33, 33);
//		stickPanel.paintComponent(g2d);
//		
//		stickPanel = new StickPanel(color.red, 25, 191, 33, 33);
//		stickPanel.paintComponent(g2d);
//		
//		stickPanel = new StickPanel(color.red, 25, 191, 33, 33);
//		stickPanel.paintComponent(g2d);

		// g2d.fill(stickPanel.getColorsquare());
		// g2d.setColor(stickPanel.getColor());

	}
}