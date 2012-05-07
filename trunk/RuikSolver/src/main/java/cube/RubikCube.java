package cube;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import frame.MyJtexPane;
import frame.VentanaPpal;
import observer.IObserver;
import pieza.Arista;
import pieza.Centro;
import pieza.Color;
import pieza.Pieza;
import pieza.Vertice;

public class RubikCube {
	private List<Pieza> piezas;

	public List<Pieza> getPiezas() {
		return piezas;
	}

	public Color front_face;
	public Color right_face;
	public Color left_face;
	public Color up_face;
	public Color down_face;
	public Color back_face;

	public RubikCube() {
		RubikCubeData data = new RubikCubeData();
		this.piezas = data.createCube();
		this.down_face = Color.YELLOW;
		this.front_face = Color.BLUE;
		this.right_face = Color.ORANGE;
		this.back_face = Color.GREEN;
		this.left_face = Color.RED;
		this.up_face = Color.WHITE;
	}

	IObserver observer;

	public void addObservador(IObserver observer) {
		this.observer = observer;
	}

	public void right(int signo) {
		rotateFaceClockwise(right_face, signo);
	}

	public void left(int signo) {
		rotateFaceClockwise(left_face, signo);
	}

	public void front(int signo) {
		rotateFaceClockwise(front_face, signo);
	}

	public void back(int signo) {
		rotateFaceClockwise(back_face, signo);

	}

	public void uper(int signo) {
		rotateFaceClockwise(up_face, signo);
	}

	public void down(int signo) {
		rotateFaceClockwise(down_face, signo);
	}

	public List<Pieza> get(Class<?> class1) {
		class1.asSubclass(Centro.class);
		List<Pieza> piezasRes = new ArrayList<Pieza>();
		for (Pieza pieza : this.piezas) {
			if (pieza.getClass().equals(class1)) {
				piezasRes.add(pieza);
			}
		}
		return piezasRes;
	}

	public List<Arista> getAristas() {
		List<Arista> piezasRes = new ArrayList<Arista>();
		for (Pieza pieza : this.piezas) {
			if (pieza instanceof Arista) {
				Arista aristaRes = (Arista) pieza;
				piezasRes.add(aristaRes);
			}
		}
		return piezasRes;
	}

	private List<Vertice> getVertices() {
		List<Vertice> piezasRes = new ArrayList<Vertice>();
		for (Pieza pieza : this.piezas) {
			if (pieza instanceof Vertice) {
				Vertice vertice = (Vertice) pieza;
				piezasRes.add(vertice);
			}
		}
		return piezasRes;
	}

	private List<Centro> getCentros() {
		List<Centro> piezasRes = new ArrayList<Centro>();
		for (Pieza pieza : this.piezas) {
			if (pieza instanceof Centro) {
				Centro aristaRes = (Centro) pieza;
				piezasRes.add(aristaRes);
			}
		}
		return piezasRes;
	}

	// private List<Pieza> buscarPiezas(Color color) {
	// List<Pieza> piezas = new ArrayList<Pieza>();
	// for (Pieza pieza : this.piezas) {
	// if (pieza.pertenece(color)) {
	// piezas.add(pieza);
	// }
	// }
	// return piezas;
	// }

	public List<Pieza> getFace(Color color) {
		List<Pieza> face = new ArrayList<Pieza>();
		for (Pieza pieza : this.piezas) {
			if (pieza.estaEnCara(color) && !(pieza instanceof Centro)) {
				face.add(pieza);
			}
		}
		return face;
	}

	public List<Arista> buscarAristas(Color color) {
		List<Arista> piezas = new ArrayList<Arista>();
		for (Arista arista : this.getAristas()) {
			if (arista.pertenece(color)) {
				piezas.add(arista);
			}
		}
		return piezas;
	}

	public List<Vertice> buscarVertices(Color color) {
		List<Vertice> piezas = new ArrayList<Vertice>();
		for (Vertice vertice : this.getVertices()) {
			if (vertice.pertenece(color)) {
				piezas.add(vertice);
			}
		}
		return piezas;
	}

	private Centro getCentro(Color color) {
		Centro centroRes = null;
		for (Centro centro : this.getCentros()) {
			if (centro.getColor().equals(color)) {
				centroRes = centro;
			}
		}
		return centroRes;
	}

