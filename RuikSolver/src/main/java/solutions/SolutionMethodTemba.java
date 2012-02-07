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

	private final Color FRONT;
	private final Color RIGHT;
	private final Color LEFT;
	private final Color UP;
	// private final Color DONW;
	private final Color BACK;

	private List<Color> caras;

	public SolutionMethodTemba(RubikCube rubikCube) {
		this.rubikCube = rubikCube;
		this.FRONT = rubikCube.AZUL;
		this.RIGHT = rubikCube.NARANJA;
		this.BACK = rubikCube.VERDE;
		this.LEFT = rubikCube.ROJO;
		this.UP= rubikCube.BLANCO;
	}

	void setFrontByColor(Color front) {
		if (front.equals(rubikCube.AZUL)) {
			this.FRONT.setColor(rubikCube.AZUL);
			this.RIGHT.setColor(rubikCube.NARANJA);
			this.BACK.setColor(rubikCube.VERDE);
			this.LEFT.setColor(rubikCube.ROJO);
		} else if (front.equals(rubikCube.NARANJA)) {
			this.FRONT.setColor(rubikCube.NARANJA);
			this.RIGHT.setColor(rubikCube.VERDE);
			this.BACK.setColor(rubikCube.ROJO);
			this.LEFT.setColor(rubikCube.AZUL);
		} else if (front.equals(rubikCube.VERDE)) {
			this.FRONT.setColor(rubikCube.VERDE);
			this.RIGHT.setColor(rubikCube.ROJO);
			this.BACK.setColor(rubikCube.AZUL);
			this.LEFT.setColor(rubikCube.NARANJA);
		} else if (front.equals(rubikCube.ROJO)) {
			this.FRONT.setColor(rubikCube.ROJO);
			this.RIGHT.setColor(rubikCube.AZUL);
			this.BACK.setColor(rubikCube.NARANJA);
			this.LEFT.setColor(rubikCube.VERDE);
		}
	}

	void solucionar() {
		resolverCruz();
		resolverEsquinas();

	}

	private void resolverCruz() {
		resolverCruzPorCara(rubikCube.AZUL);
	}

	private void resolverEsquinas() {
		// TODO Auto-generated method stub

	}

	private void resolverCruzPorCara(Color color) {
		this.setFrontByColor(color);
		Set<Pieza> aristasBlancas = this.buscarAristas(this.UP);
		for (Pieza pieza : aristasBlancas) {
			if (pieza.getColor().contains(this.UP)) {
				bajar(pieza);
				
			}
		}
	}

	private void bajar(Pieza pieza) {
		// TODO Auto-generated method stub
		
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
