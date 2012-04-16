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
			}
		}
	}

	private java.awt.Color calcColor(Color colorP) {
		java.awt.Color colorRes = null;
		if (colorP.equals(Color.BLUE)) {
			colorRes = java.awt.Color.BLUE;
		} else if (colorP.equals(Color.GREEN)) {
			colorRes = java.awt.Color.GREEN;
		} else if (colorP.equals(Color.ORANGE)) {
			colorRes = java.awt.Color.ORANGE;
		} else if (colorP.equals(Color.RED)) {
			colorRes = java.awt.Color.RED;
		} else if (colorP.equals(Color.WHITE)) {
			colorRes = java.awt.Color.WHITE;
		} else if (colorP.equals(Color.YELLOW)) {
			colorRes = java.awt.Color.YELLOW;
		}
		return colorRes;

	}

	@Override
	public void observa(List<Pieza> piezas) {
		observa(piezas, this.map);

	}

}
