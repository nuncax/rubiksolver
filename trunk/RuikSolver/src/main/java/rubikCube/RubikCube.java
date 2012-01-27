package rubikCube;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import pieza.Pieza;
import pieza.Vectr;
import arista.Color;

public class RubikCube {

	private Pieza centroBlanco;
	private Pieza centroAmarillo;
	private Pieza centroVerde;
	private Pieza centroNaranja;
	private Pieza centroRojo;
	private Pieza centroAzul;

	private Pieza aristaRojoBlanca;
	private Pieza aristaAzulBlanca;
	private Pieza aristaNaranjaBlanca;
	private Pieza aristaVerdeBlanca;
	private Pieza aristaAzulRojo;
	private Pieza aristaAzulNaranja;
	private Pieza aristaVerdeNaranja;
	private Pieza aristaNaranjaAmarillo;
	private Pieza aristaVerdeAmarillo;
	private Pieza aristaVerdeRojo;
	private Pieza aristaRojoAmarillo;
	private Pieza aristaAzulAmarillo;

	private Pieza verticeAzulRojoBlanco;
	private Pieza verticeAzulNaranjaBlanco;
	private Pieza verticeVerdeNaranjaBlanco;
	private Pieza verticeVerdeRojoBlanco;
	private Pieza verticeAzulNaranjaAmarillo;
	private Pieza verticeAzulRojoAmarillo;
	private Pieza verticeVerdeRojoAmarillo;
	private Pieza verticeVerdeNaranjaAmarillo;

	private List<Pieza> caraAzul;
	private List<Pieza> caraBlanca;
	private LinkedList<Pieza> caraVerde;
	private LinkedList<Pieza> caraRoja;
	private LinkedList<Pieza> caraNaranja;
	private LinkedList<Pieza> caraAmarilla;

	public RubikCube() {
		createCentros();
		createAristas();
		createCorners();
		createCaraAzul();
		//
		createCaraAmarilla();
		createCaraAzul();
		createCaraBlanca();
		createCaraNaranja();
		createCaraRoja();
		createCaraVerde();

	}

	private void createCaraAzul() {
		this.caraAzul = new LinkedList<Pieza>();
		caraAzul.add(verticeAzulNaranjaAmarillo);
		caraAzul.add(verticeAzulNaranjaBlanco);
		caraAzul.add(verticeAzulRojoAmarillo);
		caraAzul.add(verticeAzulRojoBlanco);
		caraAzul.add(aristaAzulAmarillo);
		caraAzul.add(aristaAzulBlanca);
		caraAzul.add(aristaAzulNaranja);
		caraAzul.add(aristaAzulRojo);

	}

	private void createCaraBlanca() {
		this.caraBlanca = new LinkedList<Pieza>();
		caraBlanca.add(verticeAzulNaranjaBlanco);
		caraBlanca.add(verticeAzulRojoBlanco);
		caraBlanca.add(verticeVerdeNaranjaBlanco);
		caraBlanca.add(verticeVerdeRojoBlanco);
		caraBlanca.add(aristaNaranjaBlanca);
		caraBlanca.add(aristaVerdeBlanca);
		caraBlanca.add(aristaRojoBlanca);
		caraBlanca.add(aristaAzulBlanca);
	}

	private void createCaraVerde() {
		this.caraVerde = new LinkedList<Pieza>();
		caraVerde.add(verticeVerdeNaranjaAmarillo);
		caraVerde.add(verticeVerdeNaranjaBlanco);
		caraVerde.add(verticeVerdeRojoAmarillo);
		caraVerde.add(verticeVerdeRojoBlanco);
		caraVerde.add(aristaVerdeNaranja);
		caraVerde.add(aristaVerdeBlanca);
		caraVerde.add(aristaVerdeRojo);
		caraVerde.add(aristaVerdeAmarillo);
	}

	private void createCaraRoja() {
		this.caraRoja = new LinkedList<Pieza>();
		caraRoja.add(verticeVerdeNaranjaAmarillo);
		caraRoja.add(verticeVerdeNaranjaBlanco);
		caraRoja.add(verticeVerdeRojoAmarillo);
		caraRoja.add(verticeVerdeRojoBlanco);
		caraRoja.add(aristaVerdeNaranja);
		caraRoja.add(aristaVerdeBlanca);
		caraRoja.add(aristaVerdeRojo);
		caraRoja.add(aristaVerdeAmarillo);
	}

