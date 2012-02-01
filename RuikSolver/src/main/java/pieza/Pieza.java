package pieza;

import java.util.HashSet;
import java.util.Set;

import color.Color;


public class Pieza {
	private Vectr posicion;
	private Vectr orientacion;
	private Set<Color> color;

	public Pieza(Vectr posicion, Vectr orientacion, Set<Color> colors) {

		this.posicion = posicion;
		this.orientacion = orientacion;
		this.color = new HashSet<Color>();
		this.color.addAll(colors);
	}
	
	public Vectr getPosicion() {
		return posicion;
	}
	public void setPosicion(Vectr posicion) {
		this.posicion = posicion;
	}
	
	public void setOrientacion(Vectr orientacion) {
		this.orientacion = orientacion;
	}
	
	public Integer getPosX() {
		return posicion.getX();
	}
	public void setPosX(Integer x) {
		this.orientacion.setX(x);
	}
	
	public Integer getPosY() {
		return posicion.getY();
	}
	public void setPosY(Integer y) {
		this.orientacion.setY(y);
	}
	
	public Integer getPosZ() {
		return posicion.getZ();
	}
	public void setPosZ(Integer z) {
		this.orientacion.setZ(z);
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

	public Set<Color> getColor() {
		return color;
	}
	public void setColor(Set<Color> color) {
		this.color = color;
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

	


}
