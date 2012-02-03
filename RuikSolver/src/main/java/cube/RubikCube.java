package cube;

import pieza.Pieza;

public class RubikCube {
	public RubikCubeData data;

	public RubikCube() {
		data = new RubikCubeData();
		data.createCube();
	}

	public void rotateRedFaceCounterClockwise() {
		for (Pieza pieza : data.getRedFace()) {
			pieza.yMenosZ();
		}
	}

	public void rotateBlueFaceCounterClockwise() {
		for (Pieza pieza : data.getBlueFace()) {
			pieza.menosXz();
		}
	}

	public void rotateYellowFaceCounterClockwise() {
		for (Pieza pieza : data.getYellowFace()) {
			pieza.menosXy();
		}
	}

	public void rotateGreenFaceCounterClockwise() {
		for (Pieza pieza : data.getGreenFace()) {
			pieza.xMenosZ();
		}
	}

	public void rotateWhiteFaceCounterClockwise() {
		for (Pieza pieza : data.getWhiteFace()) {
			pieza.xMenosY();
		}
	}

	public void rotateOrangeFaceCounterClockwise() {
		for (Pieza pieza : data.getOrangeFace()) {
			pieza.menosYz();
		}
	}
	
	public void rotateYellowFaceClockwise() {
		for (Pieza pieza : data.getYellowFace()) {
			pieza.xMenosY();
		}
	}

	public void rotateWhiteFaceClockwise() {
		for (Pieza pieza : data.getWhiteFace()) {
			pieza.menosXy();
		}
	}

	public void rotateRedFaceClockwise() {
		for (Pieza pieza : data.getRedFace()) {
			pieza.menosYz();

		}
	}

	public void rotateBlueFaceClockwise() {
		for (Pieza pieza : data.getBlueFace()) {
			pieza.xMenosZ();
		}
	}

	public void rotateOrangeFaceClockwise() {
		for (Pieza pieza : data.getOrangeFace()) {
			pieza.yMenosZ();
		}
	}

	public void rotateGreenFaceClockwise() {
		for (Pieza pieza : data.getGreenFace()) {
			pieza.menosXz();
		}
	}

}