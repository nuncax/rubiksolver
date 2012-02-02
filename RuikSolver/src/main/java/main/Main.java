package main;

import cube.RubikCube;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RubikCube cube = new RubikCube();

		cube.data.rotateWhiteFaceClockwise(cube);
		cube.data.rotateWhiteFaceCounterClockwise(cube);
		
		cube.data.rotateBlueFaceClockwise(cube);
		cube.data.rotateBlueFaceCounterClockwise(cube);

		cube.data.rotateGreenFaceClockwise(cube);
		cube.data.rotateGreenFaceCounterClockwise(cube);

		cube.data.rotateOrangeFaceClockwise(cube);
		cube.data.rotateOrangeFaceCounterClockwise(cube);

		cube.data.rotateRedFaceClockwise(cube);
		cube.data.rotateRedFaceCounterClockwise(cube);

		cube.data.rotateYellowFaceClockwise(cube);
		cube.data.rotateYellowFaceCounterClockwise(cube);

	}

}
