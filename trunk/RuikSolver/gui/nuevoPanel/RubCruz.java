package nuevoPanel;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class RubCruz extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5180355775069038712L;
	private facePanel fW;
	private facePanel fB;
	private facePanel fR;
	private facePanel fO;
	private facePanel fG;
	private facePanel fY;

	private int w;
	private int oX;
	private int oY;

	public facePanel getfW() {
		return fW;
	}

	public facePanel getfB() {
		return fB;
	}

	public facePanel getfR() {
		return fR;
	}

	public facePanel getfO() {
		return fO;
	}

	public facePanel getfG() {
		return fG;
	}

	public facePanel getfY() {
		return fY;
	}

	public RubCruz(int x, int y, int w) {
		oX = x;
		oY = y;
		this.w = w;

		fW = new facePanel(Color.white, 3 + oX, 0 + oY, this.w);
		fB = new facePanel(Color.blue, 3 + oX, 3 + oY, this.w);
		fR = new facePanel(Color.red, 0 + oX, 3 + oY, this.w);
		fO = new facePanel(Color.orange, 6 + oX, 3 + oY, this.w);
		fG = new facePanel(Color.green, 9 + oX, 3 + oY, this.w);
		fY = new facePanel(Color.yellow, 3 + oX, 6 + oY, this.w);
	}

	public void paintComponent(Graphics g) {
		fW.paintComponent(g);
		fB.paintComponent(g);
		fR.paintComponent(g);
		fO.paintComponent(g);
		fG.paintComponent(g);
		fY.paintComponent(g);
	}
}
