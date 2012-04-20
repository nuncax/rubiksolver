package observer;

import java.util.HashMap;
import java.util.List;

import panel.FacePanel;
import pieza.Pieza;
import pieza.Vectr;

public interface IObserver {
	
	public void observa(List<Pieza> piezas);

	void observa(List<Pieza> piezas, HashMap<Vectr, FacePanel> map);
}
