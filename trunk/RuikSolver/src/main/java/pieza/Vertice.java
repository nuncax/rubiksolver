package pieza;

public class Vertice extends Pieza {

	public Vertice(Stick stick, Stick stick2, Stick stick3)  {
		super();
		stickers = new Stick[3];
		stickers[0] = new Stick(stick.getColor(), stick.getOrientacion());
		stickers[1] = new Stick(stick2.getColor(), stick2.getOrientacion());
		stickers[2] = new Stick(stick3.getColor(), stick3.getOrientacion());
	}
}
