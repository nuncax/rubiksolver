package color;

public class Color {
	private String color;

	public Color(String col) {
		this.color = col;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String col) {
		this.color = col;
	}
	public void setColor(Color col) {
		this.color = col.toString();
	}

	public String toString() {
		return color;
	}

}