package pieza;
import java.util.Set;

import arista.Color;

public interface Pieza {
	public Vector getPosicion();

	public void setPosicion(Vector posicion);

	public Vector getOrientacion();

	public void setOrientacion(Vector orientacion);

	public Set<Color> getColor();

	public void setColor(Set<Color> color);
}
