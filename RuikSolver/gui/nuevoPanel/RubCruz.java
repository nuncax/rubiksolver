package nuevoPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

import javax.swing.JPanel;

import pieza.Vectr;
import stickPanel.StickPanel;

public class RubCruz extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5180355775069038712L;

	private List<Vectr> listPos = new ArrayList<>();

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
		
		//White
		listPos.add(new Vectr());
		listPos.add(new Vectr(0,-1,1));
		listPos.add(new Vectr());
		listPos.add(new Vectr(1,0,1));
		listPos.add(new Vectr());
		listPos.add(new Vectr(-1,0,1));
		listPos.add(new Vectr());
		listPos.add(new Vectr(0,1,1));
		listPos.add(new Vectr());
		//Red
		listPos.add(new Vectr(1, -1, 1));
		listPos.add(new Vectr(1,0,1));
		listPos.add(new Vectr(1,-1,1));
		listPos.add(new Vectr(1,0,-1));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(1,1,0));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(,,));
		//Blue
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(0,1,1));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(1,1,0));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(-1,1,0));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(,,));
		//Yellow
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(,,));
		//Orange
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(-1,0,1));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(-1,1,0));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(-1,-1,0));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(,,));
		//Green
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(0,-1,1));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(-1,-1,0));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(1,-1,0));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(,,));
		listPos.add(new Vectr(,,));
		
		//rw
		//listPos.add(new Vectr(1,0,1));
		//bw
//		listPos.add(new Vectr(0,1,1));
		//ow
//		listPos.add(new Vectr(-1,0,1));
		//gw
	//	listPos.add(new Vectr(0,-1,1));
		//br
		//listPos.add(new Vectr(1,1,0));
		//bo
//		listPos.add(new Vectr(-1,1,0));
		//go
	//	listPos.add(new Vectr(-1,-1,0));
		//gr
		//listPos.add(new Vectr(1,-1,0));
		//ry
		listPos.add(new Vectr(1,0,-1));
		//by
		listPos.add(new Vectr(0,1,-1));
		//oy
		listPos.add(new Vectr(-1,0,-1));
		//gy
		listPos.add(new Vectr(0,-1,-1));
		//brw
		listPos.add(new Vectr(1,1,1));
		//bow
		listPos.add(new Vectr(-1,1,1));
		//gow
		listPos.add(new Vectr(-1,-1,1));
		//grw
		listPos.add(new Vectr(1,-1,1));
		//boy
		listPos.add(new Vectr(-1,1,-1));
		//bry
		listPos.add(new Vectr(1,1,-1));
		//gry
		listPos.add(new Vectr(1,-1,-1));
		//goy
		listPos.add(new Vectr(-1,-1,-1));
		
		
		//r
		listPos.add(new Vectr(1,0,0));
		//o
		listPos.add(new Vectr(-1,0,0));
		//b
		listPos.add(new Vectr(0,1,0));
		//g
		listPos.add(new Vectr(0,-1,0));
		//y
		listPos.add(new Vectr(0,0,-1));
		//w		
		listPos.add(new Vectr(0,0,1));
		
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

	private Map<Vectr, StickPanel> map = new HashMap<>();

	public void paintComponent(Graphics g) {

		// int k = 0;
		// for (int i = 0; i < 3; i++) {
		// for (int j = 0; j < 3; j++) {
		// //map.put(listPos.get(k), new StickPanel(Color.white, i + oX, j+ oY,
		// w));
		// k++;
		// m[i][j] = new StickPanel(color, i + oX, j + oY, w);
		// m[i][j].paintComponent(g);
		// }
		// }

		fW.paintComponent(g);
		fB.paintComponent(g);
		fR.paintComponent(g);
		fO.paintComponent(g);
		fG.paintComponent(g);
		fY.paintComponent(g);
	}
}
