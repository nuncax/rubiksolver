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
		// for (Pieza aristaBlanca : piezas) {
		// colocarAristaEnSuPosicionCruz(aristaBlanca);
		//
		// }
	}

	private void colocarAristaEnSuPosicionCruz(Pieza pieza) {
		this.rubikCube.setFrontByPieza(pieza);
		bajarPieza(pieza);
		llevarAsuCara(pieza);
		subirPieza(pieza);
	}

	private void subirPieza(Pieza pieza) {
		// if(pieza.){
		//
		// }else{
		//
		// }
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

	private void resolverEsquinas() {
		// TODO Auto-generated method stub

	}

	private void bajarPieza(Pieza pieza) {
		if (!pieza.containsColor(this.rubikCube.DONW.getColorPuntero())) {
			if (pieza.containsColor(this.rubikCube.UP.getColorPuntero())) {
				rubikCube.front(1);
				rubikCube.front(1);
			} else {
				rubikCube.front(1);
			}
		}
	}
}
