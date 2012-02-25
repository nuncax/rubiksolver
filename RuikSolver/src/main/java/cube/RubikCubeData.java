package cube;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import color.Color;
import pieza.Pieza;
import pieza.Vectr;

public class RubikCubeData {

	int[][] getMatriz(Pieza centro, int signo) {
		int[][] maux = null;
		if (centro.getColorPuntero().equals(this.blanco)) {
			maux = new int[][] { { 0, signo * 1, 0 }, { signo * -1, 0, 0 },
					{ 0, 0, 1 } };
		} else if (centro.getColorPuntero().equals(this.amarillo)) {
			maux = new int[][] { { 0, signo * -1, 0 }, { signo * 1, 0, 0 },
					{ 0, 0, 1 } };
		} else if (centro.getColorPuntero().equals(this.azul)) {
			maux = new int[][] { { 0, 0, signo * -1 }, { 0, 1, 0 },
					{ signo * 1, 0, 0 } };
		} else if (centro.getColorPuntero().equals(this.naranja)) {
			maux = new int[][] { { 1, 0, 0 }, { 0, 0, signo * -1 },
					{ 0, signo * 1, 0 } };
		} else if (centro.getColorPuntero().equals(this.rojo)) {
			maux = new int[][] { { 1, 0, 0 }, { 0, 0, signo * 1 },
					{ 0, signo * -1, 0 } };
		} else if (centro.getColorPuntero().equals(this.verde)) {
			maux = new int[][] { { 0, 0, signo * 1 }, { 0, 1, 0 },
					{ signo * -1, 0, 0 } };
		}
		return maux;
	}

	final private Color blanco = new Color("blanco");
	final private Color verde = new Color("verde");
	final private Color azul = new Color("azul");
	final private Color rojo = new Color("rojo");
	final private Color amarillo = new Color("amarillo");
	final private Color naranja = new Color("naranja");

	private List<Pieza> cubeSet;

	public List<Pieza> createCube() {
		this.cubeSet = new ArrayList<Pieza>();
		createCentros();
		createAristas();
		createVertices();
		return cubeSet;
	}

	private void createVertices() {

		Vectr orientacion;
		Vectr posicion;
		List<Color> colors = new ArrayList<Color>();

		// AzRB
		colors.add(blanco);
		colors.add(azul);
		colors.add(rojo);
		posicion = new Vectr(1, 1, 1);
		orientacion = new Vectr(0, 0, 1);
		// verticeAzulRojoBlanco = new Pieza(posicion, orientacion, colors);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// AzNB
		colors.add(blanco);
		colors.add(azul);
		colors.add(naranja);
		posicion = new Vectr(-1, 1, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// VNB
		colors.add(blanco);
		colors.add(verde);
		colors.add(naranja);
		posicion = new Vectr(-1, -1, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// VRB
		colors.add(blanco);
		colors.add(verde);
		colors.add(rojo);
		posicion = new Vectr(1, -1, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// AzNA
		colors.add(azul);
		colors.add(naranja);
		colors.add(amarillo);
		posicion = new Vectr(-1, 1, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// AzRA
		colors.add(azul);
		colors.add(rojo);
		colors.add(amarillo);
		posicion = new Vectr(1, 1, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// VRA
		colors.add(verde);
		colors.add(rojo);
		colors.add(amarillo);
		posicion = new Vectr(1, -1, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// VNA
		colors.add(verde);
		colors.add(naranja);
		colors.add(amarillo);
		posicion = new Vectr(-1, -1, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));

	}

	private void createAristas() {

		Color blanco = new Color("blanco");
		Color verde = new Color("verde");
		Color azul = new Color("azul");
		Color rojo = new Color("rojo");
		Color amarillo = new Color("amarillo");
		Color naranja = new Color("naranja");

		Vectr orientacion;
		Vectr posicion;
		List<Color> colors = new ArrayList<Color>();
		// RB
		colors.add(blanco);
		colors.add(rojo);
		posicion = new Vectr(1, 0, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// AB
		colors.add(blanco);
		colors.add(azul);
		posicion = new Vectr(0, 1, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// NB
		colors.add(blanco);
		colors.add(naranja);
		posicion = new Vectr(-1, 0, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// VB
		colors.add(blanco);
		colors.add(verde);
		posicion = new Vectr(0, -1, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// AzR
		colors.add(azul);
		colors.add(rojo);
		posicion = new Vectr(1, 1, 0);
		orientacion = new Vectr(1, 0, 0);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// AzN
		colors.add(azul);
		colors.add(naranja);
		posicion = new Vectr(-1, 1, 0);
		orientacion = new Vectr(-1, 0, 0);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// VN
		colors.add(verde);
		colors.add(naranja);
		posicion = new Vectr(-1, -1, 0);
		orientacion = new Vectr(-1, 0, 0);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// VR
		colors.add(verde);
		colors.add(rojo);
		posicion = new Vectr(1, -1, 0);
		orientacion = new Vectr(1, 0, 0);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// RA
		colors.add(rojo);
		colors.add(amarillo);
		posicion = new Vectr(1, 0, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// AzA
		colors.add(azul);
		colors.add(amarillo);
		posicion = new Vectr(0, 1, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// NA
		colors.add(naranja);
		colors.add(amarillo);
		posicion = new Vectr(-1, 0, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// VA
		colors.add(verde);
		colors.add(amarillo);
		posicion = new Vectr(0, -1, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));

	}

	private void createCentros() {

		Color blanco = new Color("blanco");
		Color verde = new Color("verde");
		Color azul = new Color("azul");
		Color rojo = new Color("rojo");
		Color amarillo = new Color("amarillo");
		Color naranja = new Color("naranja");

		Vectr orientacion;
		Vectr posicion;
		List<Color> colors = new ArrayList<Color>();

		// blanco
		colors.add(blanco);
		posicion = new Vectr(0, 0, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// amarillo
		colors.add(amarillo);
		posicion = new Vectr(0, 0, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// verde
		colors.add(verde);
		posicion = new Vectr(0, -1, 0);
		orientacion = new Vectr(0, -1, 0);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// rojo
		colors.add(rojo);
		posicion = new Vectr(1, 0, 0);
		orientacion = new Vectr(1, 0, 0);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// azul
		colors.add(azul);
		posicion = new Vectr(0, 1, 0);
		orientacion = new Vectr(0, 1, 0);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new ArrayList<Color>();
		// naranja
		colors.add(naranja);
		posicion = new Vectr(-1, 0, 0);
		orientacion = new Vectr(-1, 0, 0);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
	}

	public List<Pieza> getCubeSet() {
		return this.cubeSet;
	}

	public Set<Pieza> getFace(Pieza centro) {
		Set<Pieza> face = new HashSet<Pieza>();
		for (Pieza pieza : cubeSet) {
			if (pieza.estaEnCara(centro) && !pieza.esCentro()) {
				face.add(pieza);
			}
		}
		return face;
	}

	public void rotateFaceClockwise(Pieza centro, int signo) {
		int[][] matriz = getMatriz(centro, signo);
		for (Pieza pieza : getFace(centro)) {
			pieza.multiplicar(matriz);
			System.out.println(pieza);
		}

	}

	public Pieza getCentro(Color color) {
		Pieza piezaRes = null;
		for (Pieza pieza : this.cubeSet) {
			if (pieza.esCentro() && pieza.getColorPuntero().equals(color)) {
				piezaRes = pieza;
			}
		}
		return piezaRes;
	}

}