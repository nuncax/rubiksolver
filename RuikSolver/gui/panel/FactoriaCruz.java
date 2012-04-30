package panel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D.Double;

public class FactoriaCruz {
	private Rectangle2D square;
	private Graphics2D g2d;

	public Rectangle2D createStick(Color color, int x, int y, int w) {
		int oX = x;
		int oY = y;
		int oW = w;
		return square = new Rectangle2D.Double(oX * w, oY * w, w, w);
	}

	private int lineaGruesa = 3;
	private int lineaFina = 1;
	private Double line;
	private Rectangle2D m[][];

	/**
	 * @return the m
	 */
	public Rectangle2D[][] getM() {
		return m;
	}

	public Rectangle2D[][] createFace(Color color, int x, int y, int w) {
		this.m = new Rectangle2D[3][3];
		int oX = x;
		int oY = y;
		int oW = w;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = createStick(color, i + oX, j + oY, w);
			}
		}

		return m;
		
		// m[0][0] = createStick(color, 1, 1, w);
		// m[0][1] = createStick(color, 1, 2, w);
		// m[0][2] = createStick(color, 1, 3, w);
		// m[1][0] = createStick(color, 2, 1, w);
		// m[1][1] = createStick(color, 2, 2, w);
		// m[1][2] = createStick(color, 2, 3, w);
		// m[2][0] = createStick(color, 3, 1, w);
		// m[2][1] = createStick(color, 3, 2, w);
		// m[2][2] = createStick(color, 3, 3, w);

		// for (int i = 0; i <= 3; i++) {
		// lineaFinaH(oX, i + oY);
		// }

		// for (int i = 0; i <= 3; i++) {
		// lineaFinaV(i + oX, oY);
		// }

		// lineaGruesaH(oX, oY);
		// lineaGruesaH(oX, oY + 3);

		// lineaGruesaV(oX, oY);
		// lineaGruesaV(3 + oX, oY);
	}

//	private void lineaFinaH(int x, int y) {
//		line = new Line2D.Double(w * x, w * y, (w * (3 + x)) - 1, (w) * y);
//		g2d.setStroke(new BasicStroke(lineaFina));
//		g2d.setColor(color.black);
//		g2d.draw(line);
//	}
//
//	private void lineaFinaV(int x, int y) {
//		line = new Line2D.Double(w * x, w * y, w * x, (w * (3 + y)) - 1);
//		g2d.setStroke(new BasicStroke(lineaFina));
//		g2d.setColor(color.black);
//		g2d.draw(line);
//	}
//
//	private void lineaGruesaV(int x, int y) {
//		line = new Line2D.Double(w * x, w * y, w * x, (w * (3 + y)) - 1);
//		g2d.setStroke(new BasicStroke(lineaGruesa));
//		g2d.setColor(color.black);
//		g2d.draw(line);
//
//	}
//
//	private void lineaGruesaH(int x, int y) {
//		line = new Line2D.Double(w * x, w * y, (w * (3 + x)) - 1, (w) * y);
//		g2d.setStroke(new BasicStroke(lineaGruesa));
//		g2d.setColor(color.black);
//		g2d.draw(line);
//	}

}
