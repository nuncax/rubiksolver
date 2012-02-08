package cube;

import java.util.HashSet;
import java.util.Set;

import color.Color;

import pieza.Pieza;
import pieza.Vectr;

public class RubikCubeData {
	
	private Set<Pieza> cubeSet;

	public Set<Pieza> createCube() {
		this.cubeSet = new HashSet<Pieza>();
		createCentros();
		createAristas();
		createVertices();
		return cubeSet;
	}

	
	private void createVertices() {
		Color blanco = new Color("blanco");
		Color verde = new Color("verde");
		Color azul = new Color("azul");
		Color rojo = new Color("rojo");
		Color amarillo = new Color("amarillo");
		Color naranja = new Color("naranja");

		Vectr orientacion;
		Vectr posicion;
		Set<Color> colors = new HashSet<Color>();

		// AzRB
		colors.add(azul);
		colors.add(rojo);
		colors.add(blanco);
		posicion = new Vectr(1, 1, 1);
		orientacion = new Vectr(0, 0, 1);
		// verticeAzulRojoBlanco = new Pieza(posicion, orientacion, colors);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// AzNB
		colors.add(azul);
		colors.add(naranja);
		colors.add(blanco);
		posicion = new Vectr(-1, 1, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VNB
		colors.add(verde);
		colors.add(naranja);
		colors.add(blanco);
		posicion = new Vectr(-1, -1, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VRB
		colors.add(verde);
		colors.add(rojo);
		colors.add(blanco);
		posicion = new Vectr(1, -1, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// AzNA
		colors.add(azul);
		colors.add(naranja);
		colors.add(amarillo);
		posicion = new Vectr(-1, 1, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// AzRA
		colors.add(azul);
		colors.add(rojo);
		colors.add(amarillo);
		posicion = new Vectr(1, 1, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VRA
		colors.add(verde);
		colors.add(rojo);
		colors.add(amarillo);
		posicion = new Vectr(1, -1, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
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
		Set<Color> colors = new HashSet<Color>();
		// RB
		colors.add(rojo);
		colors.add(blanco);
		posicion = new Vectr(1, 0, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// AB
		colors.add(azul);
		colors.add(blanco);
		posicion = new Vectr(0, 1, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// NB
		colors.add(naranja);
		colors.add(blanco);
		posicion = new Vectr(-1, 0, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VB
		colors.add(verde);
		colors.add(blanco);
		posicion = new Vectr(0, -1, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// AzR
		colors.add(azul);
		colors.add(rojo);
		posicion = new Vectr(1, 1, 0);
		orientacion = new Vectr(1, 0, 0);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// AzN
		colors.add(azul);
		colors.add(naranja);
		posicion = new Vectr(-1, 1, 0);
		orientacion = new Vectr(-1, 0, 0);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VN
		colors.add(verde);
		colors.add(naranja);
		posicion = new Vectr(-1, -1, 0);
		orientacion = new Vectr(-1, 0, 0);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VR
		colors.add(verde);
		colors.add(rojo);
		posicion = new Vectr(1, -1, 0);
		orientacion = new Vectr(1, 0, 0);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// RA
		colors.add(rojo);
		colors.add(amarillo);
		posicion = new Vectr(1, 0, -1);
		orientacion = new Vectr(0, 0, 1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// AzA
		colors.add(azul);
		colors.add(amarillo);
		posicion = new Vectr(0, 1, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// NA
		colors.add(naranja);
		colors.add(amarillo);
		posicion = new Vectr(-1, 0, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
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
		Set<Color> colors = new HashSet<Color>();

		// blanco
		colors.add(blanco);
		posicion = new Vectr(0, 0, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// amarillo
		colors.add(amarillo);
		posicion = new Vectr(0, 0, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// verde
		colors.add(verde);
		posicion = new Vectr(0, -1, 0);
		orientacion = new Vectr(0, -1, 0);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// rojo
		colors.add(rojo);
		posicion = new Vectr(1, 0, 0);
		orientacion = new Vectr(1, 0, 0);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// azul
		colors.add(azul);
		posicion = new Vectr(0, 1, 0);
		orientacion = new Vectr(0, 1, 0);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// naranja
		colors.add(naranja);
		posicion = new Vectr(-1, 0, 0);
		orientacion = new Vectr(-1, 0, 0);
		cubeSet.add(new Pieza(posicion, orientacion, colors));
	}

	public Set<Pieza> getCubeSet() {
		return this.cubeSet;
	}

	public Set<Pieza> getBlueFace() {
		Set<Pieza> blueFace = new HashSet<Pieza>();
		for (Pieza pieza : cubeSet) {
			if (pieza.isBlue() && !pieza.esCentro()) {
				blueFace.add(pieza);
			}
		}
		return blueFace;
	}

	public Set<Pieza> getWhiteFace() {
		Set<Pieza> whiteFace = new HashSet<Pieza>();
		for (Pieza pieza : cubeSet) {
			if (pieza.isWhite() && !pieza.esCentro()) {
				whiteFace.add(pieza);
			}
		}
		return whiteFace;
	}

	public Set<Pieza> getOrangeFace() {
		Set<Pieza> orangeFace = new HashSet<Pieza>();
		for (Pieza pieza : cubeSet) {
			if (pieza.isOrange() && !pieza.esCentro()) {
				orangeFace.add(pieza);
			}
		}
		return orangeFace;
	}

	public Set<Pieza> getGreenFace() {
		Set<Pieza> greenFace = new HashSet<Pieza>();
		for (Pieza pieza : cubeSet) {
			if (pieza.isGreen() && !pieza.esCentro()) {
				greenFace.add(pieza);
			}
		}
		return greenFace;
	}

	public Set<Pieza> getYellowFace() {
		Set<Pieza> yellowFace = new HashSet<Pieza>();
		for (Pieza pieza : cubeSet) {
			if (pieza.isYellow() && !pieza.esCentro()) {
				yellowFace.add(pieza);
			}
		}
		return yellowFace;
	}

	public Set<Pieza> getRedFace() {

		Set<Pieza> redFace = new HashSet<Pieza>();
		for (Pieza pieza : cubeSet) {
			if (pieza.isRed() && !pieza.esCentro()) {
				redFace.add(pieza);
			}
		}
		return redFace;
	}
	public void rotateRedFaceCounterClockwise() {
		for (Pieza pieza : this.getRedFace()) {
			pieza.yMenosZ();
		}
	}

	public void rotateBlueFaceCounterClockwise() {
		for (Pieza pieza : this.getBlueFace()) {
			pieza.menosXz();
		}
	}

	public void rotateYellowFaceCounterClockwise() {
		for (Pieza pieza : this.getYellowFace()) {
			pieza.menosXy();
		}
	}

	public void rotateGreenFaceCounterClockwise() {
		for (Pieza pieza : this.getGreenFace()) {
			pieza.xMenosZ();
		}
	}

	public void rotateWhiteFaceCounterClockwise() {
		for (Pieza pieza : this.getWhiteFace()) {
			pieza.xMenosY();
		}
	}

	public void rotateOrangeFaceCounterClockwise() {
		for (Pieza pieza : this.getOrangeFace()) {
			pieza.menosYz();
		}
	}
	
	public void rotateYellowFaceClockwise() {
		for (Pieza pieza : this.getYellowFace()) {
			pieza.xMenosY();
		}
	}

	public void rotateWhiteFaceClockwise() {
		for (Pieza pieza : this.getWhiteFace()) {
			pieza.menosXy();
		}
	}

	public void rotateRedFaceClockwise() {
		for (Pieza pieza : this.getRedFace()) {
			pieza.menosYz();

		}
	}

	public void rotateBlueFaceClockwise() {
		for (Pieza pieza : this.getBlueFace()) {
			pieza.xMenosZ();
		}
	}

	public void rotateOrangeFaceClockwise() {
		for (Pieza pieza : this.getOrangeFace()) {
			pieza.yMenosZ();
		}
	}

	public void rotateGreenFaceClockwise() {
		for (Pieza pieza : this.getGreenFace()) {
			pieza.menosXz();
		}
	}


	public Pieza getCentro(Color color) {
		Pieza piezaRes=null;
		for (Pieza pieza : this.cubeSet) {
			if(pieza.containsColor(color)){
				piezaRes=pieza;
			}
		}
		return piezaRes;
	}
}