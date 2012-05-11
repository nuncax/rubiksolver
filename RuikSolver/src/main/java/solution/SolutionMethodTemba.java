package solution;

import java.util.List;
import pieza.Arista;
import pieza.Color;
import pieza.Pieza;
import pieza.Stick;
import pieza.Vertice;
import cube.RubikCube;
import frame.MyJtexPane;
import frame.VentanaPpal;

public class SolutionMethodTemba {

	private final RubikCube rubikCube;

	public SolutionMethodTemba(RubikCube cube) {
		this.rubikCube = cube;
	}

	public void solucionar() {
		// TODO
		resolverCruz();
		resolverEsquinas();
		segundaCapa();
		colocarEsquinasDeDown();
		colocarEsquinaDownEnPos();
		colocarAristasDeDown();
	}

	private void colocarAristasDeDown() {

		MyJtexPane.insert("*Colocando Aristas inferioes*:",
				MyJtexPane.DEFAULT_STYLE);

		List<Arista> piezas = this.rubikCube
				.buscarAristas(this.rubikCube.down_face);
		int num = 0;

		for (Arista arista : piezas) {
			if (arista.estaPosicionado()) {
				num++;
			}
		}

		while (!fin()) {

			switch (num) {
			case 0:
				ceroAuno();
				break;
			case 1:
				unoAdos();
				break;
			case 4:
				cuatro();
				break;

			default:
				break;
			}
			num = 0;
			for (Arista arista : piezas) {
				if (arista.estaPosicionado()) {
					num++;
				}
			}
		}

	}

	private boolean fin() {
		boolean fin = true;
		List<Arista> piezas = this.rubikCube
				.buscarAristas(this.rubikCube.down_face);
		for (Arista arista : piezas) {
			if (!arista.estaOrientada()) {
				fin = false;
			}
		}

		return fin;
	}

	private void cuatro() {
		// horario();
		// antiHorario();
		// rubikCube.setFrontByFace(this.rubikCube.left_face);

		Arista aristaLeft = getAristaInferior(this.rubikCube.left_face);
		Arista aristaBack = getAristaInferior(this.rubikCube.back_face);
		Arista aristaRight = getAristaInferior(this.rubikCube.right_face);

		while ((aristaRight.estaOrientada() || aristaBack.estaOrientada())
				&& (aristaRight.estaOrientada() || aristaLeft.estaOrientada())) {
			this.rubikCube.setFrontByFace(this.rubikCube.right_face);
			aristaRight = getAristaInferior(this.rubikCube.right_face);
			aristaLeft = getAristaInferior(this.rubikCube.left_face);
			aristaBack = getAristaInferior(this.rubikCube.back_face);
		}
		if ((aristaRight.estaOrientada() || aristaBack.estaOrientada())) {
			horario();
			antiHorario();
		} else if (aristaRight.estaOrientada() || aristaLeft.estaOrientada()) {
			antiHorario();
			horario();
		} else {
			// caso en el estan las 4 posicionadas xo no orientadas
			horario();
			antiHorario();
		}
	}

	private void ceroAuno() {
		Arista aristaBack = this.getAristaInferior(this.rubikCube.back_face);

		if (aristaBack.pertenece(rubikCube.right_face)) {
			antiHorario();
		} else if (aristaBack.pertenece(rubikCube.left_face)) {
			horario();
		} else if (aristaBack.pertenece(rubikCube.front_face)) {
			antiHorario();
		}

	}

	private void unoAdos() {

		Arista aristaFront = this.getAristaInferior(this.rubikCube.front_face);

		while (!aristaFront.estaPosicionado()) {
			this.rubikCube.setFrontByFace(this.rubikCube.right_face);
			aristaFront = this.getAristaInferior(this.rubikCube.front_face);
		}

		ceroAuno();
	}

	private void horario() {
		rubikCube.front(1);
		rubikCube.left(1);
		rubikCube.back(-1);
		rubikCube.left(-1);
		rubikCube.front(-1);
		rubikCube.back(1);
		rubikCube.down(1);
		rubikCube.back(1);
		rubikCube.down(-1);
		rubikCube.back(-1);
	}

	private void antiHorario() {
		rubikCube.right(1);
		rubikCube.left(-1);
		rubikCube.front(-1);
		rubikCube.right(-1);
		rubikCube.left(1);
		rubikCube.down(1);
		rubikCube.down(1);
		rubikCube.right(1);
		rubikCube.left(-1);
		rubikCube.front(-1);
		rubikCube.right(-1);
		rubikCube.left(1);
	}

