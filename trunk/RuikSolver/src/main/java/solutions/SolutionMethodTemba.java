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
		this.rubikCube.setFrontByPieza(pieza);
		
	}

	private void colocarAristaEnSuPosicionCruz(Pieza pieza) {
		this.rubikCube.setFrontByPieza(pieza);
		bajarPieza(pieza);
		llevarAsuCara(pieza);
		subirPieza(pieza);
	}

	private void subirPieza(Pieza pieza) {
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
		if (pieza.containsColor(this.rubikCube.LEFT.getColorPuntero())) {
			rubikCube.down(-1);
		} else if (pieza.containsColor(this.rubikCube.RIGHT.getColorPuntero())) {
			rubikCube.down(1);
		} else if (pieza.containsColor(this.rubikCube.BACK.getColorPuntero())) {
			rubikCube.down(1);
			rubikCube.down(1);
		}
		rubikCube.setFrontByPieza(pieza);
	}

	private void bajarPieza(Pieza pieza) {
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
