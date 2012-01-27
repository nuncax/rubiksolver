package pieza;

public class Vectr {
	private java.util.Vector<Integer> vector;

	public Vectr(Integer e1, Integer e2, Integer e3) {
		this.vector = new java.util.Vector<Integer>();
		this.vector.add(e1);
		this.vector.add(e2);
		this.vector.add(e3);
	}

	public Vectr() {
		this.vector = new java.util.Vector<Integer>();
	}
	
	public Vectr(java.util.Vector<Integer> vector) {
		this.vector= new java.util.Vector<Integer>(vector);
	}

	public void setCords(Integer e1, Integer e2, Integer e3) {
		this.vector.clear();
		this.vector.add(e1);
		this.vector.add(e2);
		this.vector.add(e3);
	}
	
	public Integer getE1(){
		return this.vector.get(0);
	}
	public Integer getE2(){
		return this.vector.get(1);
	}
	public Integer getE3(){
		return this.vector.get(2);
	}

	@Override
	public String toString() {
		return "Vector [vector=" + vector + "]";
	}
	

}