	private Arista getAristaInferior(Color color) {
		List<Arista> piezas = this.rubikCube
				.buscarAristas(this.rubikCube.down_face);
		Arista aristaRes = null;
		for (Arista arista : piezas) {
			if (arista.estaEnCara(color)) {
				aristaRes = arista;
			}
		}

		return aristaRes;
	}

	// private Arista getAristaPosicionada() {
	// Arista aristaRes = null;
	// Iterator<Arista> iterator = this.rubikCube.buscarAristas(
	// this.rubikCube.down_face).iterator();
	// boolean enc = false;
	//
	// while (iterator.hasNext() && !enc) {
	// Arista arista = iterator.next();
	// if (!arista.estaPosicionado())
	// aristaRes = arista;
	// enc = true;
	// }
	// return aristaRes;
	// }

	private void resolverCruz() {

		MyJtexPane.insert("*Resolviendo cruz:*", MyJtexPane.DEFAULT_STYLE);

		List<Arista> piezas = this.rubikCube
				.buscarAristas(this.rubikCube.up_face);
		for (Arista arista : piezas) {
			ponerAristaEnPosicionCruz(arista);
		}
	}

	private void ponerAristaEnPosicionCruz(Arista arista) {
		if (!arista.estaOrientada()) {

			MyJtexPane.insert("Colocando Arista:" + arista,
					MyJtexPane.SUB_STYLE);

			bajarArista(arista);
			llevarAsuCara(arista);
			subirArista(arista);
		}
	}

	private void bajarArista(Arista arista) {
		this.rubikCube.setFrontByPieza(arista);
		// TODO refinar
		if (!arista.estaEnCara(this.rubikCube.down_face)) {
			// System.out.println("*Bajando pieza*");
			if (arista.estaEnCara(this.rubikCube.right_face)) {
				rubikCube.front(1);
				rubikCube.down(1);
				rubikCube.front(-1);
				rubikCube.down(-1);
			} else if (arista.estaEnCara(this.rubikCube.left_face)) {
				rubikCube.front(-1);
				rubikCube.down(1);
				rubikCube.front(1);
				rubikCube.down(-1);
			} else {
				rubikCube.front(-1);
				rubikCube.front(-1);
			}
		}
	}

	private void llevarAsuCara(Arista pieza) {
		// TODO this.rubikCube.front_face.equals(stick.getColor())
		// System.out.println("Llevando a su cara");
		Stick stick = pieza.getStickQueApunta(this.rubikCube.front_face);
		// if (stick != null) {
		if (stick != null && this.rubikCube.front_face.equals(stick.getColor())) {

		} else if (stick != null
				&& this.rubikCube.right_face.equals(stick.getColor())) {
			rubikCube.down(1);
		} else if (stick != null
				&& this.rubikCube.left_face.equals(stick.getColor())) {
			rubikCube.down(-1);
		} else if (stick != null
				&& this.rubikCube.back_face.equals(stick.getColor())) {
			rubikCube.down(1);
			rubikCube.down(1);
		} else
		// } else {
		if (pieza.pertenece(this.rubikCube.left_face)) {
			rubikCube.down(-1);
		} else if (pieza.pertenece(this.rubikCube.right_face)) {
			rubikCube.down(1);
		} else if (pieza.pertenece(this.rubikCube.back_face)) {
			rubikCube.down(1);
			rubikCube.down(1);
		}
		// }
		rubikCube.setFrontByPieza(pieza);
	}

	private void subirArista(Arista pieza) {
		// System.out.println("Colocando subiendo pieza");
		if (pieza.esPar(this.rubikCube.front_face)) {
			rubikCube.front(1);
			rubikCube.front(1);
		} else {
			rubikCube.down(1);
			rubikCube.right(1);
			rubikCube.front(-1);
			rubikCube.right(-1);
		}
	}

