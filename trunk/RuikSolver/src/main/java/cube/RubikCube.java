package cube;

import java.util.Set;

import color.Color;
import pieza.Pieza;

public class RubikCube {
	private final RubikCubeData data;

	public final Color AZUL = new Color("AZUL");
	public final Color NARANJA = new Color("naranja");
	public final Color ROJO = new Color("rojo");
	public final Color BLANCO = new Color("blanco");
	// private final Color AMARILLO = new Color("amarillo");
	public final Color VERDE = new Color("verde");

	public RubikCube() {
		data = new RubikCubeData();
		data.createCube();
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
}