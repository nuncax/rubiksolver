package structure;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;

import javax.swing.JPanel;

import com.zetcode.BasicStrokes;

import stickPanel.StickPanel;

public class Structure extends JPanel {
	private Graphics2D g2d;
	private Color color;
	private Double line;

	public void paintComponent(Graphics g) {
		// super.paintComponent(g);
		g2d = (Graphics2D) g;

		// vertices
		int unoNueveUno = 191;
		int w = 33;
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

		//piezas(unoNueveUno, w, ddc, dnu, tdc, udc, nu, dc, tnu, co, uco, dco, tco);

		// //////////////////////////////////////
		struc(unoNueveUno, ddc, dnu, tdc, udc, nu, dc, tnu, co, uco, dco, tco);

	}

	private void piezas(int unoNueveUno, int w, int ddc, int dnu, int tdc,
			int udc, int nu, int dc, int tnu, int co, int uco, int dco, int tco) {
		StickPanel stickPanel = new StickPanel(Color.blue, unoNueveUno,
				unoNueveUno, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.yellow, unoNueveUno, ddc, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.orange, dnu, unoNueveUno, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.green, tdc, unoNueveUno, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.blue, udc, unoNueveUno, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.yellow, udc, ddc, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.red, nu, unoNueveUno, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.red, dc, unoNueveUno, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.green, tnu, unoNueveUno, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.yellow, udc, dnu, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.orange, ddc, udc, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.white, unoNueveUno, nu, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.orange, dnu, udc, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.green, tdc, udc, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.white, unoNueveUno, dc, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.red, nu, udc, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.white, udc, nu, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.blue, udc, udc, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.green, tnu, udc, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.white, udc, dc, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.blue, unoNueveUno, udc, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.yellow, unoNueveUno, dnu, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.red, dc, udc, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.orange, ddc, unoNueveUno, w);
		stickPanel.paintComponent(g2d);

		// centros

		stickPanel = new StickPanel(color.red, co, uco, w);
		stickPanel.paintComponent(g2d);
		stickPanel = new StickPanel(color.blue, uco, uco, w);
		stickPanel.paintComponent(g2d);
		stickPanel = new StickPanel(color.orange, dco, uco, w);
		stickPanel.paintComponent(g2d);
		stickPanel = new StickPanel(color.green, tco, uco, w);
		stickPanel.paintComponent(g2d);
		stickPanel = new StickPanel(color.yellow, uco, dco, w);
		stickPanel.paintComponent(g2d);
		stickPanel = new StickPanel(color.white, uco, co, w);
		stickPanel.paintComponent(g2d);

		// aristas

		// white
		stickPanel = new StickPanel(color.white, udc, co, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.white, unoNueveUno, co, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.white, uco, nu, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.white, uco, dc, w);
		stickPanel.paintComponent(g2d);

		// blue
		stickPanel = new StickPanel(color.blue, uco, udc, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.blue, uco, unoNueveUno, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.blue, udc, uco, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.blue, unoNueveUno, uco, w);
		stickPanel.paintComponent(g2d);
		// yellow
		stickPanel = new StickPanel(color.yellow, uco, ddc, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.yellow, uco, dnu, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.yellow, unoNueveUno, dco, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.yellow, udc, dco, w);
		stickPanel.paintComponent(g2d);

		// red
		stickPanel = new StickPanel(color.red, dc, uco, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.red, nu, uco, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.red, co, udc, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.red, co, unoNueveUno, w);
		stickPanel.paintComponent(g2d);

		// orange
		stickPanel = new StickPanel(color.orange, ddc, uco, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.orange, dnu, uco, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.orange, dco, udc, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.orange, dco, unoNueveUno, w);
		stickPanel.paintComponent(g2d);
		// green
		stickPanel = new StickPanel(color.green, tdc, uco, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.green, tnu, uco, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.green, tco, udc, w);
		stickPanel.paintComponent(g2d);

		stickPanel = new StickPanel(color.green, tco, unoNueveUno, w);
		stickPanel.paintComponent(g2d);
	}

