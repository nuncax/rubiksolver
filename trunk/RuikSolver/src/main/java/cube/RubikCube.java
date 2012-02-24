package cube;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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

	public void right(int signo) {
		data.rotateFaceClockwise(RIGHT, signo);
	}

	public void left(int signo) {
		data.rotateFaceClockwise(LEFT, signo);
	}

	public void front(int signo) {
		data.rotateFaceClockwise(FRONT, signo);
	}

	private void back(int signo) {
		data.rotateFaceClockwise(BACK, signo);

	}

	public void uper(int signo) {
		data.rotateFaceClockwise(UP, signo);
	}

	public void down(int signo) {
		data.rotateFaceClockwise(DONW, signo);
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
			LEFT = BACK;
			BACK = RIGHT;
			RIGHT = piezaAux;
		}
	}

	public Set<Pieza> buscarPieza(Color color) {
		Set<Pieza> piezas = new HashSet<Pieza>();
		for (Pieza pieza : this.data.getCubeSet()) {
			if (pieza.getColorPuntero().equals(color)) {
				piezas.add(pieza);
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

	public void SetPositions() throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("datos.txt"));
		String sCadena;
		while ((sCadena = bf.readLine()) != null) {
			int signo = 1;
			System.out.println(sCadena);

			if (sCadena.length() == 2 && sCadena.endsWith("P")) {
				signo = -1;
			}
			if (sCadena.startsWith("R")) {
				this.right(signo);
			} else if (sCadena.startsWith("L")) {
				this.left(signo);
			} else if (sCadena.startsWith("F")) {
				this.front(signo);
			} else if (sCadena.startsWith("B")) {
				this.back(signo);
			} else if (sCadena.startsWith("U")) {
				this.uper(signo);
			} else if (sCadena.startsWith("D")) {
				this.down(signo);
			}

		}
	}

	public void scramble() {
		// TODO
		Random dado = new Random();
		dado.setSeed(new Date().getTime());
		int vecesQueGiro = dado.nextInt(1000);

		for (int i = 0; i < vecesQueGiro; i++) {
			dado.setSeed(new Date().getTime());
			int queGiro = dado.nextInt(5);
			for (int j = 0; j < queGiro; j++) {
				switch (queGiro) {
				case 1:
					this.right(1);
					break;
				case 2:
					this.front(1);
					break;
				case 3:
					this.left(1);
					break;
				case 4:
					this.uper(1);
					break;
				case 5:
					this.down(1);
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