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

	/**
	 * 
	 */
	private static final long serialVersionUID = -9145680029000312265L;

	private Graphics2D g2d;

	private Color color;

	private int lineaGruesa = 3;
	private int lineaFina = 1;

	private int w;
	private int oX;
	private int oY;

	private StickPanel m[][];

	private Double line;

	public facePanel(Color color, int x, int y, int w) {
		this.m = new StickPanel[3][3];
		this.color = color;
		oX = x;
		oY = y;
		this.w = w;
	}

	public void paintComponent(Graphics g) {

		g2d = (Graphics2D) g;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				m[i][j] = new StickPanel(color, i + oX, j + oY, w);
				m[i][j].paintComponent(g);
			}
		}

		for (int i = 0; i <= 3; i++) {
			lineaFinaH(oX, i + oY);
		}

		for (int i = 0; i <= 3; i++) {
			lineaFinaV(i + oX, oY);
		}

	}

	public StickPanel getStickPanel(int x, int y) {
		return m[x][y];
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