	public void setFrontByFace(Color cara) {
		Color colorAux;
		if (!cara.equals(front_face)) {
			if (cara.equals(right_face)) {
				colorAux = front_face;
				front_face = right_face;
				right_face = back_face;
				back_face = left_face;
				left_face = colorAux;
			} else if (cara.equals(back_face)) {
				colorAux = front_face;
				front_face = back_face;
				back_face = colorAux;

				colorAux = right_face;
				right_face = left_face;
				left_face = colorAux;
			} else if (cara.equals(left_face)) {
				colorAux = front_face;

				front_face = left_face;
				left_face = back_face;
				back_face = right_face;
				right_face = colorAux;
			}
		}

	}

	public void setFrontByPieza(Pieza pieza) {
		Color colorAux;
		if (!pieza.estaEnCara(front_face)) {
			if (pieza.estaEnCara(right_face)) {
				colorAux = front_face;
				front_face = right_face;
				right_face = back_face;
				back_face = left_face;
				left_face = colorAux;
			} else if (pieza.estaEnCara(back_face)) {
				colorAux = front_face;
				front_face = back_face;
				back_face = colorAux;

				colorAux = right_face;
				right_face = left_face;
				left_face = colorAux;
			} else if (pieza.estaEnCara(left_face)) {
				colorAux = front_face;

				front_face = left_face;
				left_face = back_face;
				back_face = right_face;
				right_face = colorAux;
			}
		}
	}

	public void setPositions()  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(this
				.getClass().getClassLoader().getResourceAsStream("datos.txt")));
		MyJtexPane.insert("*Cubo Notepad*", MyJtexPane.DEFAULT_STYLE);
		String cad = new String();
		try {
			cad = bf.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int signo = 1;

		String[] arrayMovimientos = cad.split(",");

		for (int i = 0; i < arrayMovimientos.length; i++) {
			if (arrayMovimientos[i].length() == 2 && arrayMovimientos[i].endsWith("P")) {
				signo = -1;
			}
			if (arrayMovimientos[i].startsWith("R")) {
				this.right(signo);
			} else if (arrayMovimientos[i].startsWith("L")) {
				this.left(signo);
			} else if (arrayMovimientos[i].startsWith("F")) {
				this.front(signo);
			} else if (arrayMovimientos[i].startsWith("B")) {
				this.back(signo);
			} else if (arrayMovimientos[i].startsWith("U")) {
				this.uper(signo);
			} else if (arrayMovimientos[i].startsWith("D")) {
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

		// VentanaPpal.textPane.append("*Cubo aleatorio" + "*\n");
		MyJtexPane.insert("*Cubo aleatorio*", MyJtexPane.DEFAULT_STYLE);

		// VentanaPpal.textPane.append("\n");

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

	public void rotateFaceClockwise(Color color, int signo) {
		// System.out.println("Gira la cara " + color + " " + signo);

		String signoStr = "Sentido Anti-horario";

		if (signo == 1) {
			signoStr = "Sentido horario";
		}
		VentanaPpal.numGiros++;
		// VentanaPpal.textPane.append(VentanaPpal.numGiros + " " + "Cara "
		// + color + " " + signoStr + "\n");

		MyJtexPane.insert(VentanaPpal.numGiros + " ", MyJtexPane.NUMBER_STYLE);

		MyJtexPane.insert("Cara " + color + " " + signoStr,
				getColorStyle(color));

		int[][] matriz = getCentro(color).getMatriz(signo);
		for (Pieza pieza : getFace(color)) {
			pieza.multiplicar(matriz);
		}
		this.observer.observa(piezas);
	}

	private String getColorStyle(Color color) {
		String colorRes = null;
		if (color.equals(Color.WHITE)) {
			colorRes = MyJtexPane.WHITE_STYLE;
		} else if (color.equals(Color.YELLOW)) {
			colorRes = MyJtexPane.YELLOW_STYLE;
		} else if (color.equals(Color.ORANGE)) {
			colorRes = MyJtexPane.ORANGE_STYLE;
		} else if (color.equals(Color.GREEN)) {
			colorRes = MyJtexPane.GREEN_STYLE;
		} else if (color.equals(Color.RED)) {
			colorRes = MyJtexPane.RED_STYLE;
		} else if (color.equals(Color.BLUE)) {
			colorRes = MyJtexPane.BLUE_STYLE;
		}
		return colorRes;
	}
}