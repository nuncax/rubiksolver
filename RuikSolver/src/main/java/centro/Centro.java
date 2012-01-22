package centro;

import java.util.Set;

import pieza.Pieza;
import pieza.Vector;

import arista.Color;

public class Centro implements Pieza {
	private Vector posicion;
	private Vector orientacion;

	private Set<Color> color;

	public Centro(Vector posicion, Vector orientacion, Set<Color> color) {
		super();
		this.posicion = posicion;
		this.orientacion = orientacion;
		this.color = color;
	}

	public Vector getPosicion() {
		return posicion;
	}

	public void setPosicion(Vector posicion) {
		this.posicion = posicion;
	}

	public Vector getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(Vector orientacion) {
		this.orientacion = orientacion;
	}

	public Set<Color> getColor() {
		return color;
	}

	public void setColor(Set<Color> color) {
		this.color = color;
	}


	// Color color;
}
