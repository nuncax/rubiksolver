package pieza;

import color.Color;

public class Stick {
	private Color color;
	private final Vectr orientacion;

	public Stick(Color color, Vectr orientacion) {
		super();
		this.color = color;
		this.orientacion = orientacion;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Vectr getOrientacion() {
		return orientacion;
	}

	public boolean apunta(Pieza down_center) {
		return this.equals(orientacion);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result
				+ ((orientacion == null) ? 0 : orientacion.hashCode());
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
		Stick other = (Stick) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (orientacion == null) {
			if (other.orientacion != null)
				return false;
		} else if (!orientacion.equals(other.orientacion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[" + color + "," + orientacion + "]";
	}
	
}
