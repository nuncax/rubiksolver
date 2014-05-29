package observer;

import java.util.HashMap;
import java.util.List;

import frame.VentanaPpal;

import panel.FacePanel;
import panel.StickPanel;
import pieza.Color;
import pieza.Pieza;
import pieza.Stick;
import pieza.Vectr;
import utiles.Utiles;

public class AWTObserver implements IObserver {
	private HashMap<Vectr, FacePanel> map;
	private int sleep;
	private boolean parado;

	/**
	 * @return the sleep
	 */
	public int getSleep() {
		return sleep;
	}

	public AWTObserver(HashMap<Vectr, FacePanel> map, int sleep) {
		super();
		this.map = map;
		this.sleep = sleep;
		this.parado = false;
	}

	/**
	 * @return the parado
	 */
	public boolean isParado() {
		return parado;
	}

	/**
	 * @param parado
	 *            the parado to set
	 */
	public void setParado(boolean parado) {
		this.parado = parado;
	}

	@Override
	public void observa(List<Pieza> piezas, HashMap<Vectr, FacePanel> map) {
		for (Pieza pieza : piezas) {
			Vectr posicion = pieza.getPosicion();
			Stick stickers[] = pieza.getStickers();
			for (int i = 0; i < stickers.length; i++) {
				Vectr orientacion = stickers[i].getOrientacion();
				FacePanel facePanel = map.get(orientacion);
				StickPanel stickpanel = facePanel.getMap().get(posicion);
				stickpanel.setColor(calcColor(stickers[i].getColor()));
			}
		}
		// Utiles.slep(sleep);
		if (VentanaPpal.iniciado == true) {
			parar();
		} else {
			Utiles.slep(sleep);
		}
	}

	public synchronized void parar() {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized void reanudar() {
		notifyAll();
	}

	private java.awt.Color calcColor(Color colorP) {
		java.awt.Color colorRes = null;
		if (colorP.toString().equals("azul")) {
			colorRes = Utiles.blue;
		} else if (colorP.toString().equals("verde")) {
			colorRes = Utiles.green;
		} else if (colorP.toString().equals("naranja")) {
			colorRes = Utiles.orange;
		} else if (colorP.toString().equals("rojo")) {
			colorRes = Utiles.red;
		} else if (colorP.toString().equals("blanco")) {
			colorRes = Utiles.white;
		} else if (colorP.toString().equals("amarillo")) {
			colorRes = Utiles.yellow;
		}
		return colorRes;

	}

	/**
	 * @param sleep
	 *            the sleep to set
	 */
	public void setSleep(int sleep) {
		this.sleep = sleep;
	}

	@Override
	public void observa(List<Pieza> piezas) {
		observa(piezas, this.map);

	}
}
