package pieza;

public class Arista extends Pieza {

	public Arista(Stick stick, Stick stick2) {
		super();
		stickers = new Stick[2];
		stickers[0] = new Stick(stick.getColor(), stick.getOrientacion());
		stickers[1] = new Stick(stick2.getColor(), stick2.getOrientacion());
	}
}