	private void createCaraNaranja() {
		this.caraNaranja = new LinkedList<Pieza>();
		caraNaranja.add(verticeVerdeNaranjaAmarillo);
		caraNaranja.add(verticeVerdeNaranjaBlanco);
		caraNaranja.add(verticeVerdeRojoAmarillo);
		caraNaranja.add(verticeVerdeRojoBlanco);
		caraNaranja.add(aristaVerdeNaranja);
		caraNaranja.add(aristaVerdeBlanca);
		caraNaranja.add(aristaVerdeRojo);
		caraNaranja.add(aristaVerdeAmarillo);
	}

	private void createCaraAmarilla() {
		this.caraAmarilla = new LinkedList<Pieza>();
		caraAmarilla.add(verticeVerdeNaranjaAmarillo);
		caraAmarilla.add(verticeVerdeNaranjaBlanco);
		caraAmarilla.add(verticeVerdeRojoAmarillo);
		caraAmarilla.add(verticeVerdeRojoBlanco);
		caraAmarilla.add(aristaVerdeNaranja);
		caraAmarilla.add(aristaVerdeBlanca);
		caraAmarilla.add(aristaVerdeRojo);
		caraAmarilla.add(aristaVerdeAmarillo);
	}

	private void createCorners() {
		Color blanco = new Color("blanco");
		Color verde = new Color("verde");
		Color azul = new Color("azul");
		Color rojo = new Color("rojo");
		Color amarillo = new Color("amarillo");
		Color naranja = new Color("naranja");

		Vectr orientacion = new Vectr();
		Vectr posicion = new Vectr();
		Set<Color> colors = new HashSet<Color>();

		// AzRB
		colors.add(azul);
		colors.add(rojo);
		colors.add(blanco);
		posicion = new Vectr(1, 1, 1);
		orientacion = new Vectr(0, 0, 1);
		verticeAzulRojoBlanco = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// AzNB
		colors.add(azul);
		colors.add(naranja);
		colors.add(blanco);
		posicion = new Vectr(-1, 1, 1);
		orientacion = new Vectr(0, 0, 1);
		verticeAzulNaranjaBlanco = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// VNB
		colors.add(verde);
		colors.add(naranja);
		colors.add(blanco);
		posicion = new Vectr(-1, -1, 1);
		orientacion = new Vectr(0, 0, 1);
		verticeVerdeNaranjaBlanco = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// VRB
		colors.add(verde);
		colors.add(rojo);
		colors.add(blanco);
		posicion = new Vectr(1, -1, 1);
		orientacion = new Vectr(0, 0, 1);
		verticeVerdeRojoBlanco = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// AzNA
		colors.add(azul);
		colors.add(naranja);
		colors.add(amarillo);
		posicion = new Vectr(-1, 1, -1);
		orientacion = new Vectr(0, 0, -1);
		verticeAzulNaranjaAmarillo = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// AzRA
		colors.add(azul);
		colors.add(rojo);
		colors.add(amarillo);
		posicion = new Vectr(1, 1, -1);
		orientacion = new Vectr(0, 0, -1);
		verticeAzulRojoAmarillo = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// VRA
		colors.add(verde);
		colors.add(rojo);
		colors.add(amarillo);
		posicion = new Vectr(1, -1, -1);
		orientacion = new Vectr(0, 0, -1);
		verticeVerdeRojoAmarillo = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// VNA
		colors.add(verde);
		colors.add(naranja);
		colors.add(amarillo);
		posicion = new Vectr(-1, -1, -1);
		orientacion = new Vectr(0, 0, -1);
		verticeVerdeNaranjaAmarillo = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();

	}