	private void colocarEsquinasDeDown() {

		MyJtexPane.insert("*Colocando esquinas inferiores:*",
				MyJtexPane.DEFAULT_STYLE);

		Vertice vertice = getVerticeInferiorDerecho(this.rubikCube.front_face);
		Vertice vertice2 = getVerticeInferiorIaquierdo(this.rubikCube.front_face);

		while (!sonVecinos(vertice, vertice2)) {
			this.rubikCube.setFrontByFace(this.rubikCube.right_face);
			vertice = getVerticeInferiorDerecho(this.rubikCube.front_face);
			vertice2 = getVerticeInferiorIaquierdo(this.rubikCube.front_face);
		}

		// if (!tieneVerticesVecinos(rubikCube.front_face)) {
		// if (tieneVerticesVecinos(rubikCube.right_face)) {
		// color = rubikCube.right_face;
		// } else if (tieneVerticesVecinos(rubikCube.left_face)) {
		// color = rubikCube.left_face;
		// } else if (tieneVerticesVecinos(rubikCube.back_face)) {
		// color = rubikCube.back_face;
		// }
		// rubikCube.setFrontByFace(color);
		// }

		Color colorVecino = getColorVecino(vertice, vertice2);

		if (!colorVecino.equals(rubikCube.front_face)) {
			if (colorVecino.equals(rubikCube.right_face)) {
				rubikCube.down(+1);
			} else if (colorVecino.equals(rubikCube.left_face)) {
				rubikCube.down(-1);
			} else if (colorVecino.equals(rubikCube.back_face)) {
				rubikCube.down(+1);
				rubikCube.down(+1);
			}
			rubikCube.setFrontByFace(colorVecino);
		}

		if (!vertice.estaPosicionado()) {
			this.rubikCube.right(-1);
			this.rubikCube.down(-1);
			this.rubikCube.right(1);
			this.rubikCube.front(1);
			this.rubikCube.down(1);
			this.rubikCube.front(-1);
			this.rubikCube.right(-1);
			this.rubikCube.down(1);
			this.rubikCube.right(1);
			this.rubikCube.down(1);
			this.rubikCube.down(1);
		}

		rubikCube.setFrontByFace(this.rubikCube.back_face);

		vertice = getVerticeInferiorDerecho(this.rubikCube.front_face);
		vertice2 = getVerticeInferiorIaquierdo(this.rubikCube.front_face);

		if (!vertice.estaPosicionado()) {
			this.rubikCube.right(-1);
			this.rubikCube.down(-1);
			this.rubikCube.right(1);
			this.rubikCube.front(1);
			this.rubikCube.down(1);
			this.rubikCube.front(-1);
			this.rubikCube.right(-1);
			this.rubikCube.down(1);
			this.rubikCube.right(1);
			this.rubikCube.down(1);
			this.rubikCube.down(1);
		}

	}

	private boolean sonVecinos(Vertice vertice, Vertice vertice2) {
		boolean res = false;
		if (vertice.esVecino(vertice2)) {
			res = true;
		}
		return res;
	}

	private Vertice getVerticeInferiorIaquierdo(Color front_face) {
		List<Pieza> piezas = this.rubikCube.getFace(this.rubikCube.front_face);
		List<Pieza> piezas2 = this.rubikCube.getFace(this.rubikCube.left_face);
		List<Pieza> piezas3 = this.rubikCube.getFace(this.rubikCube.down_face);

		piezas.retainAll(piezas2);
		piezas.retainAll(piezas3);

		return (Vertice) piezas.get(0);
	}

	private Vertice getVerticeInferiorDerecho(Color front_face) {
		List<Pieza> piezas = this.rubikCube.getFace(this.rubikCube.front_face);
		List<Pieza> piezas2 = this.rubikCube.getFace(this.rubikCube.right_face);
		List<Pieza> piezas3 = this.rubikCube.getFace(this.rubikCube.down_face);

		piezas.retainAll(piezas2);
		piezas.retainAll(piezas3);

		return (Vertice) piezas.get(0);
	}

	private Color getColorVecino(Vertice vertice, Vertice vertice2) {
		Color colorRes = null;
		for (int i = 0; i < vertice.getStickers().length; i++) {
			Stick stick = vertice.getStickers()[i];
			for (int j = 0; j < vertice2.getStickers().length; j++) {
				Stick stick2 = vertice2.getStickers()[j];
				if (stick.getColor().equals(stick2.getColor())
						&& !stick.getColor().equals(this.rubikCube.down_face)) {
					colorRes = stick.getColor();
				}
			}
		}
		return colorRes;
	}

