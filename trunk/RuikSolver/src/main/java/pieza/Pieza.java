package pieza;

import java.util.Arrays;

public abstract class Pieza {

	Stick stickers[];

	public Pieza() {
		this.stickers = null;
	}

	private Vectr getPosicion() {
		Vectr sumaRes = new Vectr(0, 0, 0);
		for (int i = 0; i < this.stickers.length; i++) {
			Stick stick = this.stickers[i];
			sumaRes.sumarVector(stick.getOrientacion());
		}
		return sumaRes;
	}

	public void multiplicar(int[][] maux) {
		for (Stick stick : this.stickers) {
			stick.getOrientacion().multiplicaPorMatriz(maux);
		}
	}

	@Override
	public String toString() {
		return "Pieza [stickers=" + stickers[0].getColor()+","+ stickers[1].getColor().toString() +","+ stickers[0].getOrientacion().toString() +","+ stickers[1].getOrientacion().toString()+ ", getPosicion()=" + getPosicion() + "]";
//		return "Pieza [stickers=" + Arrays.toString(stickers) + ", getPosicion()=" + getPosicion() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(stickers);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pieza other = (Pieza) obj;
		if (!Arrays.equals(stickers, other.stickers))
			return false;
		return true;
	}

	public boolean pertenece(Color color) {
		boolean res = false;
		for (Stick stick : this.stickers) {
			if (stick.getColor().equals(color)) {
				res = true;
			}
		}
		return res;
	}

	public boolean estaEnCara(Color color) {
		boolean res = false;
		for (Stick stick : this.stickers) {
			if (color.getDireccion().equals(stick.getOrientacion())) {
				res = true;
			}
		}
		return res;
	}

	public boolean esPar(Color color) {
		boolean res = false;
		for (int i = 0; i < this.stickers.length; i++) {
			Stick stick = this.stickers[i];
			if(stick.getColor().equals(color)){
				res = true;
				i=stickers.length;
			}
		}
		return res;
	}

}
