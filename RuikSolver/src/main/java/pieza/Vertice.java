package pieza;

public class Vertice extends Pieza {

	public Vertice(Vectr posicion, Stick stick, Stick stick2, Stick stick3)  {
		super();
		stickers = new Stick[3];
		stickers[0] = stick;
		stickers[1] = stick2;
		stickers[2] = stick3;
	}
}
