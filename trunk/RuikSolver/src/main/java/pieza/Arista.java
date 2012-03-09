package pieza;

public class Arista extends Pieza {

	public Arista(Vectr posicion, Stick stick, Stick stick2) {
		super(posicion);
		stickers[0] = stick;
		stickers[1] = stick2;
	}

	
}
