package nuevoPanel;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class RubCruz extends JPanel {

	facePanel fw = new facePanel(Color.white, 3, 0);
	facePanel fb = new facePanel(Color.blue, 3, 3);
	facePanel fr = new facePanel(Color.red, 0, 3);
	facePanel fo = new facePanel(Color.orange, 6, 3);
	facePanel fg = new facePanel(Color.green, 9, 3);
	facePanel fy = new facePanel(Color.yellow, 3, 6);

	public void paintComponent(Graphics g) {
		fw.paintComponent(g);
		fb.paintComponent(g);
		fr.paintComponent(g);
		fo.paintComponent(g);
		fg.paintComponent(g);
		fy.paintComponent(g);
	}
}