	private void struc(int unoNueveUno, int ddc, int dnu, int tdc, int udc,
			int nu, int dc, int tnu, int co, int uco, int dco, int tco) {
		int cudc = 425;
		int uds = 126;
		int udcu = 124;
		int ddcu = 224;
		int dds = 226;
		int dcu = 24;
		int ds = 26;
		int tdcu = 324;
		int tds = 326;
		int cudcu = 424;
		int cuds = 426;

		//g2d.setColor(Color.black);
		line = new Line2D.Double(dc, udc, cudc, udc);
		//g2d.draw(line);
		line = new Line2D.Double(dc, uds, cudc, uds);
		//g2d.draw(line);
		line = new Line2D.Double(dc, udcu, cudc, udcu);
		//g2d.draw(line);
		line = new Line2D.Double(dc, uco, cudc, uco);
		//g2d.draw(line);
		line = new Line2D.Double(dc, unoNueveUno, cudc, unoNueveUno);
		
		
		g2d.setStroke(new BasicStroke(3));
		
		
		g2d.draw(line);
		line = new Line2D.Double(dc, ddcu, cudc, ddcu);
		//g2d.draw(line);
		line = new Line2D.Double(dc, ddc, cudc, ddc);
		//g2d.draw(line);
		line = new Line2D.Double(dc, dds, cudc, dds);
		//g2d.draw(line);
		line = new Line2D.Double(udc, dcu, ddc, dcu);
		//g2d.draw(line);
		line = new Line2D.Double(udc, dc, ddc, dc);
		//g2d.draw(line);
		line = new Line2D.Double(udc, ds, ddc, ds);
		//g2d.draw(line);
		line = new Line2D.Double(udc, co, ddc, co);
		//g2d.draw(line);
		line = new Line2D.Double(udc, nu, ddc, nu);
		//g2d.draw(line);
		line = new Line2D.Double(udc, dco, ddc, dco);
		//g2d.draw(line);
		line = new Line2D.Double(udc, dnu, ddc, dnu);
		//g2d.draw(line);
		line = new Line2D.Double(udc, tdcu, ddc, tdcu);
		//g2d.draw(line);
		line = new Line2D.Double(udc, tdc, ddc, tdc);
		//g2d.draw(line);
		line = new Line2D.Double(udc, tds, ddc, tds);
		//g2d.draw(line);
		line = new Line2D.Double(dcu, udc, dcu, ddc);
		//g2d.draw(line);
		line = new Line2D.Double(dc, udc, dc, ddc);
		//g2d.draw(line);
		line = new Line2D.Double(ds, udc, ds, ddc);
		//g2d.draw(line);
		line = new Line2D.Double(co, udc, co, ddc);
		//g2d.draw(line);
		line = new Line2D.Double(nu, udc, nu, ddc);
		//g2d.draw(line);
		line = new Line2D.Double(udcu, dc, udcu, tdc);
		//g2d.draw(line);
		line = new Line2D.Double(udc, dc, udc, tdc);
		//g2d.draw(line);
		line = new Line2D.Double(uds, dc, uds, tdc);
		//g2d.draw(line);
		line = new Line2D.Double(uco, dc, uco, tdc);
		//g2d.draw(line);
		line = new Line2D.Double(unoNueveUno, dc, unoNueveUno, tdc);
		//g2d.draw(line);
		line = new Line2D.Double(ddcu, dc, ddcu, tdc);
		//g2d.draw(line);
		line = new Line2D.Double(ddc, dc, ddc, tdc);
		//g2d.draw(line);
		line = new Line2D.Double(dds, dc, dds, tdc);
		//g2d.draw(line);
		line = new Line2D.Double(dco, udc, dco, ddc);
		//g2d.draw(line);
		line = new Line2D.Double(dnu, udc, dnu, ddc);
		//g2d.draw(line);
		line = new Line2D.Double(tdcu, udc, tdcu, ddc);
		//g2d.draw(line);
		line = new Line2D.Double(tdc, udc, tdc, ddc);
		//g2d.draw(line);
		line = new Line2D.Double(tds, udc, tds, ddc);
		//g2d.draw(line);
		line = new Line2D.Double(tco, udc, tco, ddc);
		//g2d.draw(line);
		line = new Line2D.Double(tnu, udc, tnu, ddc);
		//g2d.draw(line);
		line = new Line2D.Double(cudcu, udc, cudcu, ddc);
		//g2d.draw(line);
		line = new Line2D.Double(cudc, udc, cudc, ddc);
		//g2d.draw(line);
		line = new Line2D.Double(cuds, udc, cuds, ddc);
		//g2d.draw(line);
	}
}
