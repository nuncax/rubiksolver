package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import pieza.Pieza;
import color.Color;
import cube.RubikCube;

public class SolutionMethodTemba {

	private RubikCube rubikCube;

	private static Color FRONT;
	private static Color RIGHT;
	private static Color LEFT;
	private static Color UP;
	private static Color DONW;
	private static Color BACK;

	private final Color AZUL = new Color("AZUL");
	private final Color NARANJA = new Color("naranja");
	private final Color ROJO = new Color("rojo");
	private final Color BLANCO = new Color("blanco");
	private final Color AMARILLO = new Color("amarillo");
	private final Color VERDE = new Color("verde");
	private List<Color> caras;

	public SolutionMethodTemba(RubikCube rubikCube) {
		this.rubikCube = rubikCube;
		this.rubikCube.D();
		this.FRONT = this.AZUL;
		this.RIGHT = this.NARANJA;
		this.BACK = this.VERDE;
		this.LEFT = this.ROJO;
	}

	void setFrontByColor(Color front) {
		switch (front.toString()) {
		case AZUL.getColor():
			this.FRONT.setColor("azul");
			this.RIGHT.setColor("naranja");
			this.DONW.setColor("verde");
			this.LEFT.setColor("rojo");
			break;
		case "naranja":
			this.FRONT.setColor("naranja");
			this.RIGHT.setColor("verde");
			this.DONW.setColor("rojo");
			this.LEFT.setColor("azul");
			break;
		case "verde":
			this.FRONT.setColor("verde");
			this.RIGHT.setColor("rojo");
			this.DONW.setColor("azul");
			this.LEFT.setColor("naranja");
			break;
		case "rojo":
			this.FRONT.setColor("rojo");
			this.RIGHT.setColor("azul");
			this.DONW.setColor("naranja");
			this.LEFT.setColor("verde");
			break;

		default:
			break;
		}
	}

	void solucionar() {
		resolverCruz();
		resolverEsquinas();

	}

	private void resolverEsquinas() {
		// TODO Auto-generated method stub

	}

	private void resolverCruz() {
		for (Color color : this.caras) {
			resolverCruzPorCara(color);
		}
	}

	private void bajar(Pieza pieza) {

	}

	private Set<Pieza> buscarAristas(Color color) {
		Set<Pieza> piezaRes = null;
		for (Pieza pieza : this.rubikCube.getPiezas()) {
			for (Color colorPieza : pieza.getColor()) {
				if (colorPieza.equals(pieza) && pieza.esArista()) {
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

	private void resolverCruzPorCara(Color color) {
		// TODO Auto-generated method stub

	}
}
