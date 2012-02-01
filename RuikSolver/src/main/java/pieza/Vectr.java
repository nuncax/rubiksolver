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
	
	public void setX(Integer cordE1) {
		this.vector.remove(0);
		this.vector.add(0, cordE1);
	}
	public void setY(Integer cordE2) {
		this.vector.remove(1);
		this.vector.add(1, cordE2);
	}
	public void setZ(Integer cordE3) {
		this.vector.remove(0);
		this.vector.add(2, cordE3);
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
		return "Vector [vector=" + vector + "]";
	}
	

}
