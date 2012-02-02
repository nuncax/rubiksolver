package cube;

import java.util.HashSet;
import java.util.Set;

import pieza.Pieza;
import pieza.Vectr;

import color.Color;

public class RubikCube {

	private Set<Pieza> cubeSet;
	Integer posX;
	Integer posY;
	Integer posZ;
	Integer orX;
	Integer orY;
	Integer orZ;

	public RubikCube() {
		this.cubeSet = new HashSet<Pieza>();
		createCentros();
		createAristas();
		createVertices();
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
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// AzNB
		colors.add(azul);
		colors.add(naranja);
		colors.add(blanco);
		posicion = new Vectr(-1, 1, 1);
		orientacion = new Vectr(0, 0, 1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VNB
		colors.add(verde);
		colors.add(naranja);
		colors.add(blanco);
		posicion = new Vectr(-1, -1, 1);
		orientacion = new Vectr(0, 0, 1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VRB
		colors.add(verde);
		colors.add(rojo);
		colors.add(blanco);
		posicion = new Vectr(1, -1, 1);
		orientacion = new Vectr(0, 0, 1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// AzNA
		colors.add(azul);
		colors.add(naranja);
		colors.add(amarillo);
		posicion = new Vectr(-1, 1, -1);
		orientacion = new Vectr(0, 0, -1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// AzRA
		colors.add(azul);
		colors.add(rojo);
		colors.add(amarillo);
		posicion = new Vectr(1, 1, -1);
		orientacion = new Vectr(0, 0, -1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VRA
		colors.add(verde);
		colors.add(rojo);
		colors.add(amarillo);
		posicion = new Vectr(1, -1, -1);
		orientacion = new Vectr(0, 0, -1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VNA
		colors.add(verde);
		colors.add(naranja);
		colors.add(amarillo);
		posicion = new Vectr(-1, -1, -1);
		orientacion = new Vectr(0, 0, -1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));

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
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// AB
		colors.add(azul);
		colors.add(blanco);
		posicion = new Vectr(0, 1, 1);
		orientacion = new Vectr(0, 0, 1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// NB
		colors.add(naranja);
		colors.add(blanco);
		posicion = new Vectr(-1, 0, 1);
		orientacion = new Vectr(0, 0, 1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VB
		colors.add(verde);
		colors.add(blanco);
		posicion = new Vectr(0, -1, 1);
		orientacion = new Vectr(0, 0, 1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// AzR
		colors.add(azul);
		colors.add(rojo);
		posicion = new Vectr(1, 1, 0);
		orientacion = new Vectr(1, 0, 0);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// AzN
		colors.add(azul);
		colors.add(naranja);
		posicion = new Vectr(-1, 1, 0);
		orientacion = new Vectr(-1, 0, 0);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VN
		colors.add(verde);
		colors.add(naranja);
		posicion = new Vectr(-1, -1, 0);
		orientacion = new Vectr(-1, 0, 0);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VR
		colors.add(verde);
		colors.add(rojo);
		posicion = new Vectr(1, -1, 0);
		orientacion = new Vectr(1, 0, 0);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// RA
		colors.add(rojo);
		colors.add(amarillo);
		posicion = new Vectr(1, 0, -1);
		orientacion = new Vectr(0, 0, 1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// AzA
		colors.add(azul);
		colors.add(amarillo);
		posicion = new Vectr(0, 1, -1);
		orientacion = new Vectr(0, 0, -1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// NA
		colors.add(naranja);
		colors.add(amarillo);
		posicion = new Vectr(-1, 0, -1);
		orientacion = new Vectr(0, 0, -1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VA
		colors.add(verde);
		colors.add(amarillo);
		posicion = new Vectr(0, -1, -1);
		orientacion = new Vectr(0, 0, -1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));

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
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// amarillo
		colors.add(amarillo);
		posicion = new Vectr(0, 0, -1);
		orientacion = new Vectr(0, 0, -1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// verde
		colors.add(verde);
		posicion = new Vectr(0, -1, 0);
		orientacion = new Vectr(0, -1, 0);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// rojo
		colors.add(rojo);
		posicion = new Vectr(1, 0, 0);
		orientacion = new Vectr(1, 0, 0);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// azul
		colors.add(azul);
		posicion = new Vectr(0, 1, 0);
		orientacion = new Vectr(0, 1, 0);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// naranja
		colors.add(naranja);
		posicion = new Vectr(-1, 0, 0);
		orientacion = new Vectr(-1, 0, 0);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
	}

	public Set<Pieza> getBlueFace() {
		Set<Pieza> blueFace = new HashSet<Pieza>();
		for (Pieza pieza : this.cubeSet) {
			if (pieza.isBlue() && !pieza.esCentro()) {
				blueFace.add(pieza);
			}
		}
		return blueFace;
	}

	public Set<Pieza> getRedFace() {
		Set<Pieza> redFace = new HashSet<Pieza>();
		for (Pieza pieza : this.cubeSet) {
			if (pieza.isRed() && !pieza.esCentro()) {
				redFace.add(pieza);
			}
		}
		return redFace;
	}

	public Set<Pieza> getYellowFace() {
		Set<Pieza> yellowFace = new HashSet<Pieza>();
		for (Pieza pieza : this.cubeSet) {
			if (pieza.isYellow() && !pieza.esCentro()) {
				yellowFace.add(pieza);
			}
		}
		return yellowFace;
	}

	public Set<Pieza> getGreenFace() {
		Set<Pieza> greenFace = new HashSet<Pieza>();
		for (Pieza pieza : this.cubeSet) {
			if (pieza.isGreen() && !pieza.esCentro()) {
				greenFace.add(pieza);
			}
		}
		return greenFace;
	}

	public Set<Pieza> getOrangeFace() {
		Set<Pieza> orangeFace = new HashSet<Pieza>();
		for (Pieza pieza : this.cubeSet) {
			if (pieza.isOrange() && !pieza.esCentro()) {
				orangeFace.add(pieza);
			}
		}
		return orangeFace;
	}

	public Set<Pieza> getWhiteFace() {
		Set<Pieza> whiteFace = new HashSet<Pieza>();
		for (Pieza pieza : this.cubeSet) {
			if (pieza.isWhite() && !pieza.esCentro()) {
				whiteFace.add(pieza);
			}
		}
		return whiteFace;
	}
	
	
	Integer auxiliarypos;
	Integer auxiliarxpos;
	Integer auxiliarydir;
	Integer auxiliarxdir;
	Integer auxiliarzpos;
	Integer auxiliarzdir;
	
	public void rotateWhiteFaceClockwise() {
		for (Pieza pieza: getWhiteFace()) {
				menosXy(pieza);
		}
	}

	protected void menosXy(Pieza pieza) {
		auxiliarypos = -pieza.getPosX();
		auxiliarxpos = pieza.getPosY();
		pieza.setPosY( auxiliarypos);
		pieza.setPosX(auxiliarxpos);

		auxiliarydir = -pieza.getOrX();
		auxiliarxdir = pieza.getOrY();
		pieza.setOrY(auxiliarydir);
		pieza.setOrX(auxiliarxdir);
	}

	/**
	 * Rotates the white face counterclockwise.
	 */
	public void rotateWhiteFaceCounterClockwise() {
		for (Pieza pieza: getWhiteFace()) {
				xMenosY(pieza);
		}
	}

	protected void xMenosY(Pieza pieza) {
		auxiliarypos = pieza.getPosX();
		auxiliarxpos = -pieza.getPosY();
		pieza.setPosY(auxiliarypos);
		pieza.setPosX(auxiliarxpos);

		auxiliarydir = pieza.getOrX();
		auxiliarxdir = -pieza.getOrY();
		pieza.setOrY(auxiliarydir);
		pieza.setOrX(auxiliarxdir);
	}

	/**
	 * Rotates the red face clockwise.
	 */
	public void rotateRedFaceClockwise() {
		for (Pieza pieza: getRedFace()) {
				menosYz(pieza);
			
		}
	}

	protected void menosYz(Pieza pieza) {
		auxiliarzpos = -pieza.getPosY();
		auxiliarypos =pieza.getPosZ();
		pieza.setPosZ(auxiliarzpos);
		pieza.setPosY(auxiliarypos);

		auxiliarzdir = -pieza.getOrY();
		auxiliarydir = pieza.getOrZ();
		pieza.setOrZ(auxiliarzdir);
		pieza.setOrY(auxiliarydir);
	}
	public void rotateRedFaceCounterClockwise() {
		for (Pieza pieza: getRedFace()) {
				yMenosZ(pieza);
		}
	}

	protected void yMenosZ(Pieza pieza) {
		auxiliarzpos = pieza.getPosY();
		auxiliarypos = -pieza.getPosZ();
		pieza.setPosZ(auxiliarzpos);
		pieza.setPosY(auxiliarypos);

		auxiliarzdir = pieza.getOrY();
		auxiliarydir = -pieza.getOrZ();
		pieza.setOrZ(auxiliarzdir);
		pieza.setOrY(auxiliarydir);
	}

	/**
	 * Rotates the blue face clockwise.
	 */
	public void rotateBlueFaceClockwise() {
		for (Pieza pieza: getBlueFace()) {
				xMenosZ(pieza);
		}
	}

	protected void xMenosZ(Pieza pieza) {
		auxiliarzpos = pieza.getPosX();
		auxiliarxpos = -pieza.getPosZ();
		pieza.setPosZ(auxiliarzpos);
		pieza.setPosX(auxiliarxpos);

		auxiliarzdir = pieza.getOrX();
		auxiliarxdir = -pieza.getOrZ();
		pieza.setOrZ(auxiliarzdir);
		pieza.setOrX(auxiliarxdir);
	}

	/**
	 * Rotates the blue face counterclockwise.
	 */
	public void rotateBlueFaceCounterClockwise() {
		for (Pieza pieza: getBlueFace()) {
				menosXz(pieza);
		}
	}

	protected void menosXz(Pieza pieza) {
		auxiliarzpos = -pieza.getPosX();
		auxiliarxpos =pieza.getPosZ();
		pieza.setPosZ(auxiliarzpos);
		pieza.setPosX(auxiliarxpos);

		auxiliarzdir = -pieza.getOrX();
		auxiliarxdir = pieza.getOrZ();
		pieza.setOrZ(auxiliarzdir);
		pieza.setOrX(auxiliarxdir);
	}

	/**
	 * Rotates the orange face clockwise.
	 */
	public void rotateOrangeFaceClockwise() {
		for (Pieza pieza: getOrangeFace()) {
				yMenosZ(pieza);
		}
	}

	/**
	 * Rotates the orange face counterclockwise.
	 */
	public void rotateOrangeFaceCounterClockwise() {
		for (Pieza pieza: getOrangeFace()) {
				menosYz(pieza);
		}
	}

	/**
	 * Rotates the green face clockwise.
	 */
	public void rotateGreenFaceClockwise() {
		for (Pieza pieza: getGreenFace()){
				menosXz(pieza);
		}
	}

	/**
	 * Rotates the green face counterclockwise.
	 */
	public void rotateGreenFaceCounterClockwise() {
		for (Pieza pieza: getGreenFace()) {
				xMenosZ(pieza);
		}
	}

	/**
	 * Rotates the yellow face clockwise.
	 */
	public void rotateYellowFaceClockwise() {
		for (Pieza pieza: getYellowFace()) {
				xMenosY(pieza);
		}
	}

	/**
	 * Rotates the yellow face counterclockwise.
	 */
	public void rotateYellowFaceCounterClockwise() {
		for (Pieza pieza: getYellowFace()) {
				menosXy(pieza);
		}
	}
	
}