	private void colocarEsquinaDownEnPos() {

		MyJtexPane.insert("*Orientando vertices:*", MyJtexPane.DEFAULT_STYLE);

		int numeroDeVerticesOrientados = 0;
		for (Vertice vertice2 : rubikCube.buscarVertices(rubikCube.down_face)) {
			if (vertice2.estaOrientada()) {
				numeroDeVerticesOrientados++;
			}
		}
		while (numeroDeVerticesOrientados != 4) {
			// numeroDeVerticesOrientados = 0;

			Color colorAux = null;
			colorAux = dameColorPivote(numeroDeVerticesOrientados);

			Vertice vertice = getVerticeInferiorIaquierdo(this.rubikCube.front_face);
			while (!esPivote(colorAux, vertice)) {
				rubikCube.setFrontByFace(rubikCube.right_face);
				colorAux = dameColorPivote(numeroDeVerticesOrientados);
				vertice = getVerticeInferiorIaquierdo(this.rubikCube.front_face);
			}

			rubikCube.right(-1);
			rubikCube.down(-1);
			rubikCube.right(1);
			rubikCube.down(-1);
			rubikCube.right(-1);
			rubikCube.down(-1);
			rubikCube.down(-1);
			rubikCube.right(1);
			rubikCube.down(-1);
			rubikCube.down(-1);

			numeroDeVerticesOrientados = 0;
			for (Vertice vertice2 : rubikCube
					.buscarVertices(rubikCube.down_face)) {
				if (vertice2.estaOrientada()) {
					numeroDeVerticesOrientados++;
				}
			}

		}
	}

	private Color dameColorPivote(int numeroDeVerticesOrientados) {
		Color colorAux = null;
		switch (numeroDeVerticesOrientados) {
		case 0:
			colorAux = this.rubikCube.front_face;
			break;
		case 1:
			colorAux = this.rubikCube.down_face;
			break;
		case 2:
			colorAux = this.rubikCube.left_face;
		default:
			break;
		}
		return colorAux;
	}

	private boolean esPivote(Color colorAux, Vertice vertice) {
		return vertice.getStickQueApunta(rubikCube.down_face).getColor()
				.equals(colorAux);
	}

	private void segundaCapa() {

		MyJtexPane.insert("*Segunda Capa:*", MyJtexPane.DEFAULT_STYLE);

		List<Arista> piezas = this.rubikCube
				.buscarAristas(this.rubikCube.front_face);
		piezas.addAll(this.rubikCube.buscarAristas(this.rubikCube.back_face));
		for (Arista pieza : piezas) {
			colocarAristaEnSegundaCapa(pieza);
		}
	}

	private void colocarAristaEnSegundaCapa(Arista arista) {
		// TODO valora si es mejor pregutar aki, o hacer un bsucar aristas y que
		// me devuelva las aristas q voy a necesitar.
		if (!arista.pertenece(this.rubikCube.down_face)
				&& !arista.pertenece(this.rubikCube.up_face)
				&& !arista.estaOrientada()) {
			// System.out.println("Colocando arista: " + arista +
			// " en segunda capa");

			// VentanaPpal.textPane.append("\n");
			// VentanaPpal.textPane.append("Colocando arista: " + arista
			// + " en segunda capa" + "\n");
			// VentanaPpal.textPane.append("\n");

			MyJtexPane.insert("Colocando arista: " + arista
					+ " en segunda capa", MyJtexPane.SUB_STYLE);

			this.rubikCube.setFrontByPieza(arista);
			this.bajarPiezaSegunda(arista);
			this.llevarAsuCara(arista);
			subeAsegundaCapa(arista);
		}
	}

	private void bajarPiezaSegunda(Arista pieza) {
		if (!pieza.estaEnCara(this.rubikCube.down_face)) {
			if (pieza.estaEnCara(this.rubikCube.right_face)) {
				this.rubikCube.right(-1);
				this.rubikCube.down(+1);
				this.rubikCube.right(+1);
				this.rubikCube.down(+1);
				this.rubikCube.front(+1);
				this.rubikCube.down(-1);
				this.rubikCube.front(-1);
				this.rubikCube.down(+1);
				this.rubikCube.down(+1);

			} else if (pieza.estaEnCara(this.rubikCube.left_face)) {
				this.rubikCube.left(+1);
				this.rubikCube.down(-1);
				this.rubikCube.left(-1);
				this.rubikCube.down(-1);
				this.rubikCube.front(-1);
				this.rubikCube.down(+1);
				this.rubikCube.front(+1);
				this.rubikCube.down(+1);
				this.rubikCube.down(+1);
			}
		}

	}

