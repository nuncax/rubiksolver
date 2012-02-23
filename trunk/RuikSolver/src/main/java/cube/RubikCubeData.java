package cube;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import color.Color;

import pieza.Matrix;
import pieza.Pieza;
import pieza.Vectr;

public class RubikCubeData {
	final private int[][] BLUE_MATRIZ = { { 0, 0, -1 }, { 0, 1, 0 },
			{ 1, 0, 0 } };
	final private int[][] RED_MATRIZ = { { 1, 0, 0 }, { 0, 0, 1 }, { 0, -1, 0 } };
	final private int[][] WHITE_MATRIZ = { { 0, 1, 0 }, { -1, 0, 0 },
			{ 0, 0, 1 } };
	final private int[][] ORANGE_MATRIZ = { { 1, 0, 0 }, { 0, 0, -1 },
			{ 0, 1, 0 } };
	final private int[][] GREEN_MATRIZ = { { 0, 0, 1 }, { 0, 1, 0 },
			{ -1, 0, 0 } };
	final private int[][] YELLOW_MATRIZ = { { 0, -1, 0 }, { 1, 0, 0 },
			{ 0, 0, 1 } };

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
		orientacion = new Vectr(0, 0, 1);
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
			if (pieza.containsColor(centro.getColorPuntero()) && !pieza.esCentro()) {
				face.add(pieza);
			}
		}
		return face;
	}

	// public Set<Pieza> getBlueFace() {
	// Set<Pieza> blueFace = new HashSet<Pieza>();
	// for (Pieza pieza : cubeSet) {
	// if (pieza.isBlue() && !pieza.esCentro()) {
	// blueFace.add(pieza);
	// }
	// }
	// return blueFace;
	// }
	//
	// public Set<Pieza> getWhiteFace() {
	// Set<Pieza> whiteFace = new HashSet<Pieza>();
	// for (Pieza pieza : cubeSet) {
	// if (pieza.isWhite() && !pieza.esCentro()) {
	// whiteFace.add(pieza);
	// }
	// }
	// return whiteFace;
	// }
	//
	// public Set<Pieza> getOrangeFace() {
	// Set<Pieza> orangeFace = new HashSet<Pieza>();
	// for (Pieza pieza : cubeSet) {
	// if (pieza.isOrange() && !pieza.esCentro()) {
	// orangeFace.add(pieza);
	// }
	// }
	// return orangeFace;
	// }
	//
	// public Set<Pieza> getGreenFace() {
	// Set<Pieza> greenFace = new HashSet<Pieza>();
	// for (Pieza pieza : cubeSet) {
	// if (pieza.isGreen() && !pieza.esCentro()) {
	// greenFace.add(pieza);
	// }
	// }
	// return greenFace;
	// }
	//
	// public Set<Pieza> getYellowFace() {
	// Set<Pieza> yellowFace = new HashSet<Pieza>();
	// for (Pieza pieza : cubeSet) {
	// if (pieza.isYellow() && !pieza.esCentro()) {
	// yellowFace.add(pieza);
	// }
	// }
	// return yellowFace;
	// }
	//
	// public Set<Pieza> getRedFace() {
	//
	// Set<Pieza> redFace = new HashSet<Pieza>();
	// for (Pieza pieza : cubeSet) {
	// if (pieza.isRed() && !pieza.esCentro()) {
	// redFace.add(pieza);
	// }
	// }
	// return redFace;
	// }

	public void rotateFaceClockwise(Pieza centro) {
		int maux[][] = null;
		if (centro.getColorPuntero().equals(this.blanco)) {
			maux = this.WHITE_MATRIZ;
		} else if (centro.getColorPuntero().equals(this.amarillo)) {
			maux = this.YELLOW_MATRIZ;
		} else if (centro.getColorPuntero().equals(this.azul)) {
			maux = this.BLUE_MATRIZ;
		} else if (centro.getColorPuntero().equals(this.naranja)) {
			maux = this.ORANGE_MATRIZ;
		} else if (centro.getColorPuntero().equals(this.rojo)) {
			maux = this.RED_MATRIZ;
		} else if (centro.getColorPuntero().equals(this.verde)) {
			maux = this.GREEN_MATRIZ;
		}
		for(Pieza pieza: getFace(centro)){
			pieza.multiplicar(maux);
		}
	}

	// public void rotateOrangeFaceClockwise() {
	// for (Pieza pieza : this.getOrangeFace()) {
	// pieza.naranjaYcontraRojo();
	// }
	// }
	//
	// public void rotateRedFaceCounterClockwise() {
	// for (Pieza pieza : this.getRedFace()) {
	// pieza.naranjaYcontraRojo();
	// }
	// }
	//
	// public void rotateGreenFaceClockwise() {
	// for (Pieza pieza : this.getGreenFace()) {
	// pieza.verdeYcontraAzul();
	// }
	// }
	//
	// public void rotateBlueFaceCounterClockwise() {
	// for (Pieza pieza : this.getBlueFace()) {
	// pieza.verdeYcontraAzul();
	// }
	// }
	//
	// public void rotateYellowFaceCounterClockwise() {
	// for (Pieza pieza : this.getYellowFace()) {
	// pieza.blancoYcontraAmarillo();
	// }
	// }
	//
	// public void rotateGreenFaceCounterClockwise() {
	// for (Pieza pieza : this.getGreenFace()) {
	// pieza.azulYcontraVerde();
	// }
	// }
	//
	// public void rotateWhiteFaceCounterClockwise() {
	// for (Pieza pieza : this.getWhiteFace()) {
	// pieza.amarilloContraBlanco();
	// }
	// }
	//
	// public void rotateOrangeFaceCounterClockwise() {
	// for (Pieza pieza : this.getOrangeFace()) {
	// pieza.rojoYcontraNaranja();
	// }
	// }
	//
	// public void rotateYellowFaceClockwise() {
	// for (Pieza pieza : this.getYellowFace()) {
	// pieza.amarilloContraBlanco();
	// }
	// }
	//
	// public void rotateWhiteFaceClockwise() {
	// for (Pieza pieza : this.getWhiteFace()) {
	// pieza.blancoYcontraAmarillo();
	// }
	// }
	//
	// public void rotateRedFaceClockwise() {
	// for (Pieza pieza : this.getRedFace()) {
	// pieza.rojoYcontraNaranja();
	//
	// }
	// }
	//
	// public void rotateBlueFaceClockwise() {
	// for (Pieza pieza : this.getBlueFace()) {
	// pieza.azulYcontraVerde();
	// }
	// }

	public Pieza getCentro(Color color) {
		Pieza piezaRes = null;
		for (Pieza pieza : this.cubeSet) {
			if (pieza.esCentro() && pieza.getColorPuntero().equals(color)) {
				piezaRes = pieza;
			}
		}
		return piezaRes;
	}

	public void rotateFaceCounterClockwise(Pieza rIGHT) {
		// TODO Auto-generated method stub

	}

}