package pruebas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;

import panel.FactoriaCruz;

public class AbsoluteLayoutDemo extends JFrame {
	FactoriaCruz factoriaCruz = new FactoriaCruz();

	public AbsoluteLayoutDemo(String title) throws HeadlessException {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(200, 200));
		pack();
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		Color color = Color.blue;

		Rectangle2D m[][] = factoriaCruz.createFace(color, 1, 1, 33);
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				Rectangle2D rectangle2d = m[i][j];
				g2d.setColor(Color.red);
				g2d.fill(rectangle2d);
			}
		}

	}

	private static void createAndShowGUI() {
		new AbsoluteLayoutDemo("zsdf");

	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}