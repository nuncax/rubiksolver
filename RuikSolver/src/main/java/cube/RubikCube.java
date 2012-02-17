package cube;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import color.Color;
import pieza.Pieza;

public class RubikCube {
	private final RubikCubeData data;

	public Pieza FRONT;
	public Pieza RIGHT;
	public Pieza LEFT;
	public Pieza UP;
	public Pieza DONW;
	public Pieza BACK;

	private final Color AZUL = new Color("azul");
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

	public void right() {
		if (FRONT.isBlue()) {
			data.rotateOrangeFaceClockwise();
		} else if (FRONT.isGreen()) {
			data.rotateRedFaceClockwise();
		} else if (FRONT.isOrange()) {
			data.rotateGreenFaceClockwise();
		} else if (FRONT.isRed()) {
			data.rotateBlueFaceClockwise();
		}
	}

	public void rightP() {
		if (FRONT.isBlue()) {
			data.rotateOrangeFaceCounterClockwise();
		} else if (FRONT.isGreen()) {
			data.rotateRedFaceCounterClockwise();
		} else if (FRONT.isOrange()) {
			data.rotateGreenFaceCounterClockwise();
		} else if (FRONT.isRed()) {
			data.rotateBlueFaceCounterClockwise();
		}
	}

	public void left() {
		if (FRONT.isBlue()) {
			data.rotateRedFaceClockwise();
		} else if (FRONT.isGreen()) {
			data.rotateOrangeFaceClockwise();
		} else if (FRONT.isOrange()) {
			data.rotateBlueFaceClockwise();
		} else if (FRONT.isRed()) {
			data.rotateGreenFaceClockwise();
		}
	}

	public void leftP(Color front) {
		if (FRONT.isBlue()) {
			data.rotateRedFaceCounterClockwise();
		} else if (FRONT.isGreen()) {
			data.rotateOrangeFaceCounterClockwise();
		} else if (FRONT.isOrange()) {
			data.rotateBlueFaceCounterClockwise();
		} else if (FRONT.isRed()) {
			data.rotateGreenFaceCounterClockwise();
		}
	}

	public void front() {
		if (FRONT.isBlue()) {
			this.data.rotateBlueFaceClockwise();
		} else if (FRONT.isGreen()) {
			this.data.rotateGreenFaceClockwise();
		} else if (FRONT.isOrange()) {
			this.data.rotateOrangeFaceClockwise();
		} else if (FRONT.isRed()) {
			this.data.rotateRedFaceClockwise();
		}
	}

	public void frontP() {
		if (FRONT.isBlue()) {
			this.data.rotateBlueFaceCounterClockwise();
		} else if (FRONT.isGreen()) {
			this.data.rotateGreenFaceCounterClockwise();
		} else if (FRONT.isOrange()) {
			this.data.rotateOrangeFaceCounterClockwise();
		} else if (FRONT.isRed()) {
			this.data.rotateRedFaceCounterClockwise();
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

	public List<Pieza> getPiezas() {
		return this.data.getCubeSet();
	}

	public Set<Pieza> getAristas() {
		Set<Pieza> piezasRes = new HashSet<Pieza>();
		for (Pieza pieza : getPiezas()) {
			if (pieza.esArista()) {
				piezasRes.add(pieza);
			}
		}
		return piezasRes;
	}

	public void setFrontByPieza(Pieza pieza) {
		Pieza piezaAux;
		if (pieza.estaEnCara(RIGHT)) {
			piezaAux = FRONT;
			FRONT = RIGHT;
			RIGHT = BACK;
			BACK = LEFT;
			LEFT = piezaAux;
		} else if (pieza.estaEnCara(BACK)) {
			piezaAux = FRONT;
			FRONT = BACK;
			BACK = piezaAux;

			piezaAux = RIGHT;
			RIGHT = LEFT;
			LEFT = piezaAux;
		} else if (pieza.estaEnCara(LEFT)) {
			piezaAux = FRONT;
			FRONT = LEFT;
			RIGHT = BACK;
			BACK = LEFT;
			LEFT = piezaAux;
		}
	}

	public Set<Pieza> buscarPieza(Color color) {
		Set<Pieza> piezas = new HashSet<Pieza>();
		for (Pieza pieza : this.data.getCubeSet()) {
			if (pieza.getColorPuntero().equals(color)) {

			}
		}
		return piezas;
	}

	public Set<Pieza> buscarAristas(Color color) {
		Set<Pieza> piezaRes = new HashSet<Pieza>();
		for (Pieza pieza : this.getAristas()) {
			if (pieza.containsColor(color)) {
				piezaRes.add(pieza);
			}
		}
		return piezaRes;
	}

	public Set<Pieza> buscarAristasDeUp() {
		Set<Pieza> piezaRes = new HashSet<Pieza>();
		for (Pieza pieza : this.getAristas()) {
			if (pieza.containsColor(this.UP.getColorPuntero())) {
				piezaRes.add(pieza);
			}
		}
		return piezaRes;
	}

	public void scramble() {
		//TODO
		Random dado = new Random();
		dado.setSeed(new Date().getTime());
		int vecesQueGiro = dado.nextInt(1000);

		for (int i = 0; i < vecesQueGiro; i++) {
			dado.setSeed(new Date().getTime());
			int queGiro = dado.nextInt(5);
			for (int j = 0; j < queGiro; j++) {
				switch (queGiro) {
				case 1:
					this.right();
					break;
				case 2:
					this.front();
					break;
				case 3:
					this.left();
					break;
				case 4:
					this.uper();
					break;
				case 5:
					this.down();
					break;
				case 0:
					// this.b
					break;

				default:
					break;
				}
			}
		}

	}
}