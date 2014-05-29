package thread;

import utiles.Utiles;
import frame.VentanaPpal;

public class ThreadRepintaFrame extends Thread {
	private VentanaPpal ventanaPpal;
	private Boolean repaint = Boolean.TRUE;

	public ThreadRepintaFrame(VentanaPpal ventanaPpal) {
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

	public void setRepaint(Boolean repaint) {
		this.repaint = repaint;
		ventanaPpal.repaint();
	}
}
