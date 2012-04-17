package thread;

import java.util.HashMap;

import nuevoPanel.FacePanel;
import pieza.Vectr;
import frame.VentanaPpal;

public class MiThread extends Thread {
	VentanaPpal ventanaPpal = new VentanaPpal();
	
	public void run() {
		while(true){
			ventanaPpal.repaint();						
		}
	
	}
	public HashMap<Vectr, FacePanel> getmap() {
		// TODO Auto-generated method stub
		return ventanaPpal.getComp().getMap();
	}
	
}
