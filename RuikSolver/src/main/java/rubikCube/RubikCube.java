package rubikCube;

import java.util.HashSet;
import java.util.Set;

import pieza.Vector;
import vertice.Vertice;

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
	private Arista aristaVerdeNaranja;
	private Arista aristaNaranjaAmarillo;
	private Arista aristaVerdeAmarillo;
	private Arista aristaVerdeRojo;
	private Arista aristaRojoAmarillo;
	private Arista aristaAzulAmarillo;
	
	private Vertice verticeAzulRojoBlanco;
	private Vertice verticeAzulNaranjaBlanco;
	private Vertice verticeVerdeNaranjaBlanco;
	private Vertice verticeVerdeRojoBlanco;
	private Vertice verticeAzulNaranjaAmarillo;
	private Vertice verticeAzulRojoAmarillo;
	private Vertice verticeVerdeRojoAmarillo;
	private Vertice verticeVerdeNaranjaAmarillo;
	

	public RubikCube() {
		createCentros();
		createAristas();
		createCorners();

	}

	private void createCorners() {
		Color blanco = new Color("blanco");
		Color verde = new Color("verde");
		Color azul = new Color("azul");
		Color rojo = new Color("rojo");
		Color amarillo = new Color("amarillo");
		Color naranja = new Color("naranja");

		Vector orientacion = new Vector();
		Vector posicion = new Vector();
		Set<Color> colors = new HashSet<Color>();

		// AzRB
		colors.add(azul);
		colors.add(rojo);
		colors.add(blanco);
		posicion = new Vector(1, 1, 1);
		orientacion = new Vector(0, 0, 1);
		verticeAzulRojoBlanco = new Vertice(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// AzNB
		colors.add(azul);
		colors.add(naranja);
		colors.add(blanco);
		posicion = new Vector(-1, 1, 1);
		orientacion = new Vector(0, 0, 1);
		verticeAzulNaranjaBlanco = new Vertice(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// VNB
		colors.add(verde);
		colors.add(naranja);
		colors.add(blanco);
		posicion = new Vector(-1, -1, 1);
		orientacion = new Vector(0, 0, 1);
		verticeVerdeNaranjaBlanco = new Vertice(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// VRB
		colors.add(verde);
		colors.add(rojo);
		colors.add(blanco);
		posicion = new Vector(1, -1, 1);
		orientacion = new Vector(0, 0, 1);
		verticeVerdeRojoBlanco = new Vertice(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// AzNA
		colors.add(azul);
		colors.add(naranja);
		colors.add(amarillo);
		posicion = new Vector(-1, 1, -1);
		orientacion = new Vector(0, 0, -1);
		verticeAzulNaranjaAmarillo = new Vertice(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// AzRA
		colors.add(azul);
		colors.add(rojo);
		colors.add(amarillo);
		posicion = new Vector(1, 1, -1);
		orientacion = new Vector(0, 0, -1);
		verticeAzulRojoAmarillo = new Vertice(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// VRA
		colors.add(verde);
		colors.add(rojo);
		colors.add(amarillo);
		posicion = new Vector(1, -1, -1);
		orientacion = new Vector(0, 0, -1);
		verticeVerdeRojoAmarillo = new Vertice(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// VNA
		colors.add(verde);
		colors.add(naranja);
		colors.add(amarillo);
		posicion = new Vector(-1, -1, -1);
		orientacion = new Vector(0, 0, -1);
		verticeVerdeNaranjaAmarillo = new Vertice(posicion, orientacion, colors);
		colors = new HashSet<Color>();

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
		// RB
		colors.add(rojo);
		colors.add(blanco);
		posicion = new Vector(1, 0, 1);
		orientacion = new Vector(0, 0, 1);
		aristaRojoBlanca = new Arista(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// AB
		colors.add(azul);
		colors.add(blanco);
		posicion = new Vector(0, 1, 1);
		orientacion = new Vector(0, 0, 1);
		aristaAzulBlanca = new Arista(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// NB
		colors.add(naranja);
		colors.add(blanco);
		posicion = new Vector(-1, 0, 1);
		orientacion = new Vector(0, 0, 1);
		aristaNaranjaBlanca = new Arista(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// VB
		colors.add(verde);
		colors.add(blanco);
		posicion = new Vector(0, -1, 1);
		orientacion = new Vector(0, 0, 1);
		aristaVerdeBlanca = new Arista(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// AzR
		colors.add(azul);
		colors.add(rojo);
		posicion = new Vector(1, 1, 0);
		orientacion = new Vector(1, 0, 0);
		aristaAzulRojo = new Arista(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// AzN
		colors.add(azul);
		colors.add(naranja);
		posicion = new Vector(-1, 1, 0);
		orientacion = new Vector(-1, 0, 0);
		aristaAzulNaranja = new Arista(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// VN
		colors.add(verde);
		colors.add(naranja);
		posicion = new Vector(-1, -1, 0);
		orientacion = new Vector(-1, 0, 0);
		aristaVerdeNaranja = new Arista(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// VR
		colors.add(verde);
		colors.add(rojo);
		posicion = new Vector(1, -1, 0);
		orientacion = new Vector(1, 0, 0);
		aristaVerdeRojo = new Arista(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// RA
		colors.add(rojo);
		colors.add(amarillo);
		posicion = new Vector(1, 0, -1);
		orientacion = new Vector(0, 0, 1);
		aristaRojoAmarillo = new Arista(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// AzA
		colors.add(azul);
		colors.add(amarillo);
		posicion = new Vector(0, 1, -1);
		orientacion = new Vector(0, 0, -1);
		aristaAzulAmarillo = new Arista(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// NA
		colors.add(naranja);
		colors.add(amarillo);
		posicion = new Vector(-1, 0, -1);
		orientacion = new Vector(0, 0, -1);
		aristaNaranjaAmarillo = new Arista(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// VA
		colors.add(verde);
		colors.add(amarillo);
		posicion = new Vector(0, -1, -1);
		orientacion = new Vector(0, 0, -1);
		aristaVerdeAmarillo = new Arista(posicion, orientacion, colors);
		colors = new HashSet<Color>();

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
		posicion = new Vector(0, 0, 1);
		orientacion = new Vector(0, 0, 1);
		this.blanco = new Centro(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// amarillo
		colors.add(amarillo);
		posicion = new Vector(0, 0, -1);
		orientacion = new Vector(0, 0, -1);
		this.amarillo = new Centro(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// verde
		colors.add(verde);
		posicion = new Vector(0, -1, 0);
		orientacion = new Vector(0, -1, 0);
		this.verde = new Centro(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// rojo
		colors.add(rojo);
		posicion = new Vector(1, 0, 0);
		orientacion = new Vector(1, 0, 0);
		this.rojo = new Centro(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// azul
		colors.add(azul);
		posicion = new Vector(0, 1, 0);
		orientacion = new Vector(0, 1, 0);
		this.azul = new Centro(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// naranja
		colors.add(naranja);
		posicion = new Vector(-1, 0, 0);
		orientacion = new Vector(-1, 0, 0);
		this.naranja = new Centro(posicion, orientacion, colors);
		colors = new HashSet<Color>();
	}
	
	public void R (){
		
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
