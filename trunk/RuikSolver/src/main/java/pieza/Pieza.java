package pieza;

import java.util.ArrayList;
import java.util.List;

import color.Color;

//import org.apache.log4j.Logger;

public class Pieza {

	private static final int X = 0;
	private static final int Y = 1;
	private static final int Z = 2;
	private final Vectr posicion;
	private final Vectr orientacion;

	private final List<Color> color;

	// private final Logger log = Logger.getLogger(Pieza.class);

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

	// public void setPosicion(Vectr pos) {
	// log.info("Creando la cesta y el stock");
	// this.posicion.setX(pos.getX());
	// this.posicion.setY(pos.getY());
	// this.posicion.setZ(pos.getZ());
	// log.info("Creando la cesta y el stock");
	//
	// }
	//
	// public void setOrientacion(Vectr or) {
	// this.orientacion.setX(or.getX());
	// this.orientacion.setY(or.getY());
	// this.orientacion.setZ(or.getZ());
	// }

	// public Integer getPosX() {
	// return posicion.getX();
	// }
	//
	// public void setPosX(Integer x) {
	// this.posicion.setX(x);
	// }
	//
	// public Integer getPosY() {
	// return posicion.getY();
	// }
	//
	// public void setPosY(Integer y) {
	// this.posicion.setY(y);
	// }
	//
	// public Integer getPosZ() {
	// return posicion.getZ();
	// }
	//
	// public void setPosZ(Integer z) {
	// this.posicion.setZ(z);
	// }
	//
	// public Integer getOrX() {
	// return this.orientacion.getX();
	// }
	//
	// public void setOrX(Integer x) {
	// this.orientacion.setX(x);
	// }
	//
	// public Integer getOrY() {
	// return this.orientacion.getY();
	// }
	//
	// public void setOrY(Integer y) {
	// this.orientacion.setY(y);
	// }
	//
	// public int getOrZ() {
	// return this.orientacion.getZ();
	// }
	//
	// public void setOrZ(Integer z) {
	// this.orientacion.setZ(z);
	// }

	// public List<Color> getColor() {
	// return color;
	// }

	public void setColor(List<Color> colo) {
		this.color.addAll(colo);
	}

	// public boolean isFace(Pieza pieza) {
	// boolean res = false;
	// if (this.equals(pieza))
	// res = true;
	// return res;
	//
	// }

	// public boolean isBlue() {
	// return this.posicion.getY() == 1;
	// }
	//
	// public boolean isRed() {
	// return this.posicion.getX() == 1;
	// }
	//
	// public boolean isYellow() {
	// return this.posicion.getZ() == -1;
	// }
	//
	// public boolean isGreen() {
	// return this.posicion.getY() == -1;
	// }
	//
	// public boolean isWhite() {
	// return this.posicion.getZ() == 1;
	// }
	//
	// public boolean isOrange() {
	// return this.posicion.getX() == -1;
	// }

	public boolean esCentro() {
		int numCaras = 0;
		 if (this.getPos(X) == 0) {
		 numCaras++;
		 }
		 if (this.getPos(Y) == 0) {
		 numCaras++;
		 }
		 if (this.getPos(Z)== 0) {
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

	// public void blancoYcontraAmarillo() {
	// int auxPosX = getPosX();
	// int auxPosY = getPosY();
	// setPosY(-auxPosX);
	// setPosX(auxPosY);
	//
	// int auxOrX = getOrX();
	// int auxOrY = getOrY();
	// setOrY(-auxOrX);
	// setOrX(auxOrY);
	// }
	//
	// public void amarilloContraBlanco() {
	//
	//  mirar negativos
	// int auxPosX = getPosX();
	// int auxPosY = -getPosY();
	//
	// setPosY(auxPosX);
	// setPosX(-auxPosY);
	// int auxOrX = getOrX();
	// int auxOrY = getOrY();
	// setOrY(auxOrX);
	// setOrX(auxOrY);
	// }
	//
	// public void verdeYcontraAzul() {
	// int auxPosX = getPosX();
	// int auxPosZ = getPosZ();
	// setPosZ(-auxPosX);
	// setPosX(auxPosZ);
	// int auxOrX = getOrX();
	// int auxOrZ = getOrZ();
	// setOrZ(-auxOrX);
	// setOrX(auxOrZ);
	// }
	//
	// public void azulYcontraVerde() {
	// int auxPosX = getPosX();
	// int auxPosZ = getPosZ();
	// setPosZ(auxPosX);
	// setPosX(-auxPosZ);
	// int auxOrX = getOrX();
	// int auxOrZ = getOrZ();
	// setOrZ(auxOrX);
	// setOrX(-auxOrZ);
	// }
	//
	// public void naranjaYcontraRojo() {
	// int auxPosY = getPosY();
	// int auxPosZ = getPosZ();
	// setPosZ(auxPosY);
	// setPosY(-auxPosZ);
	// int auxOrY = getOrY();
	// int auxOrZ = getOrZ();
	// setOrZ(auxOrY);
	// setOrY(-auxOrZ);
	// }
	//
	// public void rojoYcontraNaranja() {
	// int auxPosY = getPosY();
	// int auxPosZ = getPosZ();
	// setPosZ(-auxPosY);
	// setPosY(auxPosZ);
	// int auxOrY = getOrY();
	// int auxOrZ = getOrZ();
	// setOrZ(-auxOrY);
	// setOrY(auxOrZ);
	// }

	public Color getColorPuntero() {
		return this.color.get(0);
	}

	public boolean containsColor(Color color) {
		return this.color.contains(color);
	}

	public boolean estaEnCara(Pieza pieza) {
		boolean res = false;
		if (pieza.getPos(X) == this.getPos(X)) {
			res = true;
		} else if (pieza.getPos(Y)==this.getPos(Y)) {
			res = true;
		} else if (pieza.getPos(Z)==this.getPos(Z)) {
			res = true;
		}
		return res;
	}

	private int getPos(int cord) {
		return this.posicion.getVector()[cord];
	}

	public void multiplicar(int[][] maux) {
		this.posicion.multiplicaPorMatriz(maux);
		this.orientacion.multiplicaPorMatriz(maux);
	}
}
