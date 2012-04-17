package thread;

import java.util.HashMap;

import nuevoPanel.FacePanel;
import pieza.Vectr;
import frame.VentanaPpal;

public class MiThread extends Thread {
	private VentanaPpal ventanaPpal = new VentanaPpal();
	private Boolean repaint = Boolean.TRUE;
	
	public void run() {
		while(repaint){
			ventanaPpal.repaint();
		}
	
	}
	public HashMap<Vectr, FacePanel> getmap() {
		// TODO Auto-generated method stub
		return ventanaPpal.getComp().getMap();
	}
	public void setRepaint(Boolean repaint) {
		this.repaint = repaint;
	}	
}
