package thread;

import java.util.HashMap;

import panel.FacePanel;
import pieza.Vectr;
import utiles.Utiles;
import frame.VentanaPpal;

public class MiThread extends Thread {
	//private VentanaPpal ventanaPpal = new VentanaPpal();
	private VentanaPpal ventanaPpal;
	private Boolean repaint = Boolean.TRUE;

	public MiThread(VentanaPpal ventanaPpal) {
		super();
		this.ventanaPpal = ventanaPpal;
	}

	public void run() {

		int cont = 0;
		do {
			ventanaPpal.repaint();
			cont++;

			Utiles.slep(1);

		} while (repaint);

		System.out.println(cont);

	}

	public HashMap<Vectr, FacePanel> getmap() {
		return ventanaPpal.getRubCruz().getMap();
	}

	public void setRepaint(Boolean repaint) {
		this.repaint = repaint;
		ventanaPpal.repaint();
	}
}
