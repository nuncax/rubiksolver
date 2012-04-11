import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Figuras extends JFrame {
	// establecer cadena de barra de título y dimensiones de la ventana
	public Figuras() {
		super("Dibujo de figuras en 2D");

		setSize(425, 160);
		setVisible(true);
	}

	// dibujar figuras con la API Java2D
	public void paint(Graphics g) {
		super.paint(g); // llamar al método paint de la superclase

		Graphics2D g2d = (Graphics2D) g; // convertir g a Graphics2D

		

		// dibujar rectángulo 2D redondeado con fondo tamponado
		BufferedImage buffImage = new BufferedImage(10, 10,
				BufferedImage.TYPE_INT_RGB);
		// pintar buffImage en el objeto JFrame
		g2d.setPaint(new TexturePaint(buffImage, new Rectangle(10, 10)));
		g2d.fill(new RoundRectangle2D.Double(155, 30, 75, 100, 50, 50));

		// dibujar arco 2D en forma de pastel, en color blanco
		g2d.setPaint(Color.WHITE);
		g2d.setStroke(new BasicStroke(6.0f));
		g2d.draw(new Arc2D.Double(240, 30, 75, 100, 0, 270, Arc2D.PIE));

		// dibujar líneas 2D en verde y amarillo
		g2d.setPaint(Color.GREEN);
		g2d.draw(new Line2D.Double(395, 30, 320, 150));

//		float guiones[] = { 10 };
//
//		g2d.setPaint(Color.YELLOW);
//		g2d.setStroke(new BasicStroke(4, BasicStroke.CAP_ROUND,
//				BasicStroke.JOIN_ROUND, 10, guiones, 0));
//		g2d.draw(new Line2D.Double(320, 30, 395, 150));

	} // fin del método paint

	// ejecutar la aplicación
	public static void main(String args[]) {
		Figuras aplicacion = new Figuras();
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

} // fin de la clase Figuras