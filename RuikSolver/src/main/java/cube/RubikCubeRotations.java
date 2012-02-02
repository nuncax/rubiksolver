package cube;

import pieza.Pieza;

public class RubikCubeRotations {
	private RubikCubeData cubeData;

	public void rotateYellowFaceClockwise() {
		for (Pieza pieza : cubeData.getYellowFace()) {
			pieza.xMenosY();
		}
	}
	public void rotateWhiteFaceClockwise() {
		for (Pieza pieza : cubeData.getWhiteFace()) {
			pieza.menosXy();
		}
	}

	public void rotateRedFaceClockwise() {
		for (Pieza pieza : cubeData.getRedFace()) {
			pieza.menosYz();

		}
	}

	public void rotateRedFaceCounterClockwise() {
		for (Pieza pieza : cubeData.getRedFace()) {
			pieza.yMenosZ();
		}
	}

	public void rotateBlueFaceClockwise() {
		for (Pieza pieza : cubeData.getBlueFace()) {
			pieza.xMenosZ();
		}
	}

	public void rotateBlueFaceCounterClockwise() {
		for (Pieza pieza : cubeData.getBlueFace()) {
			pieza.menosXz();
		}
	}

	public void rotateOrangeFaceClockwise() {
		for (Pieza pieza : cubeData.getOrangeFace()) {
			pieza.yMenosZ();
		}
	}

	public void rotateOrangeFaceCounterClockwise() {
		for (Pieza pieza : cubeData.getOrangeFace()) {
			pieza.menosYz();
		}
	}

	public void rotateGreenFaceClockwise() {
		for (Pieza pieza : cubeData.getGreenFace()) {
			pieza.menosXz();
		}
	}

	public void rotateGreenFaceCounterClockwise() {
		for (Pieza pieza : cubeData.getGreenFace()) {
			pieza.xMenosZ();
		}
	}

	public void rotateYellowFaceCounterClockwise() {
		for (Pieza pieza : cubeData.getYellowFace()) {
			pieza.menosXy();
		}
	}

	public void rotateWhiteFaceCounterClockwise() {
		for (Pieza pieza : cubeData.getWhiteFace()) {
			pieza.xMenosY();
		}
	}
}
