package pieza;

import java.util.ArrayList;
import java.util.List;

import color.Color;

public class Pieza {

	private static final int X = 0;
	private static final int Y = 1;
	private static final int Z = 2;
	private final Vectr posicion;
	private final Vectr orientacion;

	private final List<Color> color;

	public Pieza(Vectr pos, Vectr or, List<Color> colores) {
		this.posicion = pos;
		this.orientacion = or;
		this.color = new ArrayList<Color>();
		this.color.addAll(colores);
	}

	@Override
	public String toString() {
		return "Pieza [posicion=" + posicion + ", orientacion=" + orientacion
				+ ", color=" + color + "]";
	}

	public Vectr getPosicion() {
		return posicion;
	}

	public void setColor(List<Color> colo) {
		this.color.addAll(colo);
	}

	public boolean esCentro() {
		int numCaras = 0;
		if (this.getPos(X) == 0) {
			numCaras++;
		}
		if (this.getPos(Y) == 0) {
			numCaras++;
		}
		if (this.getPos(Z) == 0) {
			numCaras++;
		}
		return numCaras == 2;
	}

	public boolean esArista() {
		int numCaras = 0;
		if (this.getPos(X) == 0) {
			numCaras++;
		}
		if (this.getPos(Y) == 0) {
			numCaras++;
		}
		if (this.getPos(Z) == 0) {
			numCaras++;
		}
		return numCaras == 1;
	}

	public Color getColorPuntero() {
		return this.color.get(0);
	}

	public boolean containsColor(Color color) {
		return this.color.contains(color);
	}

	public boolean estaEnCara(Pieza centro) {
		boolean res = false;
		if (centro.getPos(X) != 0 && centro.getPos(X) == this.getPos(X)) {
			res = true;
		} else if (centro.getPos(Y) != 0 && centro.getPos(Y) == this.getPos(Y)) {
			res = true;
		} else if (centro.getPos(Z) != 0 && centro.getPos(Z) == this.getPos(Z)) {
			res = true;
		}
		return res;
	}

	private int getPos(int cord) {
		return this.posicion.getVector().get(cord);
	}

	public void multiplicar(int[][] maux) {
		this.posicion.multiplicaPorMatriz(maux);
		this.orientacion.multiplicaPorMatriz(maux);
	}
}
