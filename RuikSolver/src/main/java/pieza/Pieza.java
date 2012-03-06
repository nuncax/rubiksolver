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

	public boolean pertenece(Pieza centro) {
		return this.color.contains(centro.getColorPuntero());
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

	public boolean apunta(Pieza centro) {
		return this.orientacion.equals(centro.orientacion);
	}

	public boolean esVertice() {

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
		return numCaras == 0;

	}

	public boolean esPar(Pieza centro) {
		List<Integer> thisV = this.orientacion.getVector();
		List<Integer> centroV = centro.orientacion.getVector();

		int x = thisV.get(0) * centroV.get(0);
		int y = thisV.get(1) * centroV.get(1);
		int z = thisV.get(2) * centroV.get(2);

		int suma = x + y + z;
		
//		if(centro.getColorPuntero().getColor().equals(anObject))

		return suma==0 && this.pertenece(centro); 

		// if (this.pertenece(centro)) {
		// if (!this.apunta(centro)&&
		// !(this.getColorPuntero().equals(centro.getColorPuntero()))) {
		// res = true;
		// }
		// if (!this.apunta(centro)&&
		// (this.getColorPuntero().equals(centro.getColorPuntero()))) {
		// res = true;
		// }
		// if (this.apunta(centro)&&
		// !(this.getColorPuntero().equals(centro.getColorPuntero()))) {
		// res = true;
		// }
		// if (this.apunta(centro)&&
		// (this.getColorPuntero().equals(centro.getColorPuntero()))) {
		// res = true;
		// }
		// }
	}

	// public boolean esPar(Pieza centro) {
	// boolean res = false;
	// if (this.pertenece(centro)) {
	// if ((this.apunta(centro) && this.getColorPuntero().equals(
	// centro.getColorPuntero()))
	// || ((!this.apunta(centro) && !this.getColorPuntero()
	// .equals(centro.getColorPuntero())))) {
	// res = true;
	// }
	// }
	// return res;
	// }
}
