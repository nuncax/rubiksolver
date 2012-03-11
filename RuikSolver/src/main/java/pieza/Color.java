package pieza;

public class Color {

	private Vectr direccion;
	private String color;

	public Color(String color, int x, int y, int z) {
		this.direccion = new Vectr(x, y, z);
		this.color = color;
	}

	public static final Color WHITE = new Color("blanco", 0, 0, 1);
	public static final Color GREEN = new Color("verde", 0, -1, 0);
	public static final Color BLUE = new Color("azul", 0, 1, 0);
	public static final Color YELLOW = new Color("amarillo", 0, 0, -1);
	public static final Color RED = new Color("rojo", 1, 0, 0);
	public static final Color ORANGE = new Color("naranja", -1, 0, 0);

	public Vectr getDireccion() {
		return direccion;
	}

	@Override
	public String toString() {
		return "[" + color + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result
				+ ((direccion == null) ? 0 : direccion.hashCode());
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
		Color other = (Color) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		return true;
	}
	
	
}
