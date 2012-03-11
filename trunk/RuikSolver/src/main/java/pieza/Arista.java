package pieza;

public class Arista extends Pieza {

	public Arista(Vectr posicion, Stick stick, Stick stick2) {
		super();
		stickers = new Stick[2];
		stickers[0] = stick;
		stickers[1] = stick2;
	}
}
