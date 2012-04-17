package observer;

import java.util.HashMap;
import java.util.List;
import nuevoPanel.FacePanel;
import pieza.Color;
import pieza.Pieza;
import pieza.Stick;
import pieza.Vectr;
import stickPanel.StickPanel;

public class AWTObserver implements IObserver {

	public AWTObserver(HashMap<Vectr, FacePanel> map) {
		super();
		this.map = map;
	}

	private HashMap<Vectr, FacePanel> map;

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
				//waiting(0.1);
				try {
					//wait(500);
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
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

	@Override
	public void observa(List<Pieza> piezas) {
		observa(piezas, this.map);

	}

	public static void waiting(double d) {

		long t0, t1;

		t0 = System.currentTimeMillis();

		do {
			t1 = System.currentTimeMillis();
		} while (t1 - t0 < d);

	}

}
