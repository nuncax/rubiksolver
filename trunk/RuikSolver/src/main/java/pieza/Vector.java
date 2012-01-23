package pieza;

public class Vector {
	private java.util.Vector<Integer> vector;

	public Vector(Integer e1, Integer e2, Integer e3) {
		this.vector = new java.util.Vector<Integer>();
		this.vector.add(e1);
		this.vector.add(e2);
		this.vector.add(e3);
	}

	public Vector() {
		this.vector = new java.util.Vector<Integer>();
	}
	
	public Vector(java.util.Vector<Integer> vector) {
		this.vector= new java.util.Vector<Integer>(vector);
	}

	public void setCords(Integer e1, Integer e2, Integer e3) {
		this.vector.clear();
		this.vector.add(e1);
		this.vector.add(e2);
		this.vector.add(e3);
	}

	@Override
	public String toString() {
		return "Vector [vector=" + vector + "]";
	}
	

}
