package cube;

import java.util.HashSet;
import java.util.Set;

import color.Color;
import pieza.Pieza;
import solutions.SolutionMethodTemba;

public class RubikCube {
	private final RubikCubeData data;

	public Pieza FRONT;
	public Pieza RIGHT;
	public Pieza LEFT;
	public Pieza UP;
	public Pieza DONW;
	public Pieza BACK;

	private final Color AZUL = new Color("AZUL");
	private final Color NARANJA = new Color("naranja");
	private final Color ROJO = new Color("rojo");
	private final Color BLANCO = new Color("blanco");
	private final Color AMARILLO = new Color("amarillo");
	private final Color VERDE = new Color("verde");

	public RubikCube() {
		data = new RubikCubeData();
		data.createCube();
		this.DONW = data.getCentro(AMARILLO);
		this.FRONT = data.getCentro(AZUL);
		this.RIGHT = data.getCentro(NARANJA);
		this.BACK = data.getCentro(VERDE);
		this.LEFT = data.getCentro(ROJO);
		this.UP = data.getCentro(BLANCO);
	}

	public void right(Color front) {
		if (front.equals(this.ROJO)) {
			data.rotateBlueFaceClockwise();
		} else if (front.equals(this.AZUL)) {
			data.rotateOrangeFaceClockwise();
		} else if (front.equals(this.NARANJA)) {
			data.rotateGreenFaceClockwise();
		} else if (front.equals(this.VERDE)) {
			data.rotateRedFaceClockwise();
		}
	}

	public void rightP(Color front) {
		if (front.equals(this.ROJO)) {
			data.rotateBlueFaceCounterClockwise();
		} else if (front.equals(this.AZUL)) {
			data.rotateOrangeFaceCounterClockwise();
		} else if (front.equals(this.NARANJA)) {
			data.rotateGreenFaceCounterClockwise();
		} else if (front.equals(this.VERDE)) {
			data.rotateRedFaceCounterClockwise();
		}
	}

	public void left(Color front) {
		if (front.equals(this.ROJO)) {
			data.rotateGreenFaceClockwise();
		} else if (front.equals(this.AZUL)) {
			data.rotateRedFaceClockwise();
		} else if (front.equals(this.NARANJA)) {
			data.rotateBlueFaceClockwise();
		} else if (front.equals(this.VERDE)) {
			data.rotateOrangeFaceClockwise();
		}
	}

	public void leftP(Color front) {
		if (front.equals(this.ROJO)) {
			data.rotateGreenFaceCounterClockwise();
		} else if (front.equals(this.AZUL)) {
			data.rotateRedFaceCounterClockwise();
		} else if (front.equals(this.NARANJA)) {
			data.rotateBlueFaceCounterClockwise();
		} else if (front.equals(this.VERDE)) {
			data.rotateOrangeFaceCounterClockwise();
		}

	}

	public void front(Color front) {
		if (front.equals(this.ROJO)) {
			data.rotateRedFaceClockwise();
		} else if (front.equals(this.AZUL)) {
			data.rotateBlueFaceClockwise();
		} else if (front.equals(this.NARANJA)) {
			data.rotateOrangeFaceClockwise();
		} else if (front.equals(this.VERDE)) {
			data.rotateGreenFaceClockwise();
		}
	}

	public void frontP(Color front) {
		if (front.equals(this.ROJO)) {
			data.rotateRedFaceCounterClockwise();
		} else if (front.equals(this.AZUL)) {
			data.rotateBlueFaceCounterClockwise();
		} else if (front.equals(this.NARANJA)) {
			data.rotateOrangeFaceCounterClockwise();
		} else if (front.equals(this.VERDE)) {
			data.rotateGreenFaceCounterClockwise();
		}
	}

	public void uper() {
		data.rotateWhiteFaceClockwise();
	}

	public void upP() {
		data.rotateWhiteFaceCounterClockwise();
	}

	public void down() {
		data.rotateYellowFaceClockwise();
	}

	public void downP() {
		data.rotateYellowFaceCounterClockwise();
	}

	public Set<Pieza> getPiezas() {
		return this.data.getCubeSet();
	}

	public Set<Pieza> getAristas() {
		return null;
	}

	public void front() {
		// TODO Auto-generated method stub

	}

	public void setFrontByPieza(Pieza pieza) {
		if (pieza.estaEnCaraAzul()) {
			FRONT = this.data.getCentro(AZUL);
			RIGHT = this.data.getCentro(NARANJA);
			BACK = this.data.getCentro(VERDE);
			LEFT = this.data.getCentro(ROJO);
		} else if (pieza.estaEnCaraNaranja()) {
			FRONT = this.data.getCentro(NARANJA);
			RIGHT = this.data.getCentro(VERDE);
			BACK = this.data.getCentro(ROJO);
			LEFT = this.data.getCentro(AZUL);
		} else if (pieza.estaEnCaraVerde()) {
			FRONT = this.data.getCentro(VERDE);
			RIGHT = this.data.getCentro(ROJO);
			BACK = this.data.getCentro(AZUL);
			LEFT = this.data.getCentro(NARANJA);
		} else if (pieza.estaEnCaraRoja()) {
			FRONT = this.data.getCentro(ROJO);
			RIGHT = this.data.getCentro(AZUL);
			BACK = this.data.getCentro(NARANJA);
			LEFT = this.data.getCentro(VERDE);
		}
	}

	public Set<Pieza> buscarPieza(Color color) {
		Set<Pieza> piezas = new HashSet<Pieza>();
		for (Pieza pieza : this.data.getCubeSet()) {
			if (pieza.containsColor(color)) {
				
			}
		}
		return piezas;
	}
}