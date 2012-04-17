package thread;

import java.util.ArrayList;

import panelOld.Drawingpanel;

public class OldThread extends Thread {
	//VentanaPpalOld ventanaPpalOld = new VentanaPpalOld();

	Drawingpanel drawingpanel;
	ArrayList<String[]> array;

	public OldThread(ArrayList<String[]> c, Drawingpanel drawingpanel) {
		super();
		this.array = c;
		this.drawingpanel = drawingpanel;
	}

	public void run() {
		while (true) {
			drawingpanel.showcube(array);
		}
	}
}
