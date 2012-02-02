package cube;

import pieza.Pieza;

public class RubikCubeRotationsClockwise extends RubikCubeData {

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

}
