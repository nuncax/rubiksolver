package cube;

import java.util.Set;

import color.Color;
import pieza.Pieza;

public class RubikCube {
	public RubikCubeData data;

	public RubikCube() {
		data = new RubikCubeData();
		data.createCube();
	}

	public void R(Color front) {
		switch (front.toString()) {
		case "rojo":
			data.rotateBlueFaceClockwise();
			break;
		case "azul":
			data.rotateOrangeFaceClockwise();
			break;
		case "naranja":
			data.rotateGreenFaceClockwise();
			break;
		case "verde":
			data.rotateRedFaceClockwise();
			break;
		default:
			break;
		}
	}

	public void Rp(Color front) {
		switch (front.toString()) {
		case "rojo":
			data.rotateBlueFaceCounterClockwise();
			break;
		case "azul":
			data.rotateOrangeFaceCounterClockwise();
			break;
		case "naranja":
			data.rotateGreenFaceCounterClockwise();
			break;
		case "verde":
			data.rotateRedFaceCounterClockwise();
			break;
		default:
			break;
		}
	}
	public void L(Color front) {
		switch (front.toString()) {
		case "rojo":
			data.rotateGreenFaceClockwise();
			break;
		case "azul":
			data.rotateRedFaceClockwise();
			break;
		case "naranja":
			data.rotateBlueFaceClockwise();
			break;
		case "verde":
			data.rotateOrangeFaceClockwise();
			break;
		default:
			break;
		}
	}
	public void Lp(Color front) {
		switch (front.toString()) {
		case "rojo":
			data.rotateGreenFaceCounterClockwise();
			break;
		case "azul":
			data.rotateRedFaceCounterClockwise();
			break;
		case "naranja":
			data.rotateBlueFaceCounterClockwise();
			break;
		case "verde":
			data.rotateOrangeFaceCounterClockwise();
			break;
		default:
			break;
		}
	}
	public void U() {
		data.rotateWhiteFaceClockwise();
	}
	public void Up() {
		data.rotateWhiteFaceCounterClockwise();
	}
	public void D() {
		data.rotateYellowFaceClockwise();
	}
	public void Dp() {
		data.rotateYellowFaceCounterClockwise();
	}
	public Set<Pieza> getPiezas(){
		return this.getPiezas();
		
	}

	public Set<Pieza> getAristas() {
		
		return null;
	}
}