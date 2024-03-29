package pieza;

import java.util.Arrays;

public abstract class Pieza {

	Stick stickers[];

	public Stick[] getStickers() {
		return stickers;
	}

	public Pieza() {
		this.stickers = null;
	}

	public Vectr getPosicion() {
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
		return "Pieza [Color = " + "[" + stickers[0].getColor() + ","
				+ stickers[1].getColor() + "] Posicion = ["
				+ toStringVect(stickers[0].getOrientacion()) + ","
				+ toStringVect(stickers[1].getOrientacion()) + "], "
				+ getPosicion() + "]";
		// return "Pieza [stickers=" + Arrays.toString(stickers) +
		// ", getPosicion()=" + getPosicion() + "]";
	}

	protected String toStringVect(Vectr vectr) {
		String res = null;
		int x = vectr.getX();
		int y = vectr.getY();
		int z = vectr.getZ();
		if (x == 0 && y == 0 && z == 1) {
			res = "blanco";
		} else if (x == 0 && y == -1 && z == 0) {
			res = "verde";
		} else if (x == 0 && y == 1 && z == 0) {
			res = "azul";
		} else if (x == 0 && y == 0 && z == -1) {
			res = "amarillo";
		} else if (x == 1 && y == 0 && z == 0) {
			res = "rojo";
		} else if (x == -1 && y == 0 && z == 0) {
			res = "naranja";
		}
		return res;
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
			//TODO hacer el stick.pertenece  
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
			if (stick.getColor().equals(color)
					//TODO
				//stick.getColor().equals(color))
					&& stick.getOrientacion().equals(color.getDireccion())) {
				res = true;
				i = stickers.length;
			}
		}
		return res; 
	}

	public boolean estaOrientada() {
		boolean res = true;
		for (int i = 0; i < this.stickers.length; i++) {
			Stick stick = this.stickers[i];
			if (!stick.getOrientacion().equals(stick.getColor().getDireccion())) {
				res=false;
				i= this.stickers.length;
			}
		}
		return res;
	}
	public Stick getStickQueApunta(Color color) {
		Stick stickRes = null;
		for (int i = 0; i < this.stickers.length; i++) {
			Stick stick=stickers[i];
			if(stick.getOrientacion().equals(color.getDireccion())){
				stickRes=stick;
			}
		}
		return stickRes;
	}
	
	public boolean estaPosicionado() {
		Vectr sumaRes = new Vectr(0, 0, 0);
		for (int i = 0; i < this.stickers.length; i++) {
			Stick stick = this.stickers[i];
			sumaRes.sumarVector(stick.getColor().getDireccion());
		}
		return sumaRes.equals(this.getPosicion());
	}
}
