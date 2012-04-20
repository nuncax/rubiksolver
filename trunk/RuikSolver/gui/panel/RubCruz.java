package panel;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JPanel;
import pieza.Vectr;

public class RubCruz extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5180355775069038712L;

	static HashMap<Vectr, FacePanel> map = new HashMap();

	private List<FacePanel> facePanels;

	private int w;
	private int oX;
	private int oY;

	public FacePanel getFacePanels(Color color) {
		FacePanel facePanels = null;
		for (FacePanel panel : this.facePanels) {
			if (panel.getColor().equals(color)) {
				facePanels = panel;
			}
		}
		return facePanels;
	}

	public void setFacePanels(List<FacePanel> facePanels) {
		this.facePanels = facePanels;
	}

	public RubCruz(int x, int y, int w) {

		oX = x;
		oY = y;
		this.w = w;

		facePanels = new ArrayList<FacePanel>();

		facePanels.add(new FacePanel(Color.white, 3 + oX, 0 + oY, this.w));
		facePanels.add(new FacePanel(Color.blue, 3 + oX, 3 + oY, this.w));
		facePanels.add(new FacePanel(Color.red, 0 + oX, 3 + oY, this.w));
		facePanels.add(new FacePanel(Color.orange, 6 + oX, 3 + oY, this.w));
		facePanels.add(new FacePanel(Color.green, 9 + oX, 3 + oY, this.w));
		facePanels.add(new FacePanel(Color.yellow, 3 + oX, 6 + oY, this.w));

		map.put(new Vectr(0, 0, 1), getFacePanels(Color.white));
		map.put(new Vectr(1, 0, 0), getFacePanels(Color.red));
		map.put(new Vectr(0, 1, 0), getFacePanels(Color.blue));
		map.put(new Vectr(0, 0, -1), getFacePanels(Color.yellow));
		map.put(new Vectr(-1, 0, 0), getFacePanels(Color.orange));
		map.put(new Vectr(0, -1, 0), getFacePanels(Color.green));
	}

	public HashMap<Vectr, FacePanel> getMap() {
		return map;
	}

	public void setMap(HashMap<Vectr, FacePanel> map) {
		this.map = map;
	}

	public void paintComponent(Graphics g) {

		for (FacePanel face : this.facePanels) {
			face.paintComponent(g);
		}
	}
}
