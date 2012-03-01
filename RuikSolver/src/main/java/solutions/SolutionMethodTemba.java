package solutions;

import java.util.Set;
import pieza.Pieza;
import cube.RubikCube;

public class SolutionMethodTemba {

	private RubikCube rubikCube;

	public SolutionMethodTemba(RubikCube rubikCube) {
		this.rubikCube = rubikCube;

	}

	public void solucionar() {
		resolverCruz();
		resolverEsquinas();
		segundaCapa();
	}

	private void segundaCapa() {
		System.out.println("Segunda Capa:");
		Set<Pieza> piezas = this.rubikCube.buscarAristasNoUp();
		for (Pieza pieza : piezas) {
			colocarAristaEnSegundaCapa(pieza);
		}
	}

	private void colocarAristaEnSegundaCapa(Pieza pieza) {
		System.out.println("Colocando arista: " + pieza + "en segunda capa");
		this.rubikCube.setFrontByPieza(pieza);
		this.bajarPiezaSegunda(pieza);
		this.llevarAsuCara(pieza);
		subeAsegundaCapa(pieza);
	}

	private void bajarPiezaSegunda(Pieza pieza) {
		if (!pieza.estaEnCara(this.rubikCube.DONW)) {
			if (pieza.estaEnCara(this.rubikCube.RIGHT)) {
				
			} else if (pieza.estaEnCara(this.rubikCube.LEFT)) {

			}
		}
	}