	private void createAristas() {
		Color blanco = new Color("blanco");
		Color verde = new Color("verde");
		Color azul = new Color("azul");
		Color rojo = new Color("rojo");
		Color amarillo = new Color("amarillo");
		Color naranja = new Color("naranja");

		Vectr orientacion = new Vectr();
		Vectr posicion = new Vectr();
		Set<Color> colors = new HashSet<Color>();
		// RB
		colors.add(rojo);
		colors.add(blanco);
		posicion = new Vectr(1, 0, 1);
		orientacion = new Vectr(0, 0, 1);
		aristaRojoBlanca = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// AB
		colors.add(azul);
		colors.add(blanco);
		posicion = new Vectr(0, 1, 1);
		orientacion = new Vectr(0, 0, 1);
		aristaAzulBlanca = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// NB
		colors.add(naranja);
		colors.add(blanco);
		posicion = new Vectr(-1, 0, 1);
		orientacion = new Vectr(0, 0, 1);
		aristaNaranjaBlanca = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// VB
		colors.add(verde);
		colors.add(blanco);
		posicion = new Vectr(0, -1, 1);
		orientacion = new Vectr(0, 0, 1);
		aristaVerdeBlanca = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// AzR
		colors.add(azul);
		colors.add(rojo);
		posicion = new Vectr(1, 1, 0);
		orientacion = new Vectr(1, 0, 0);
		aristaAzulRojo = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// AzN
		colors.add(azul);
		colors.add(naranja);
		posicion = new Vectr(-1, 1, 0);
		orientacion = new Vectr(-1, 0, 0);
		aristaAzulNaranja = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// VN
		colors.add(verde);
		colors.add(naranja);
		posicion = new Vectr(-1, -1, 0);
		orientacion = new Vectr(-1, 0, 0);
		aristaVerdeNaranja = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// VR
		colors.add(verde);
		colors.add(rojo);
		posicion = new Vectr(1, -1, 0);
		orientacion = new Vectr(1, 0, 0);
		aristaVerdeRojo = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// RA
		colors.add(rojo);
		colors.add(amarillo);
		posicion = new Vectr(1, 0, -1);
		orientacion = new Vectr(0, 0, 1);
		aristaRojoAmarillo = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// AzA
		colors.add(azul);
		colors.add(amarillo);
		posicion = new Vectr(0, 1, -1);
		orientacion = new Vectr(0, 0, -1);
		aristaAzulAmarillo = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// NA
		colors.add(naranja);
		colors.add(amarillo);
		posicion = new Vectr(-1, 0, -1);
		orientacion = new Vectr(0, 0, -1);
		aristaNaranjaAmarillo = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// VA
		colors.add(verde);
		colors.add(amarillo);
		posicion = new Vectr(0, -1, -1);
		orientacion = new Vectr(0, 0, -1);
		aristaVerdeAmarillo = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();

	}

	private void createCentros() {

		Color blanco = new Color("blanco");
		Color verde = new Color("verde");
		Color azul = new Color("azul");
		Color rojo = new Color("rojo");
		Color amarillo = new Color("amarillo");
		Color naranja = new Color("naranja");

		Vectr orientacion = new Vectr();
		Vectr posicion = new Vectr();
		Set<Color> colors = new HashSet<Color>();

		// blanco
		colors.add(blanco);
		posicion = new Vectr(0, 0, 1);
		orientacion = new Vectr(0, 0, 1);
		this.centroBlanco = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// amarillo
		colors.add(amarillo);
		posicion = new Vectr(0, 0, -1);
		orientacion = new Vectr(0, 0, -1);
		this.centroAmarillo = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// verde
		colors.add(verde);
		posicion = new Vectr(0, -1, 0);
		orientacion = new Vectr(0, -1, 0);
		this.centroVerde = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// rojo
		colors.add(rojo);
		posicion = new Vectr(1, 0, 0);
		orientacion = new Vectr(1, 0, 0);
		this.centroRojo = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// azul
		colors.add(azul);
		posicion = new Vectr(0, 1, 0);
		orientacion = new Vectr(0, 1, 0);
		this.centroAzul = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
		// naranja
		colors.add(naranja);
		posicion = new Vectr(-1, 0, 0);
		orientacion = new Vectr(-1, 0, 0);
		this.centroNaranja = new Pieza(posicion, orientacion, colors);
		colors = new HashSet<Color>();
	}

	public void R(int veces) {
		this.caraAzul.add(null);
		for (Pieza pieza : caraAzul) {
			// pieza.getOrientacion().ge
		}
	}
}
