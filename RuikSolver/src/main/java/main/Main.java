package main;

import rubikCube.RubikCube;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RubikCube cube = new RubikCube();

		cube.rotateWhiteFaceClockwise(1);
		cube.rotateWhiteFaceCounterClockwise(1);
		
		cube.rotateBlueFaceClockwise(1);
		cube.rotateBlueFaceCounterClockwise(1);

		cube.rotateGreenFaceClockwise(1);
		cube.rotateGreenFaceCounterClockwise(1);

		cube.rotateOrangeFaceClockwise(1);
		cube.rotateOrangeFaceCounterClockwise(1);

		cube.rotateRedFaceClockwise(1);
		cube.rotateRedFaceCounterClockwise(1);

		cube.rotateYellowFaceClockwise(1);
		cube.rotateYellowFaceCounterClockwise(1);

	}

}
