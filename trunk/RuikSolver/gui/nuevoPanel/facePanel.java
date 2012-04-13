package nuevoPanel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;
import javax.swing.JPanel;

import stickPanel.StickPanel;

public class facePanel extends JPanel {
	
	
	
	
	int lineaGruesa = 3;
	int lineaFina = 1;

	int w = 33;
	int h = 33;

	int oX = 1;
	int oY = 1;

	
	private Graphics2D g2d;
	private Color color;
	private Double line;

	public void paintComponent(Graphics g) {

		g2d = (Graphics2D) g;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				pintaRectangulo(oX + i, oY + j, color.white);
			}
		}

		for (int i = 0; i <= 3; i++) {
			lineaFinaH(oX, i+oY);
		}

		for (int i = 0; i <= 3; i++) {
			lineaFinaV(i+oX, oY);
		}

	}

	private void pintaRectangulo(int x, int y, Color color) {
		StickPanel stickPanel = new StickPanel(color, (x * w), (y * w), w);
		stickPanel.paintComponent(g2d);
	}

	private void lineaFinaH(int x, int y) {
		line = new Line2D.Double(w * x, w * y, (w * (3 + x)) - 1, (w) * y);
		g2d.setStroke(new BasicStroke(lineaFina));
		g2d.setColor(color.black);
		g2d.draw(line);
	}

	private void lineaFinaV(int x, int y) {
		line = new Line2D.Double(w * x, w * y, w * x, (w * (3 + y)) - 1);
		g2d.setStroke(new BasicStroke(lineaFina));
		g2d.setColor(color.black);
		g2d.draw(line);
	}

	private void lineaGruesaV(int x, int y) {
		line = new Line2D.Double(w * x, w * y, w * x, (w * (3 + y)) - 1);
		g2d.setStroke(new BasicStroke(lineaGruesa));
		g2d.setColor(color.black);
		g2d.draw(line);

	}

	private void lineaGruesaH(int x, int y) {
		line = new Line2D.Double(w * x, w * y, (w * (3 + x)) - 1, (w) * y);
		g2d.setStroke(new BasicStroke(lineaGruesa));
		g2d.setColor(color.black);
		g2d.draw(line);
	}

}
