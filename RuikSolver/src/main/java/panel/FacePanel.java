package panel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JPanel;
import pieza.Vectr;
import utiles.Utiles;

public class FacePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9145680029000312265L;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	private Graphics2D g2d;

	private Color color;

	private int lineaGruesa = 3;
	private int lineaFina = 1;

	private int w;
	private int oX;
	private int oY;

	private StickPanel m[][];

	private Double line;

	private List<Vectr> listPos = new ArrayList<Vectr>();

	private HashMap<Vectr, StickPanel> map = new HashMap<Vectr, StickPanel>();

	// Map<Vectr, StickPanel> map = new HashMap<Vectr, StickPanel>();

	public FacePanel(Color color, int x, int y, int w) {
		this.m = new StickPanel[3][3];
		this.color = color;
		this.oX = x;
		this.oY = y;
		this.w = w;

		// White
		listPos.add(new Vectr(1, -1, 1));
		listPos.add(new Vectr(0, -1, 1));
		listPos.add(new Vectr(-1, -1, 1));
		listPos.add(new Vectr(1, 0, 1));
		listPos.add(new Vectr(0, 0, 1));
		listPos.add(new Vectr(-1, 0, 1));
		listPos.add(new Vectr(1, 1, 1));
		listPos.add(new Vectr(0, 1, 1));
		listPos.add(new Vectr(-1, 1, 1));
		// Red
		listPos.add(new Vectr(1, -1, 1));
		listPos.add(new Vectr(1, 0, 1));
		listPos.add(new Vectr(1, 1, 1));
		listPos.add(new Vectr(1, -1, 0));
		listPos.add(new Vectr(1, 0, 0));
		listPos.add(new Vectr(1, 1, 0));
		listPos.add(new Vectr(1, -1, -1));
		listPos.add(new Vectr(1, 0, -1));
		listPos.add(new Vectr(1, 1, -1));
		// Blue
		listPos.add(new Vectr(1, 1, 1));
		listPos.add(new Vectr(0, 1, 1));
		listPos.add(new Vectr(-1, 1, 1));
		listPos.add(new Vectr(1, 1, 0));
		listPos.add(new Vectr(0, 1, 0));
		listPos.add(new Vectr(-1, 1, 0));
		listPos.add(new Vectr(1, 1, -1));
		listPos.add(new Vectr(0, 1, -1));
		listPos.add(new Vectr(-1, 1, -1));
		// Yellow
		listPos.add(new Vectr(1, 1, -1));
		listPos.add(new Vectr(0, 1, -1));
		listPos.add(new Vectr(-1, 1, -1));
		listPos.add(new Vectr(1, 0, -1));
		listPos.add(new Vectr(0, 0, -1));
		listPos.add(new Vectr(-1, 0, -1));
		listPos.add(new Vectr(1, -1, -1));
		listPos.add(new Vectr(0, -1, -1));
		listPos.add(new Vectr(-1, -1, -1));
		// Orange
		listPos.add(new Vectr(-1, 1, 1));
		listPos.add(new Vectr(-1, 0, 1));
		listPos.add(new Vectr(-1, -1, 1));
		listPos.add(new Vectr(-1, 1, 0));
		listPos.add(new Vectr(-1, 0, 0));
		listPos.add(new Vectr(-1, -1, 0));
		listPos.add(new Vectr(-1, 1, -1));
		listPos.add(new Vectr(-1, 0, -1));
		listPos.add(new Vectr(-1, -1, -1));
		// Green
		listPos.add(new Vectr(-1, -1, 1));
		listPos.add(new Vectr(0, -1, 1));
		listPos.add(new Vectr(1, -1, 1));
		listPos.add(new Vectr(-1, -1, 0));
		listPos.add(new Vectr(0, -1, 0));
		listPos.add(new Vectr(1, -1, 0));
		listPos.add(new Vectr(-1, -1, -1));
		listPos.add(new Vectr(0, -1, -1));
		listPos.add(new Vectr(1, -1, -1));

		int k = 0;
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				m[i][j] = new StickPanel(color, i + oX, j + oY, w);
				map.put(getSubListPos(this.color).get(k), m[i][j]);
			//	map.put(getSubListPos(this.color).get(k), new StickPanel(color, i + oX, j + oY, w));
				k++;
				
			}
		}

		// for (int i = 0; i < 3; i++) {
		// for (int j = 0; j < 3; j++) {
		// m[i][j] = new StickPanel(color, i + oX, j + oY, w);
		// }
		// }
	}

	public HashMap<Vectr, StickPanel> getMap() {
		return map;
	}

	public void setMap(HashMap<Vectr, StickPanel> map) {
		this.map = map;
	}
	private List<Vectr> getSubListPos(Color color) {
		List<Vectr> listRes = null;
		if (color.equals(Utiles.white)) {
			listRes = listPos.subList(0, 9);
		} else if (color.equals(Utiles.red)) {
			listRes = listPos.subList(9, 18);
		} else if (color.equals(Utiles.blue)) {
			listRes = listPos.subList(18, 27);
		} else if (color.equals(Utiles.yellow)) {
			listRes = listPos.subList(27, 36);
		} else if (color.equals(Utiles.orange)) {
			listRes = listPos.subList(36, 45);
		} else if (color.equals(Utiles.green)) {
			listRes = listPos.subList(45, 54);
		}
		return listRes;
	}

	public void paintComponent(Graphics g) {

		g2d = (Graphics2D) g;

		for (Vectr v : map.keySet()) {
			map.get(v).paintComponent(g2d);
		}

		// for (int i = 0; i < 3; i++) {
		// for (int j = 0; j < 3; j++) {
		// m[i][j].paintComponent(g);
		// }
		// }

		for (int i = 0; i <= 3; i++) {
			lineaFinaH(oX, i + oY);
		}

		for (int i = 0; i <= 3; i++) {
			lineaFinaV(i + oX, oY);
		}

		lineaGruesaH(oX, oY);
		lineaGruesaH(oX, oY + 3);

		lineaGruesaV(oX, oY);
		lineaGruesaV(3 + oX, oY);

	}

	public StickPanel getStickPanel(int x, int y) {
		return m[x][y];

	}

	private void lineaFinaH(int x, int y) {
		line = new Line2D.Double(w * x, w * y, (w * (3 + x)) - 1, (w) * y);
		g2d.setStroke(new BasicStroke(lineaFina));
		g2d.setColor(Color.black);
		g2d.draw(line);
	}

	private void lineaFinaV(int x, int y) {
		line = new Line2D.Double(w * x, w * y, w * x, (w * (3 + y)) - 1);
		g2d.setStroke(new BasicStroke(lineaFina));
		g2d.setColor(Color.black);
		g2d.draw(line);
	}

	private void lineaGruesaV(int x, int y) {
		line = new Line2D.Double(w * x, w * y, w * x, (w * (3 + y)) - 1);
		g2d.setStroke(new BasicStroke(lineaGruesa));
		g2d.setColor(Color.black);
		g2d.draw(line);

	}

	private void lineaGruesaH(int x, int y) {
		line = new Line2D.Double(w * x, w * y, (w * (3 + x)) - 1, (w) * y);
		g2d.setStroke(new BasicStroke(lineaGruesa));
		g2d.setColor(Color.black);
		g2d.draw(line);
	}

}
