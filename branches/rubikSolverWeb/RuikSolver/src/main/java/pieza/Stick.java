package pieza;

public class Stick {
	private Color color;
	private final Vectr orientacion;

	public Stick(Color color, Vectr orientacion) {
		super();
		this.color = color;
		this.orientacion = new Vectr(orientacion.getX(), orientacion.getY(), orientacion.getZ());
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

	@Override
	public String toString() {
		return "Stick [" + color + "," + orientacion + "]";
	}
	
}
