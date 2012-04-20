package thread;

import java.util.HashMap;

import nuevoPanel.FacePanel;
import pieza.Vectr;
import utiles.Utiles;
import frame.VentanaPpal;

public class MiThread extends Thread {
	private VentanaPpal ventanaPpal = new VentanaPpal();
	private Boolean repaint = Boolean.TRUE;

	public void run() {

		int cont = 0;
		do {
			ventanaPpal.repaint();
			cont++;

			Utiles.slep(0);

		} while (repaint);
		
		System.out.println(cont);

	}

	public HashMap<Vectr, FacePanel> getmap() {
		return ventanaPpal.getComp().getMap();
	}

	public void setRepaint(Boolean repaint) {
		this.repaint = repaint;
		ventanaPpal.repaint();
	}
}
