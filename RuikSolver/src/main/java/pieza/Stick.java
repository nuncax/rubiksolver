package pieza;

public class Stick {
	private Stick color;
	private final Vectr orientacion;

	public Stick(Stick color, Vectr orientacion) {
		super();
		this.color = color;
		this.orientacion = orientacion;
	}

	public Stick getColor() {
		return color;
	}

	public void setColor(Stick color) {
		this.color = color;
	}

	public Vectr getOrientacion() {
		return orientacion;
	}
}
