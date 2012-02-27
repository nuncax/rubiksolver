package pieza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vectr {
	private List<Integer> vector;
	final int X = 0;
	final int Y = 1;

	public List<Integer> getVector() {
		// TODO
		return vector;
	}

	final int Z = 2;

	public Vectr(Integer x, Integer y, Integer z) {
		this.vector = new ArrayList<Integer>();
		vector.add(X, x);
		vector.add(Y, y);
		vector.add(Z, z);
		;
	}

	public Vectr() {
		this.vector = new ArrayList<Integer>();
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
		if (vector == null) {
			if (other.vector != null)
				return false;
		} else if (!vector.equals(other.vector))
			return false;
		return true;
	}

	public void multiplicaPorMatriz(int m[][]) {
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < m.length; i++) {
			int a = 0;
			for (int j = 0; j < m.length; j++) {
				a += m[i][j] * this.vector.get(j);
			}
			res.add(a);

		}
		vector.clear();
		vector.addAll(res);
	}

	public String toString() {
		return vector.toString();
	}

}
