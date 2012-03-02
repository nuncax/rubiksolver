package cube;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import color.Color;
import pieza.Pieza;

public class RubikCube {
	private final RubikCubeData data;

	public Pieza front_center;
	public Pieza right_center;
	public Pieza left_center;
	public Pieza up_center;
	public Pieza down_center;
	public Pieza back_center;

	private final Color AZUL = new Color("azul");
	private final Color NARANJA = new Color("naranja");
	private final Color ROJO = new Color("rojo");
	private final Color BLANCO = new Color("blanco");
	private final Color AMARILLO = new Color("amarillo");
	private final Color VERDE = new Color("verde");

	public RubikCube() {
		data = new RubikCubeData();
		data.createCube();
		this.down_center = data.getCentro(AMARILLO);
		this.front_center = data.getCentro(AZUL);
		this.right_center = data.getCentro(NARANJA);
		this.back_center = data.getCentro(VERDE);
		this.left_center = data.getCentro(ROJO);
		this.up_center = data.getCentro(BLANCO);
	}

	public void right(int signo) {
		data.rotateFaceClockwise(right_center, signo);
	}

	public void left(int signo) {
		data.rotateFaceClockwise(left_center, signo);
	}

	public void front(int signo) {
		data.rotateFaceClockwise(front_center, signo);
	}

	private void back(int signo) {
		data.rotateFaceClockwise(back_center, signo);

	}

	public void uper(int signo) {
		data.rotateFaceClockwise(up_center, signo);
	}

	public void down(int signo) {
		data.rotateFaceClockwise(down_center, signo);
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

	private Set<Pieza> getVertices() {
		Set<Pieza> piezasRes = new HashSet<Pieza>();
		for (Pieza pieza : getPiezas()) {
			if (pieza.esVertice()) {
				piezasRes.add(pieza);
			}
		}
		return piezasRes;
	}

	public void setFrontByPieza(Pieza pieza) {
		Pieza piezaAux;
		if (!pieza.estaEnCara(front_center)) {
			if (pieza.estaEnCara(right_center)) {
				piezaAux = front_center;
				front_center = right_center;
				right_center = back_center;
				back_center = left_center;
				left_center = piezaAux;
			} else if (pieza.estaEnCara(back_center)) {
				piezaAux = front_center;
				front_center = back_center;
				back_center = piezaAux;

				piezaAux = right_center;
				right_center = left_center;
				left_center = piezaAux;
			} else if (pieza.estaEnCara(left_center)) {
				piezaAux = front_center;

				front_center = left_center;
				left_center = back_center;
				back_center = right_center;
				right_center = piezaAux;
			}
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

	// public Set<Pieza> buscarAristas(Color color) {
	// Set<Pieza> piezaRes = new HashSet<Pieza>();
	// for (Pieza pieza : this.getAristas()) {
	// if (pieza.pernetece(color)) {
	// piezaRes.add(pieza);
	// }
	// }
	// return piezaRes;
	// }

	public Set<Pieza> buscarAristasDeUp() {
		Set<Pieza> piezaRes = new HashSet<Pieza>();
		for (Pieza pieza : this.getAristas()) {
			if (pieza.pertenece(this.up_center)) {
				piezaRes.add(pieza);
			}
		}
		return piezaRes;
	}

	public Set<Pieza> buscarVerticesDeUp() {
		Set<Pieza> piezaRes = new HashSet<Pieza>();
		for (Pieza pieza : this.getVertices()) {
			if (pieza.pertenece(this.up_center)) {
				piezaRes.add(pieza);
			}
		}
		return piezaRes;
	}

	public void setPositions() throws IOException {
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

	private int tirar(int n) {
		Random dado = new Random();
		dado.setSeed(new Date().getTime());
		return dado.nextInt(n);
	}

	public void scramble() {
		int aux = 6;
		int vecesQueGiro = 10;
		int queGiro = tirar(5);
		for (int i = 0; i < vecesQueGiro; i++) {
			while (queGiro == aux) {
				queGiro = tirar(5);
			}
			aux = queGiro;
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
				this.back(1);
				break;
			default:
				break;
			}
		}

	}

	public Set<Pieza> buscarAristasNoUp() {
		Set<Pieza> piezaRes = new HashSet<Pieza>();
		for (Pieza pieza : this.getAristas()) {
			if (!pieza.pertenece(this.up_center) && !pieza.pertenece(this.down_center)) {
				piezaRes.add(pieza);
			}
		}
		return piezaRes;

	}

	public List<Pieza> buscarVerticesDeDonw() {
		List<Pieza> piezaRes = new ArrayList<Pieza>();
		for (Pieza pieza : this.getVertices()) {
			if (pieza.pertenece(this.down_center)) {
				piezaRes.add(pieza);
			}
		}
		return piezaRes;
	}
}