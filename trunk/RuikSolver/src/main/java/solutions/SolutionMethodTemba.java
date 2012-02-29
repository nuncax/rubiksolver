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
	}

	private void resolverCruz() {
		System.out.println("Resolviendo cruz:");
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
		System.out.println("Colocando vertive: " + pieza + "en su posicion");
		this.rubikCube.setFrontByPieza(pieza);
		bajarVertice(pieza);
		llevarVerticeAsuCara(pieza);
		subirVertice(pieza);
	}

	private void subirVertice(Pieza pieza) {
		if (pieza.estaEnCara(this.rubikCube.RIGHT)) {
			while(!pieza.apunta(this.rubikCube.RIGHT)){
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
			while(!pieza.apunta(this.rubikCube.LEFT)){
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
		System.out.println("Colocando Arista: " + pieza + "en su posicion");
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

	private void bajarPieza(Pieza pieza) {
		System.out.println("Bajando pieza");
		// TODO refinar
		if (!pieza.estaEnCara(this.rubikCube.DONW)) {
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
