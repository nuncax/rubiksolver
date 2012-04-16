package nuevoPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

import javax.swing.JPanel;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import pieza.Vectr;
import stickPanel.StickPanel;

public class RubCruz extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5180355775069038712L;

	private Multimap<Vectr, facePanel> map = HashMultimap.create();

	private facePanel fW;
	private facePanel fB;
	private facePanel fR;
	private facePanel fO;
	private facePanel fG;
	private facePanel fY;

	private int w;
	private int oX;
	private int oY;

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

		// int k = 0;
		// for (int i = 0; i < 3; i++) {
		// for (int j = 0; j < 3; j++) {
		map.put(new Vectr(0, 0, 1), fW);
		map.put(new Vectr(1, 0, 0), fR);
		map.put(new Vectr(0, 1, 0), fB);
		map.put(new Vectr(0, 0, -1), fY);
		map.put(new Vectr(-1, 0, 0), fO);
		map.put(new Vectr(0, -1, 0), fG);
		// map.put(listPos.get(k), new StickPanel(Color.white, i + oX,
		// j+ oY, w));
		// k++;
		// m[i][j] = new StickPanel(color, i + oX, j + oY, w);
		// m[i][j].paintComponent(g);
		// }
		// }
	}

	// private Map<Vectr, StickPanel> map = new HashMap<>();

	public Multimap<Vectr, facePanel> getMap() {
		return map;
	}

	public void setMap(Multimap<Vectr, facePanel> map) {
		this.map = map;
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
