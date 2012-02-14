package solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import pieza.Pieza;
import color.Color;
import cube.RubikCube;
import cube.RubikCubeData;

public class SolutionMethodTemba {

	private RubikCube rubikCube;

	private List<Color> caras;

	public SolutionMethodTemba(RubikCube rubikCube) {
		this.rubikCube = rubikCube;

	}

	void solucionar() {
		resolverCruz();
		resolverEsquinas();
	}

	private void resolverCruz() {
		this.rubikCube.buscarPieza(this.rubikCube.UP.getColor());
		// Set<Pieza> piezas = buscarAristas();
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
//		if(pieza.){
//			
//		}else{
//			
//		}
	}

	private void llevarAsuCara(Pieza pieza) {
		if (pieza.containsColor(this.rubikCube.LEFT)) {
			rubikCube.downP();
		} else if (pieza.containsColor(this.rubikCube.RIGHT)) {
			rubikCube.down();
		} else if (pieza.containsColor(this.rubikCube.BACK)) {
			rubikCube.down();
			rubikCube.down();
		}
		rubikCube.setFrontByPieza(pieza);
	}

	private void resolverEsquinas() {
		// TODO Auto-generated method stub

	}

	private void resolverCruzPorCara(Color color) {

	}

	private void bajarPieza(Pieza pieza) {
		if (!pieza.containsColor(this.rubikCube.DONW)) {
			if (pieza.containsColor(this.rubikCube.UP)) {
				rubikCube.front();
				rubikCube.front();
			} else {
				rubikCube.front();
			}
		}
	}

	private Set<Pieza> buscarAristas(Color color) {
		Set<Pieza> piezaRes = new HashSet<Pieza>();
		for (Pieza pieza : this.rubikCube.getPiezas()) {
			for (Color colorPieza : pieza.getColor()) {
				if (colorPieza.equals(pieza.toString()) && pieza.esArista()) {
					piezaRes.add(pieza);
				}
			}
		}
		return piezaRes;
	}

	public List<Color> getCaras() {
		return caras;
	}

	public void setCaras(List<Color> caras) {
		this.caras = caras;
	}
}
