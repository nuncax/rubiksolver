package pieza;

public class Vectr {
	private java.util.Vector<Integer> vector;

	public Vectr(Integer x, Integer y, Integer Z) {
		this.vector = new java.util.Vector<Integer>();
		this.vector.add(x);
		this.vector.add(y);
		this.vector.add(Z);
	}

	public Vectr() {
		this.vector = new java.util.Vector<Integer>();
	}
	
	public Vectr(java.util.Vector<Integer> vector) {
		this.vector= new java.util.Vector<Integer>(vector);
	}

	public void setCords(Integer x, Integer y, Integer z) {
		this.vector.clear();
		this.vector.add(x);
		this.vector.add(y);
		this.vector.add(z);
	}
	
	public void setX(Integer x) {
		this.vector.set(0, x);
	}
	public void setY(Integer y) {
		this.vector.set(1, y);
	}
	public void setZ(Integer z) {
		this.vector.set(2, z);
	}
	
	public Integer getX(){
		return this.vector.get(0);
	}
	public Integer getY(){
		return this.vector.get(1);
	}
	public Integer getZ(){
		return this.vector.get(2);
	}

	@Override
	public String toString() {
		return vector.toString();
	}
	

}
