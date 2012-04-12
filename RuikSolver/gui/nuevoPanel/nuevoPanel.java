package nuevoPanel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;
import javax.swing.JPanel;

import stickPanel.StickPanel;

public class nuevoPanel extends JPanel {
	//
	int lineaGruesa = 3;
	int lineaFina = 1;
	int w = 33;
	int h = 33;

	//
	private Graphics2D g2d;
	private Color color;
	private Double line;

	public void paintComponent(Graphics g) {
		int ox = 1;
		int oy = 1;

		int w = 33;

		// vertices
		int unoNueveUno = 191;
		// int h=33;
		int ddc = 225;
		int dnu = 291;
		int tdc = 325;
		int udc = 125;
		int nu = 91;
		int dc = 25;
		int tnu = 391;

		int co = 58;
		int uco = 158;
		int dco = 258;
		int tco = 358;

		g2d = (Graphics2D) g;

		StickPanel stickPanel;

		pintaRectangulo(0, 0, color.white);
		pintaRectangulo(0, 1, color.white);

		// pintaRectangulo(ox, oy*w+2, w, color.white);

		//stickPanel = new StickPanel(color.white, ox * w, oy, w);
		// stickPanel.paintComponent(g2d);
		//
		// stickPanel = new StickPanel(color.white, udc, nu, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.white, udc, dc, w);
		// stickPanel.paintComponent(g2d);
		//
		// stickPanel = new StickPanel(color.white, uco, co, w);
		// stickPanel.paintComponent(g2d);
		//
		// stickPanel = new StickPanel(color.white, udc, co, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.white, unoNueveUno, co, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.white, uco, nu, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.white, uco, dc, w);
		// stickPanel.paintComponent(g2d);
		//
		//
		//

		// StickPanel stickPanel = new StickPanel(color.white, unoNueveUno, nu,
		// w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.white, unoNueveUno, dc, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.white, udc, nu, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.white, udc, dc, w, w);
		// stickPanel.paintComponent(g2d);
		//
		// stickPanel = new StickPanel(Color.blue, unoNueveUno, unoNueveUno, w,
		// w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.blue, udc, unoNueveUno, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.blue, udc, udc, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.blue, unoNueveUno, udc, w, w);
		// stickPanel.paintComponent(g2d);
		//
		// stickPanel = new StickPanel(color.yellow, unoNueveUno, ddc, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.yellow, udc, ddc, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.yellow, udc, dnu, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.yellow, unoNueveUno, dnu, w, w);
		// stickPanel.paintComponent(g2d);
		//
		// stickPanel = new StickPanel(color.green, tdc, unoNueveUno, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.green, tnu, unoNueveUno, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.green, tdc, udc, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.green, tnu, udc, w, w);
		// stickPanel.paintComponent(g2d);
		//
		// stickPanel = new StickPanel(color.red, nu, unoNueveUno, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.red, dc, unoNueveUno, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.red, nu, udc, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.red, dc, udc, w, w);
		// stickPanel.paintComponent(g2d);
		//
		// stickPanel = new StickPanel(color.orange, ddc, udc, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.orange, dnu, udc, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.orange, dnu, unoNueveUno, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.orange, ddc, unoNueveUno, w, w);
		// stickPanel.paintComponent(g2d);

		// centros

		// stickPanel = new StickPanel(color.red, co, uco, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.blue, uco, uco, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.orange, dco, uco, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.green, tco, uco, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.yellow, uco, dco, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.white, uco, co, w, w);
		// stickPanel.paintComponent(g2d);

		// aristas

		// white
		// stickPanel = new StickPanel(color.white, udc, co, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.white, unoNueveUno, co, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.white, uco, nu, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.white, uco, dc, w, w);
		// stickPanel.paintComponent(g2d);
		//
		// // blue
		// stickPanel = new StickPanel(color.blue, uco, udc, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.blue, uco, unoNueveUno, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.blue, udc, uco, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.blue, unoNueveUno, uco, w, w);
		// stickPanel.paintComponent(g2d);
		//
		// // yellow
		// stickPanel = new StickPanel(color.yellow, uco, ddc, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.yellow, uco, dnu, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.yellow, unoNueveUno, dco, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.yellow, udc, dco, w, w);
		// stickPanel.paintComponent(g2d);
		//
		// // red
		// stickPanel = new StickPanel(color.red, dc, uco, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.red, nu, uco, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.red, co, udc, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.red, co, unoNueveUno, w, w);
		// stickPanel.paintComponent(g2d);
		//
		// // orange
		// stickPanel = new StickPanel(color.orange, ddc, uco, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.orange, dnu, uco, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.orange, dco, udc, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.orange, dco, unoNueveUno, w, w);
		// stickPanel.paintComponent(g2d);
		// // green
		// stickPanel = new StickPanel(color.green, tdc, uco, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.green, tnu, uco, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.green, tco, udc, w, w);
		// stickPanel.paintComponent(g2d);
		// stickPanel = new StickPanel(color.green, tco, unoNueveUno, w, w);
		// stickPanel.paintComponent(g2d);
	}

	private void pintaRectangulo(int ox, int oy, Color color) {
		//int margenLineaFina = w+lineaFina;
		StickPanel stickPanel = new StickPanel(color, (ox*w) , (oy*w), w);
		stickPanel.paintComponent(g2d);
	}

	private void lineaFinaV(int x, int yO, int yF) {
		line = new Line2D.Double(x, yO, x, yF);
		g2d.setStroke(new BasicStroke(lineaFina));
		g2d.draw(line);
	}

	private void lineaGruesaV(int x, int yO, int yF) {
		line = new Line2D.Double(x, yO, x, yF);
		g2d.setStroke(new BasicStroke(lineaGruesa));
		g2d.draw(line);

	}

	private void lineaGruesaH(int xO, int xF, int y) {
		line = new Line2D.Double(xO, y, xF, y);
		g2d.setStroke(new BasicStroke(lineaGruesa));
		g2d.draw(line);
	}

	private void lineaFinaH(int xO, int xF, int y) {
		line = new Line2D.Double(xO, y, xF, y);
		g2d.setStroke(new BasicStroke(lineaFina));
		g2d.draw(line);
	}
}
