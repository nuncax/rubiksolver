package main;

import cube.RubikCube;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RubikCube cube = new RubikCube();

		cube.rotateWhiteFaceClockwise();
		cube.rotateWhiteFaceCounterClockwise();
		
		cube.rotateBlueFaceClockwise();
		cube.rotateBlueFaceCounterClockwise();

		cube.rotateGreenFaceClockwise();
		cube.rotateGreenFaceCounterClockwise();

		cube.rotateOrangeFaceClockwise();
		cube.rotateOrangeFaceCounterClockwise();

		cube.rotateRedFaceClockwise();
		cube.rotateRedFaceCounterClockwise();

		cube.rotateYellowFaceClockwise();
		cube.rotateYellowFaceCounterClockwise();

	}

}
