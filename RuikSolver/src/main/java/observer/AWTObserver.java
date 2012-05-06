package observer;

import java.util.HashMap;
import java.util.List;

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

	public AWTObserver(HashMap<Vectr, FacePanel> map) {
		super();
		this.map = map;
		this.sleep = 200;
		this.parado = false;
	}

	/**
	 * @return the parado
	 */
	public boolean isParado() {
		return parado;
	}

	/**
	 * @param parado the parado to set
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
		if (parado == true) {
			parar();
		} else {
			reanudar();
			///Utiles.slep(sleep);
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
			colorRes = java.awt.Color.BLUE;
		} else if (colorP.toString().equals("verde")) {
			colorRes = java.awt.Color.GREEN;
		} else if (colorP.toString().equals("naranja")) {
			colorRes = java.awt.Color.ORANGE;
		} else if (colorP.toString().equals("rojo")) {
			colorRes = java.awt.Color.RED;
		} else if (colorP.toString().equals("blanco")) {
			colorRes = java.awt.Color.WHITE;
		} else if (colorP.toString().equals("amarillo")) {
			colorRes = java.awt.Color.YELLOW;
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
