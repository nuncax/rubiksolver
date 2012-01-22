package rubikCube;

import java.util.HashSet;
import java.util.Set;

import pieza.Vector;

import arista.Arista;
import arista.Color;

import centro.Centro;

public class RubikCube {
	private Centro blanco;
	private Centro amarillo;
	private Centro verde;
	private Centro naranja;
	private Centro rojo;
	private Centro azul;

	private Arista aristaRojoBlanca;
	private Arista aristaAzulBlanca;
	private Arista aristaNaranjaBlanca;
	private Arista aristaVerdeBlanca;
	private Arista aristaAzulRojo;
	private Arista aristaAzulNaranja;

	public RubikCube() {
		createCentros();
		createAristas();
	}

	private void createAristas() {
		Color blanco = new Color("blanco");
		Color verde = new Color("verde");
		Color azul = new Color("azul");
		Color rojo = new Color("rojo");
		Color amarillo = new Color("amarillo");
		Color naranja = new Color("naranja");

		Vector orientacion = new Vector();
		Vector posicion = new Vector();
		Set<Color> colors = new HashSet<Color>();

		colors.add(rojo);
		colors.add(blanco);
		posicion.setCords(1, 0, 1);
		orientacion.setCords(0, 0, 1);
		aristaRojoBlanca = new Arista(posicion, orientacion, colors);
		colors.clear();
		
		colors.add(azul);
		colors.add(blanco);
		posicion.setCords(0, 1, 1);
		orientacion.setCords(0, 0, 1);
		aristaAzulBlanca = new Arista(posicion, orientacion, colors);
		colors.clear();
		
		colors.add(naranja);
		colors.add(blanco);
		posicion.setCords(1, 0,1);
		orientacion.setCords(0, 0,1);
		aristaNaranjaBlanca = new Arista(posicion, orientacion, colors);
		colors.clear();
		
		colors.add(verde);
		colors.add(blanco);
		posicion.setCords(0, 1,1);
		orientacion.setCords(0, 0,1);
		aristaVerdeBlanca = new Arista(posicion, orientacion, colors);
		colors.clear();
		
		colors.add(azul);
		colors.add(rojo);
		posicion.setCords(1,1,0);
		orientacion.setCords(1, 0, 0);
		aristaAzulRojo = new Arista(posicion, orientacion, colors);
		colors.clear();
		
		colors.add(azul);
		colors.add(naranja);
		posicion.setCords(-1,1,0);
		orientacion.setCords(-1,0,0);
		aristaAzulNaranja = new Arista(posicion, orientacion, colors);
		colors.clear();
		
		

	}

	private void createCentros() {

		Color blanco = new Color("blanco");
		Color verde = new Color("verde");
		Color azul = new Color("azul");
		Color rojo = new Color("rojo");
		Color amarillo = new Color("amarillo");
		Color naranja = new Color("naranja");

		Vector orientacion = new Vector();
		Vector posicion = new Vector();
		Set<Color> colors = new HashSet<Color>();

		// blanco
		colors.add(blanco);
		posicion.setCords(0, 0, 1);
		orientacion.setCords(0, 0, 1);
		this.blanco = new Centro(posicion, orientacion, colors);
		colors.clear();
		// amarillo
		colors.add(amarillo);
		posicion.setCords(0, 0, -1);
		orientacion.setCords(0, 0, -1);
		this.amarillo = new Centro(posicion, orientacion, colors);
		colors.clear();
		// verde
		colors.add(verde);
		posicion.setCords(0, -1, 0);
		orientacion.setCords(0, -1, 0);
		this.verde = new Centro(posicion, orientacion, colors);
		colors.clear();
		// rojo
		colors.add(rojo);
		posicion.setCords(0, -1, 0);
		orientacion.setCords(0, -1, 0);
		this.rojo = new Centro(posicion, orientacion, colors);
		colors.clear();
		// azul
		colors.add(azul);
		posicion.setCords(0, -1, 0);
		orientacion.setCords(0, -1, 0);
		this.azul = new Centro(posicion, orientacion, colors);
		colors.clear();
		// naranja
		colors.add(naranja);
		posicion.setCords(0, -1, 0);
		orientacion.setCords(0, -1, 0);
		this.naranja = new Centro(posicion, orientacion, colors);
		colors.clear();
	}

	public Centro getBlanco() {
		return blanco;
	}

	public void setBlanco(Centro blanco) {
		this.blanco = blanco;
	}

	public Centro getAmarillo() {
		return amarillo;
	}

	public void setAmarillo(Centro amarillo) {
		this.amarillo = amarillo;
	}

	public Centro getVerde() {
		return verde;
	}

	public void setVerde(Centro verde) {
		this.verde = verde;
	}

	public Centro getNaranja() {
		return naranja;
	}

	public void setNaranja(Centro naranja) {
		this.naranja = naranja;
	}

	public Centro getRojo() {
		return rojo;
	}

	public void setRojo(Centro rojo) {
		this.rojo = rojo;
	}

	public Centro getAzul() {
		return azul;
	}

	public void setAzul(Centro azul) {
		this.azul = azul;
	}

}
