package cube;

import java.util.HashSet;
import java.util.Set;

import color.Color;

import pieza.Pieza;
import pieza.Vectr;

public class RubikCubeData {
	
	public RubikCubeData() {
		this.cubeSet = new HashSet<Pieza>();
	}

	public Set<Pieza> cubeSet;
	public Integer posX;
	public Integer posY;
	public Integer posZ;
	public Integer orX;
	public Integer orY;
	public Integer orZ;

	public Set<Pieza> createCube() {
		createCentros();
		createAristas();
		createVertices();
		return cubeSet;
	}

	void createVertices() {
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

	void createAristas() {
	
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

	void createCentros() {
	
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

	public void rotateWhiteFaceClockwise(RubikCube rubikCube) {
		for (Pieza pieza : rubikCube.getWhiteFace()) {
			rubikCube.data.menosXy(rubikCube, pieza);
		}
	}

	/**
	 * Rotates the red face clockwise.
	 * @param rubikCube TODO
	 */
	public void rotateRedFaceClockwise(RubikCube rubikCube) {
		for (Pieza pieza : rubikCube.getRedFace()) {
			rubikCube.data.menosYz(rubikCube, pieza);
	
		}
	}

	protected void menosYz(RubikCube rubikCube, Pieza pieza) {
		posZ = -pieza.getPosY();
		posY = pieza.getPosZ();
		pieza.setPosZ(posZ);
		pieza.setPosY(posY);
	
		orZ = -pieza.getOrY();
		orY = pieza.getOrZ();
		pieza.setOrZ(orZ);
		pieza.setOrY(orY);
	}

	public void rotateRedFaceCounterClockwise(RubikCube rubikCube) {
		for (Pieza pieza : rubikCube.getRedFace()) {
			rubikCube.data.yMenosZ(rubikCube, pieza);
		}
	}

	protected void yMenosZ(RubikCube rubikCube, Pieza pieza) {
		posZ = pieza.getPosY();
		posY = -pieza.getPosZ();
		pieza.setPosZ(posZ);
		pieza.setPosY(posY);
	
		orZ = pieza.getOrY();
		orY = -pieza.getOrZ();
		pieza.setOrZ(orZ);
		pieza.setOrY(orY);
	}

	/**
	 * Rotates the blue face clockwise.
	 * @param rubikCube TODO
	 */
	public void rotateBlueFaceClockwise(RubikCube rubikCube) {
		for (Pieza pieza : rubikCube.getBlueFace()) {
			rubikCube.data.xMenosZ(rubikCube, pieza);
		}
	}

	protected void xMenosZ(RubikCube rubikCube, Pieza pieza) {
		posZ = pieza.getPosX();
		posX = -pieza.getPosZ();
		pieza.setPosZ(posZ);
		pieza.setPosX(posX);
	
		orZ = pieza.getOrX();
		orX = -pieza.getOrZ();
		pieza.setOrZ(orZ);
		pieza.setOrX(orX);
	}

	/**
	 * Rotates the blue face counterclockwise.
	 * @param rubikCube TODO
	 */
	public void rotateBlueFaceCounterClockwise(RubikCube rubikCube) {
		for (Pieza pieza : rubikCube.getBlueFace()) {
			rubikCube.data.menosXz(rubikCube, pieza);
		}
	}

	protected void menosXz(RubikCube rubikCube, Pieza pieza) {
		posZ = -pieza.getPosX();
		posX = pieza.getPosZ();
		pieza.setPosZ(posZ);
		pieza.setPosX(posX);
	
		orZ = -pieza.getOrX();
		orX = pieza.getOrZ();
		pieza.setOrZ(orZ);
		pieza.setOrX(orX);
	}

	/**
	 * Rotates the orange face clockwise.
	 * @param rubikCube TODO
	 */
	public void rotateOrangeFaceClockwise(RubikCube rubikCube) {
		for (Pieza pieza : rubikCube.getOrangeFace()) {
			yMenosZ(rubikCube, pieza);
		}
	}

	protected void xMenosY(RubikCube rubikCube, Pieza pieza) {
		posY = pieza.getPosX();
		posX = -pieza.getPosY();
		pieza.setPosY(posY);
		pieza.setPosX(posX);
	
		orY = pieza.getOrX();
		orX = -pieza.getOrY();
		pieza.setOrY(orY);
		pieza.setOrX(orX);
	}

	/**
	 * Rotates the orange face counterclockwise.
	 * @param rubikCube TODO
	 */
	public void rotateOrangeFaceCounterClockwise(RubikCube rubikCube) {
		for (Pieza pieza : rubikCube.getOrangeFace()) {
			menosYz(rubikCube, pieza);
		}
	}

	/**
	 * Rotates the green face clockwise.
	 * @param rubikCube TODO
	 */
	public void rotateGreenFaceClockwise(RubikCube rubikCube) {
		for (Pieza pieza : rubikCube.getGreenFace()) {
			menosXz(rubikCube, pieza);
		}
	}

	/**
	 * Rotates the green face counterclockwise.
	 * @param rubikCube TODO
	 */
	public void rotateGreenFaceCounterClockwise(RubikCube rubikCube) {
		for (Pieza pieza : rubikCube.getGreenFace()) {
			xMenosZ(rubikCube, pieza);
		}
	}

	/**
	 * Rotates the yellow face clockwise.
	 * @param rubikCube TODO
	 */
	public void rotateYellowFaceClockwise(RubikCube rubikCube) {
		for (Pieza pieza : rubikCube.getYellowFace()) {
			xMenosY(rubikCube, pieza);
		}
	}

	/**
	 * Rotates the yellow face counterclockwise.
	 * @param rubikCube TODO
	 */
	public void rotateYellowFaceCounterClockwise(RubikCube rubikCube) {
		for (Pieza pieza : rubikCube.getYellowFace()) {
			rubikCube.data.menosXy(rubikCube, pieza);
		}
	}

	/**
	 * Rotates the white face counterclockwise.
	 * @param rubikCube TODO
	 */
	public void rotateWhiteFaceCounterClockwise(RubikCube rubikCube) {
		for (Pieza pieza : rubikCube.getWhiteFace()) {
			xMenosY(rubikCube, pieza);
		}
	}

	protected void menosXy(RubikCube rubikCube, Pieza pieza) {
		posY = -pieza.getPosX();
		posX = pieza.getPosY();
		pieza.setPosY(posY);
		pieza.setPosX(posX);
	
		orY = -pieza.getOrX();
		orX = pieza.getOrY();
		pieza.setOrY(orY);
		pieza.setOrX(orX);
	}
}