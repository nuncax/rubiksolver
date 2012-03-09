package pieza;

public class Centro extends Pieza {

	public Centro(Vectr posicion, Stick stick) {
		super(posicion);
		stickers = new Stick[1];
		stickers[0] = stick;
	}
}