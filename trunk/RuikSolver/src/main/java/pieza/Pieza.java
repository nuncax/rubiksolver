package pieza;

import java.util.Set;

import arista.Color;

public class Pieza {
	private Vectr posicion;
	private Vectr orientacion;	
	private Set<Color> color;
	
	public Pieza(Vectr posicion, Vectr orientacion, Set<Color> colors) {
		this.posicion = posicion;
		this.orientacion = orientacion;
		this.color = color;
	}

	
	
}
