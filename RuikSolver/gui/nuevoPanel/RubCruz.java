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

	private List<Vectr> listPos = new ArrayList<Vectr>();

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

		oX = x;
		oY = y;
		this.w = w;

		fW = new facePanel(Color.white, 3 + oX, 0 + oY, this.w);
		fB = new facePanel(Color.blue, 3 + oX, 3 + oY, this.w);
		fR = new facePanel(Color.red, 0 + oX, 3 + oY, this.w);
		fO = new facePanel(Color.orange, 6 + oX, 3 + oY, this.w);
		fG = new facePanel(Color.green, 9 + oX, 3 + oY, this.w);
		fY = new facePanel(Color.yellow, 3 + oX, 6 + oY, this.w);

		int k = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				map.put(listPos.subList(0, 9).get(k), fW.getStickPanel(i, j));
				map.put(listPos.subList(9, 18).get(k), fR.getStickPanel(i, j));
				map.put(listPos.subList(18, 27).get(k), fB.getStickPanel(i, j));
				map.put(listPos.subList(27, 36).get(k), fY.getStickPanel(i, j));
				map.put(listPos.subList(36, 45).get(k), fO.getStickPanel(i, j));
				map.put(listPos.subList(45, 54).get(k), fG.getStickPanel(i, j));
			//	map.put(listPos.get(k), new StickPanel(Color.white, i + oX, j+ oY, w));
				k++;
//				m[i][j] = new StickPanel(color, i + oX, j + oY, w);
//				m[i][j].paintComponent(g);
			}
		}

	}
	
	public void actualizaCruz( Multimap<Vectr, StickPanel> m){
		for (Vectr v : m.keySet()) {
			for (StickPanel stickPanel: m.get(v)) {
				stickPanel.paintComponent(g);
			}
		}
	}

//	private Map<Vectr, StickPanel> map = new HashMap<>();
	
	private Multimap<Vectr, StickPanel> map = HashMultimap.create();

	public void paintComponent(Graphics g) {

		fW.paintComponent(g);
		fB.paintComponent(g);
		fR.paintComponent(g);
		fO.paintComponent(g);
		fG.paintComponent(g);
		fY.paintComponent(g);
	}
}