	private void subeAsegundaCapa(Pieza pieza) {
		if (pieza.apunta(rubikCube.FRONT)
				&& pieza.getColorPuntero().equals(
						rubikCube.FRONT.getColorPuntero())) {
			if (pieza.pertenece(this.rubikCube.LEFT)) {
				this.rubikCube.down(+1);
				this.rubikCube.left(+1);
				this.rubikCube.down(-1);
				this.rubikCube.left(-1);
				this.rubikCube.down(-1);
				this.rubikCube.front(-1);
				this.rubikCube.down(+1);
				this.rubikCube.front(+1);
			} else {
				this.rubikCube.down(-1);
				this.rubikCube.right(-1);
				this.rubikCube.down(+1);
				this.rubikCube.right(+1);
				this.rubikCube.down(+1);
				this.rubikCube.front(+1);
				this.rubikCube.down(-1);
				this.rubikCube.front(-1);
			}
		} else if (!pieza.apunta(rubikCube.FRONT)
				&& pieza.getColorPuntero().equals(
						rubikCube.FRONT.getColorPuntero())) {
			if (pieza.pertenece(this.rubikCube.LEFT)) {
				this.rubikCube.down(-1);
			} else {
				this.rubikCube.down(+1);
			}
			subeAsegundaCapa(pieza);
			this.rubikCube.setFrontByPieza(pieza);
		} else if (pieza.apunta(rubikCube.FRONT)
				&& !pieza.getColorPuntero().equals(
						rubikCube.FRONT.getColorPuntero())) {
			if (pieza.pertenece(this.rubikCube.LEFT)) {
				this.rubikCube.down(-1);
			} else {
				this.rubikCube.down(+1);
			}
			subeAsegundaCapa(pieza);
			this.rubikCube.setFrontByPieza(pieza);
		} else if (!pieza.apunta(rubikCube.FRONT)
				&& !pieza.getColorPuntero().equals(
						rubikCube.FRONT.getColorPuntero())) {
			if (pieza.pertenece(this.rubikCube.LEFT)) {
				this.rubikCube.down(+1);
				this.rubikCube.left(+1);
				this.rubikCube.down(-1);
				this.rubikCube.left(-1);
				this.rubikCube.down(-1);
				this.rubikCube.front(-1);
				this.rubikCube.down(+1);
				this.rubikCube.front(+1);
			} else {
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
	}

	private void resolverCruz() {
		System.out.println("*Resolviendo cruz:*");
		Set<Pieza> piezas = this.rubikCube.buscarAristasDeUp();
		for (Pieza pieza : piezas) {
			colocarAristaEnSuPosicionCruz(pieza);
		}
	}

	private void resolverEsquinas() {
		Set<Pieza> piezas = this.rubikCube.buscarVerticesDeUp();
		for (Pieza pieza : piezas) {
			colocarVerticeEnSuPosicionT(pieza);
		}
	}

	private void colocarVerticeEnSuPosicionT(Pieza pieza) {
		System.out.println("Colocando vertice: " + pieza + "en su posicion");
		this.rubikCube.setFrontByPieza(pieza);
		bajarVertice(pieza);
		llevarVerticeAsuCara(pieza);
		subirVertice(pieza);
	}

	private void subirVertice(Pieza pieza) {
		System.out.println("subiendo vertice*********************");

		if (pieza.estaEnCara(this.rubikCube.RIGHT)) {
			while (!pieza.apunta(this.rubikCube.RIGHT)) {
				rubikCube.right(-1);
				rubikCube.down(-1);
				rubikCube.down(-1);
				rubikCube.right(1);
				rubikCube.down(1);
			}
			rubikCube.right(-1);
			rubikCube.down(-1);
			rubikCube.right(1);

		} else if (pieza.estaEnCara(this.rubikCube.LEFT)) {
			while (!pieza.apunta(this.rubikCube.LEFT)) {
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

	private void llevarVerticeAsuCara(Pieza pieza) {
		System.out.println("Llevando vertice a su cara");
		while (

		!pieza.pertenece(this.rubikCube.FRONT)
				|| !((pieza.pertenece(this.rubikCube.RIGHT))
						&& ((pieza.estaEnCara(this.rubikCube.RIGHT))) || (pieza
						.pertenece(this.rubikCube.LEFT) && ((pieza
						.estaEnCara(this.rubikCube.LEFT)))))

		) {
			this.rubikCube.down(1);
			this.rubikCube.setFrontByPieza(pieza);
		}
	}

	private void bajarVertice(Pieza pieza) {
		if (!pieza.estaEnCara(this.rubikCube.DONW)) {
			System.out.println("Bajando vertice:");
			if (pieza.estaEnCara(this.rubikCube.RIGHT)) {
				this.rubikCube.right(-1);
				this.rubikCube.down(-1);
				this.rubikCube.right(1);
			} else if (pieza.estaEnCara(this.rubikCube.LEFT)) {
				this.rubikCube.left(1);
				this.rubikCube.down(-1);
				this.rubikCube.left(-1);
			}
			this.rubikCube.setFrontByPieza(pieza);
		}
	}

	private void colocarAristaEnSuPosicionCruz(Pieza pieza) {
		System.out.println("*Colocando Arista: " + pieza + "en su posicion*");
		this.rubikCube.setFrontByPieza(pieza);
		bajarPieza(pieza);
		llevarAsuCara(pieza);
		subirPieza(pieza);
	}

	private void subirPieza(Pieza pieza) {
		System.out.println("Colocando subiendo pieza");
		if (pieza.apunta(this.rubikCube.DONW)) {
			rubikCube.front(1);
			rubikCube.front(1);
		} else {
			rubikCube.down(1);
			rubikCube.right(1);
			rubikCube.front(-1);
			rubikCube.right(-1);
		}
	}

	private void llevarAsuCara(Pieza pieza) {
		if (!pieza.estaEnCara(this.rubikCube.FRONT)) {
			System.out.println("Llevando a su cara");
			if (pieza.pertenece(this.rubikCube.LEFT)) {
				rubikCube.down(-1);
			} else if (pieza.pertenece(this.rubikCube.RIGHT)) {
				rubikCube.down(1);
			} else if (pieza.pertenece(this.rubikCube.BACK)) {
				rubikCube.down(1);
				rubikCube.down(1);
			}
			rubikCube.setFrontByPieza(pieza);
		}
	}

	private void bajarPieza(Pieza pieza) {
		// TODO refinar
		if (!pieza.estaEnCara(this.rubikCube.DONW)) {
			System.out.println("*Bajando pieza*");
			if (pieza.estaEnCara(this.rubikCube.RIGHT)) {
				rubikCube.front(1);
				rubikCube.down(1);
				rubikCube.front(-1);
				rubikCube.down(-1);
			} else if (pieza.estaEnCara(this.rubikCube.LEFT)) {
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
}
