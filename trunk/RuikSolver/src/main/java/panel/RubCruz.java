package panel;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JComponent;
import pieza.Vectr;

public class RubCruz extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5180355775069038712L;

	private HashMap<Vectr, FacePanel> map = new HashMap<Vectr, FacePanel>();
	private HashMap<Vectr, FacePanel> mapRes = new HashMap<Vectr, FacePanel>();

	private List<FacePanel> facePanels;

	private int w;
	private int oX;
	private int oY;

	private ArrayList<FacePanel> facePanelsRes;

	public FacePanel getFacePanels(Color color) {
		FacePanel facePanels = null;
		for (FacePanel panel : this.facePanels) {
			if (panel.getColor().equals(color)) {
				facePanels = panel;
			}
		}
		return facePanels;
	}
	public FacePanel getFacePanelsRes(Color color) {
		FacePanel facePanels = null;
		for (FacePanel panel : this.facePanelsRes) {
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
		setResuelto();
		setResueltoRes();
	}

	public void setResuelto() {
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
	public void setResueltoRes() {
		facePanelsRes = new ArrayList<FacePanel>();

		facePanelsRes.add(new FacePanel(Color.white, 3 + oX, 0 + oY, this.w));
		facePanelsRes.add(new FacePanel(Color.blue, 3 + oX, 3 + oY, this.w));
		facePanelsRes.add(new FacePanel(Color.red, 0 + oX, 3 + oY, this.w));
		facePanelsRes.add(new FacePanel(Color.orange, 6 + oX, 3 + oY, this.w));
		facePanelsRes.add(new FacePanel(Color.green, 9 + oX, 3 + oY, this.w));
		facePanelsRes.add(new FacePanel(Color.yellow, 3 + oX, 6 + oY, this.w));

		mapRes.put(new Vectr(0, 0, 1), getFacePanelsRes(Color.white));
		mapRes.put(new Vectr(1, 0, 0), getFacePanelsRes(Color.red));
		mapRes.put(new Vectr(0, 1, 0), getFacePanelsRes(Color.blue));
		mapRes.put(new Vectr(0, 0, -1), getFacePanelsRes(Color.yellow));
		mapRes.put(new Vectr(-1, 0, 0), getFacePanelsRes(Color.orange));
		mapRes.put(new Vectr(0, -1, 0), getFacePanelsRes(Color.green));
	}

	public boolean isResuelto() {
		boolean res = true;
		for (Vectr v : getMap().keySet()) {
			FacePanel facePanel = map.get(v);
			FacePanel facePanelRes = mapRes.get(v);
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (!(i == 1 && j == 1)) {
						StickPanel panel = facePanel.getStickPanel(i, j);
						StickPanel panelRes = facePanelRes.getStickPanel(i, j);
						if (!panel.getColor().equals(panelRes.getColor())) {
							res = false;
							j = 3;
							i = 3;
						}
					}
				}
			}
			break;
		}

		return res;
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
