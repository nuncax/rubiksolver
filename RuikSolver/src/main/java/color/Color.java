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
	
	final int PRIME = 31;
	public int hashCode() {
		int result = 1;
		result = PRIME * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

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
		return true;
	}	

}