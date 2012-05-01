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