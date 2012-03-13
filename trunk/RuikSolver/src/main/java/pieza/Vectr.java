package pieza;

import java.util.Arrays;

public class Vectr {
	private Integer vector[];
	final static private int X = 0;
	final static private int Y = 1;
	final static private int Z = 2;

	public Vectr(Integer x, Integer y, Integer z) {
		this.vector = new Integer[3];
		vector[X] = x;
		vector[Y] = y;
		vector[Z] = z;
	}

	public void multiplicaPorMatriz(int m[][]) {
		Integer res[] = new Integer[3];
		res[0]=0;
		res[1]=0;
		res[2]=0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				res[i] += m[i][j] * this.vector[j];
			}
		}
		this.vector=res;
	}

	public void sumarVector(Vectr vectorSuma) {
		for (int i = 0; i < this.vector.length; i++) {
			this.vector[i] += vectorSuma.vector[i];
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(vector);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(vector);
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
		Vectr other = (Vectr) obj;
		if (!Arrays.equals(vector, other.vector))
			return false;
		return true;
	}

	public Integer getX() {
		return this.vector[X];
	}
	public Integer getY() {
		return this.vector[Y];
	}
	public Integer getZ() {
		return this.vector[Z];
	}

}
