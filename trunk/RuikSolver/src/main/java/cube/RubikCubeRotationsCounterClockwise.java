package cube;

import pieza.Pieza;

public class RubikCubeRotationsCounterClockwise extends RubikCubeData {

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
		for (Pieza pieza : getWhiteFace()) {
			pieza.xMenosY();
		}
	}

	public void rotateOrangeFaceCounterClockwise() {
		for (Pieza pieza : this.getOrangeFace()) {
			pieza.menosYz();
		}
	}

}
