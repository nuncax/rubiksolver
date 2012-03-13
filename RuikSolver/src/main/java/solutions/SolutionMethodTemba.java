package solutions;

import java.util.List;
import pieza.Arista;
import pieza.Pieza;
import cube.RubikCube;

public class SolutionMethodTemba {

	private final RubikCube rubikCube;

	public SolutionMethodTemba(RubikCube cube) {
		this.rubikCube = cube;
	}

	public void solucionar() {
		resolverCruz();
		// resolverEsquinas();
		// segundaCapa();
		// colocarEsquinasDeDown();
	}

	private void resolverCruz() {
		System.out.println("*Resolviendo cruz:*");
		List<Arista> piezas = this.rubikCube
				.buscarAristas(this.rubikCube.up_face);
		for (Arista arista : piezas) {
			ponerAristaEnPosicionCruz(arista);
		}
	}

	private void ponerAristaEnPosicionCruz(Arista arista) {
		System.out.println("*Colocando Arista: " + arista + "en su posicion*");
		bajarArista(arista);
		llevarAsuCara(arista);
		subirArista(arista);
	}

	private void bajarArista(Arista arista) {
		this.rubikCube.setFrontByPieza(arista);
		// TODO refinar
		if (!arista.estaEnCara(this.rubikCube.down_face)) {
			System.out.println("*Bajando pieza*");
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

	private void llevarAsuCara(Pieza pieza) {
		if (!pieza.pertenece(this.rubikCube.front_face)) {
			System.out.println("Llevando a su cara");
			if (pieza.pertenece(this.rubikCube.left_face)) {
				rubikCube.down(-1);
			} else if (pieza.pertenece(this.rubikCube.right_face)) {
				rubikCube.down(1);
			} else if (pieza.pertenece(this.rubikCube.back_face)) {
				rubikCube.down(1);
				rubikCube.down(1);
			}
			rubikCube.setFrontByPieza(pieza);
		}
	}

	private void subirArista(Pieza pieza) {
		System.out.println("Colocando subiendo pieza");
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

	// private void colocarEsquinasDeDown() {
	// System.out.println("Segunda Capa:");
	// List<Pieza> piezas = this.rubikCube.buscarVerticesDeDonw();
	// Pieza pieza = piezas.get(0);
	// llevarVerticeAsuEsquina(pieza);
	// for (Pieza pieza2 : piezas) {
	// colocarEsquinaDownEnPos(pieza2);
	// }
	// }

	private void colocarEsquinaDownEnPos(Pieza pieza) {

	}

	// private void segundaCapa() {
	// System.out.println("Segunda Capa:");
	// Set<Pieza> piezas = this.rubikCube.buscarAristasNoUp();
	// for (Pieza pieza : piezas) {
	// colocarAristaEnSegundaCapa(pieza);
	// }
	// }

	// private void colocarAristaEnSegundaCapa(Pieza pieza) {
	// System.out.println("Colocando arista: " + pieza + "en segunda capa");
	// this.rubikCube.setFrontByPieza(pieza);
	// this.bajarPiezaSegunda(pieza);
	// this.llevarAsuCara(pieza);
	// subeAsegundaCapa(pieza);
	// }

	private void bajarPiezaSegunda(Pieza pieza) {
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

	// private void subeAsegundaCapa(Pieza pieza) {
	// //TODO
	//
	// if (pieza.apunta(rubikCube.front_center)
	// && pieza.getColorPuntero().equals(
	// rubikCube.front_center.getColorPuntero())) {
	// if (pieza.tieneStick(this.rubikCube.left_center)) {
	// this.rubikCube.down(+1);
	// this.rubikCube.left(+1);
	// this.rubikCube.down(-1);
	// this.rubikCube.left(-1);
	// this.rubikCube.down(-1);
	// this.rubikCube.front(-1);
	// this.rubikCube.down(+1);
	// this.rubikCube.front(+1);
	// } else {
	// this.rubikCube.down(-1);
	// this.rubikCube.right(-1);
	// this.rubikCube.down(+1);
	// this.rubikCube.right(+1);
	// this.rubikCube.down(+1);
	// this.rubikCube.front(+1);
	// this.rubikCube.down(-1);
	// this.rubikCube.front(-1);
	// }
	// } else if (!pieza.apunta(rubikCube.front_center)
	// && pieza.getColorPuntero().equals(
	// rubikCube.front_center.getColorPuntero())) {
	// if (pieza.tieneStick(this.rubikCube.left_center)) {
	// this.rubikCube.down(-1);
	// } else {
	// this.rubikCube.down(+1);
	// }
	// this.rubikCube.setFrontByPieza(pieza);
	// subeAsegundaCapa(pieza);
	// } else if (pieza.apunta(rubikCube.front_center)
	// && !pieza.getColorPuntero().equals(
	// rubikCube.front_center.getColorPuntero())) {
	// if (pieza.tieneStick(this.rubikCube.left_center)) {
	// this.rubikCube.down(-1);
	// } else {
	// this.rubikCube.down(+1);
	// }
	// this.rubikCube.setFrontByPieza(pieza);
	// subeAsegundaCapa(pieza);
	// } else if (!pieza.apunta(rubikCube.front_center)
	// && !pieza.getColorPuntero().equals(
	// rubikCube.front_center.getColorPuntero())) {
	// if (pieza.tieneStick(this.rubikCube.left_center)) {
	// this.rubikCube.down(+1);
	// this.rubikCube.left(+1);
	// this.rubikCube.down(-1);
	// this.rubikCube.left(-1);
	// this.rubikCube.down(-1);
	// this.rubikCube.front(-1);
	// this.rubikCube.down(+1);
	// this.rubikCube.front(+1);
	// } else {
	// this.rubikCube.down(-1);
	// this.rubikCube.right(-1);
	// this.rubikCube.down(+1);
	// this.rubikCube.right(+1);
	// this.rubikCube.down(+1);
	// this.rubikCube.front(+1);
	// this.rubikCube.down(-1);
	// this.rubikCube.front(-1);
	// }
	// }
	// }

	// private void resolverEsquinas() {
	// Set<Pieza> piezas = this.rubikCube.buscarVerticesDeUp();
	// for (Pieza pieza : piezas) {
	// colocarVerticeEnSuPosicionT(pieza);
	// }
	// }

	// private void colocarVerticeEnSuPosicionT(Pieza pieza) {
	// System.out.println("Colocando vertice: " + pieza + "en su posicion");
	// this.rubikCube.setFrontByPieza(pieza);
	// bajarVertice(pieza);
	// llevarVerticeAsuEsquina(pieza);
	// subirVertice(pieza);
	// }

	// private void subirVertice(Pieza pieza) {
	// System.out.println("subiendo vertice*********************");
	//
	// if (pieza.estaEnCara(this.rubikCube.right_center)) {
	// while (!pieza.apunta(this.rubikCube.right_center)) {
	// rubikCube.right(-1);
	// rubikCube.down(-1);
	// rubikCube.down(-1);
	// rubikCube.right(1);
	// rubikCube.down(1);
	// }
	// rubikCube.right(-1);
	// rubikCube.down(-1);
	// rubikCube.right(1);
	//
	// } else if (pieza.estaEnCara(this.rubikCube.left_center)) {
	// while (!pieza.apunta(this.rubikCube.left_center)) {
	// rubikCube.left(1);
	// rubikCube.down(1);
	// rubikCube.down(1);
	// rubikCube.left(-1);
	// rubikCube.down(-1);
	// }
	// rubikCube.left(1);
	// rubikCube.down(1);
	// rubikCube.left(-1);
	// }
	//
	// }

	private void llevarVerticeAsuEsquina(Pieza pieza) {
		System.out.println("Llevando vertice a su cara");
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

	private void bajarVertice(Pieza pieza) {
		if (!pieza.estaEnCara(this.rubikCube.down_face)) {
			System.out.println("Bajando vertice:");
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

}