	private void subeAsegundaCapa(Arista pieza) {
		if (pieza.pertenece(this.rubikCube.left_face)) {
			this.rubikCube.down(+1);
			this.rubikCube.left(+1);
			this.rubikCube.down(-1);
			this.rubikCube.left(-1);
			this.rubikCube.down(-1);
			this.rubikCube.front(-1);
			this.rubikCube.down(+1);
			this.rubikCube.front(+1);
		} else if (pieza.pertenece(this.rubikCube.right_face)) {
			this.rubikCube.down(-1);
			this.rubikCube.right(-1);
			this.rubikCube.down(+1);
			this.rubikCube.right(+1);
			this.rubikCube.down(+1);
			this.rubikCube.front(+1);
			this.rubikCube.down(-1);
			this.rubikCube.front(-1);
		}
	}

	private void resolverEsquinas() {

		MyJtexPane.insert("*Resolviendo Esquinas:*", MyJtexPane.DEFAULT_STYLE);

		List<Vertice> piezas = this.rubikCube
				.buscarVertices(this.rubikCube.up_face);
		for (Vertice pieza : piezas) {
			colocarVerticeEnSuPosicionT(pieza);
		}
	}

	private void colocarVerticeEnSuPosicionT(Vertice pieza) {
		if (!pieza.estaOrientada()) {

			// VentanaPpal.textPane.append("\n");
			// VentanaPpal.textPane.append("Colocando vertice: " + pieza +
			// "\n");
			// VentanaPpal.textPane.append("\n");

			MyJtexPane.insert("Colocando vertice: " + pieza,
					MyJtexPane.SUB_STYLE);

			// System.out.println("Colocando vertice: " + pieza +
			// "en su posicion");
			this.rubikCube.setFrontByPieza(pieza);
			bajarVertice(pieza);
			llevarVerticeAsuEsquina(pieza);
			subirVertice(pieza);
		}
	}

	private void subirVertice(Vertice pieza) {
		// System.out.println("subiendo vertice*********************");

		if (pieza.estaEnCara(this.rubikCube.right_face)) {
			while (!pieza.esPar(this.rubikCube.front_face)) {
				rubikCube.right(-1);
				rubikCube.down(-1);
				rubikCube.down(-1);
				rubikCube.right(1);
				rubikCube.down(1);
			}
			rubikCube.right(-1);
			rubikCube.down(-1);
			rubikCube.right(1);

		} else if (pieza.estaEnCara(this.rubikCube.left_face)) {
			while (!pieza.esPar(this.rubikCube.front_face)) {
				rubikCube.left(1);
				rubikCube.down(1);
				rubikCube.down(1);
				rubikCube.left(-1);
				rubikCube.down(-1);
			}
			rubikCube.left(1);
			rubikCube.down(1);
			rubikCube.left(-1);
		}

	}

	private void llevarVerticeAsuEsquina(Vertice pieza) {
		// System.out.println("Llevando vertice a su cara");
		while (

		!pieza.pertenece(this.rubikCube.front_face)
				|| !((pieza.pertenece(this.rubikCube.right_face))
						&& ((pieza.estaEnCara(this.rubikCube.right_face))) || (pieza
						.pertenece(this.rubikCube.left_face) && ((pieza
						.estaEnCara(this.rubikCube.left_face)))))

		) {
			this.rubikCube.down(1);
			this.rubikCube.setFrontByPieza(pieza);
		}
	}

	private void bajarVertice(Vertice pieza) {
		if (!pieza.estaEnCara(this.rubikCube.down_face)) {
			// System.out.println("Bajando vertice:");
			if (pieza.estaEnCara(this.rubikCube.right_face)) {
				this.rubikCube.right(-1);
				this.rubikCube.down(-1);
				this.rubikCube.right(1);
			} else if (pieza.estaEnCara(this.rubikCube.left_face)) {
				this.rubikCube.left(1);
				this.rubikCube.down(-1);
				this.rubikCube.left(-1);
			}
			this.rubikCube.setFrontByPieza(pieza);
		}
	}

	public void test() {
		rubikCube.setFrontByFace(this.rubikCube.left_face);
		antiHorario();
		rubikCube.setFrontByFace(this.rubikCube.left_face);
		antiHorario();
		antiHorario();
		horario();
		colocarAristasDeDown();
	}

}
