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

	public void multiplicaPorMatriz(int m[][]) {
		// int[] res = new int[3];
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < m.length; i++) {
			int a = 0;
			for (int j = 0; j < m.length; j++) {
				// vector[i]
				a += m[i][j] * this.vector.get(j);
			}
			res.add(a);
			
		}
		vector.clear();
		vector.addAll(res);
		// this.vector = res;
	}

	@Override
	public String toString() {
		return "[" + vector + "]";
	}

}
