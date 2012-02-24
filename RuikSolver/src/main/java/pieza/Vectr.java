package pieza;

import java.util.Arrays;

public class Vectr {
	private int[] vector;
	final int X = 0;
	final int Y = 1;

	public int[] getVector() {
		return vector;
	}

	final int Z = 2;

	public Vectr(Integer x, Integer y, Integer z) {
		this.vector = new int[3];
		vector[X] = x;
		vector[Y] = y;
		vector[Z] = z;
	}

	public Vectr() {
		this.vector = new int[3];
	}

	public void multiplicaPorMatriz(int m[][]) {
		int[] res = new int[3];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				res[i] += m[i][j] * this.vector[j];
			}
		}
		this.vector = res;
	}

	@Override
	public String toString() {
		return "[" + Arrays.toString(vector) + "]";
	}

}
