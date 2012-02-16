package pieza;

import java.util.ArrayList;
import java.util.List;

import color.Color;

public class Pieza {

	private final Vectr posicion;
	private final Vectr orientacion;

	private final List<Color> color;

	public Pieza(Vectr pos, Vectr or, List<Color> colores) {
		this.posicion = new Vectr(pos.getX(), pos.getY(), pos.getZ());
		this.orientacion = new Vectr(or.getX(), or.getY(), or.getZ());
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

	public void setPosicion(Vectr pos) {
		this.posicion.setX(pos.getX());
		this.posicion.setY(pos.getY());
		this.posicion.setZ(pos.getZ());

	}

	public void setOrientacion(Vectr or) {
		this.orientacion.setX(or.getX());
		this.orientacion.setY(or.getY());
		this.orientacion.setZ(or.getZ());
	}

	public Integer getPosX() {
		return posicion.getX();
	}

	public void setPosX(Integer x) {
		this.posicion.setX(x);
	}

	public Integer getPosY() {
		return posicion.getY();
	}

	public void setPosY(Integer y) {
		this.posicion.setY(y);
	}

	public Integer getPosZ() {
		return posicion.getZ();
	}

	public void setPosZ(Integer z) {
		this.posicion.setZ(z);
	}

	public Integer getOrX() {
		return this.orientacion.getX();
	}

	public void setOrX(Integer x) {
		this.orientacion.setX(x);
	}

	public Integer getOrY() {
		return this.orientacion.getY();
	}

	public void setOrY(Integer y) {
		this.orientacion.setY(y);
	}

	public int getOrZ() {
		return this.orientacion.getZ();
	}

	public void setOrZ(Integer z) {
		this.orientacion.setZ(z);
	}

	public List<Color> getColor() {
		return color;
	}

	public void setColor(List<Color> colo) {
		this.color.addAll(colo);
	}

	public boolean isBlue() {
		return this.posicion.getY() == 1;
	}

	public boolean isRed() {
		return this.posicion.getX() == 1;
	}

	public boolean isYellow() {
		return this.posicion.getZ() == -1;
	}

	public boolean isGreen() {
		return this.posicion.getY() == -1;
	}

	public boolean isWhite() {
		return this.posicion.getZ() == 1;
	}

	public boolean isOrange() {
		return this.posicion.getX() == -1;
	}

	public boolean esCentro() {
		int numCaras = 0;
		if (this.posicion.getX() == 0) {
			numCaras++;
		}
		if (this.posicion.getY() == 0) {
			numCaras++;
		}
		if (this.posicion.getZ() == 0) {
			numCaras++;
		}
		return numCaras == 2;
	}

	public boolean esArista() {
		int numCaras = 0;
		if (this.posicion.getX() == 0) {
			numCaras++;
		}
		if (this.posicion.getY() == 0) {
			numCaras++;
		}
		if (this.posicion.getZ() == 0) {
			numCaras++;
		}
		return numCaras == 1;
	}

	public void menosXy() {
		setPosY(-getPosX());
		setPosX(getPosY());

		setOrY(-getOrX());
		setOrX(getOrY());
	}

	public void xMenosY() {
		setPosY(getPosX());
		setPosX(-getPosY());

		setOrY(getOrX());
		setOrX(-getOrY());
	}

	public void menosXz() {
		setPosZ(-getPosX());
		setPosX(getPosZ());

		setOrZ(-getOrX());
		setOrX(getOrZ());
	}

	public void xMenosZ() {
		setPosZ(getPosX());
		setPosX(-getPosZ());

		setOrZ(getOrX());
		setOrX(-getOrZ());
	}

	public void yMenosZ() {
		setPosZ(getPosY());
		setPosY(-getPosZ());

		setOrZ(getOrY());
		setOrY(-getOrZ());
	}

	public void menosYz() {
		setPosZ(-getPosY());
		setPosY(getPosZ());

		setOrZ(-getOrY());
		setOrY(getOrZ());
	}

	public Color getColorPuntero() {
		return this.color.get(0);
	}

	public boolean containsColor(Color color) {
		return this.color.contains(color);
	}
	
	public boolean estaEnCara(Pieza pieza){
		boolean res = false;
		if(pieza.getPosX().equals(this.getPosX())){
			res = true;
		}else if(pieza.getPosY().equals(this.getPosY())){
			res = true;
		}else if(pieza.getPosZ().equals(this.getPosZ())){
			res = true;
		}
		return res;
	}

	
}
