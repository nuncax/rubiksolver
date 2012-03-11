package pieza;

public class Centro extends Pieza {

	public Centro(Vectr posicion, Stick stick) {
		super();
		stickers = new Stick[1];
		stickers[0] = stick;
	}

	public int[][] getMatriz(int signo) {
		int[][] maux = null;
		if (this.getStick().getColor().equals(Color.WHITE)) {
			maux = new int[][] { { 0, signo * 1, 0 }, { signo * -1, 0, 0 },
					{ 0, 0, 1 }, };
		} else if (this.getStick().getColor().equals(Color.YELLOW)) {
			maux = new int[][] { { 0, signo * -1, 0 }, { signo * 1, 0, 0 },
					{ 0, 0, 1 }, };
		} else if (this.getStick().getColor().equals(Color.BLUE)) {
			maux = new int[][] { { 0, 0, signo * -1 }, { 0, 1, 0 },
					{ signo * 1, 0, 0 }, };
		} else if (this.getStick().getColor().equals(Color.ORANGE)) {
			maux = new int[][] { { 1, 0, 0 }, { 0, 0, signo * -1 },
					{ 0, signo * 1, 0 }, };
		} else if (this.getStick().getColor().equals(Color.RED)) {
			maux = new int[][] { { 1, 0, 0 }, { 0, 0, signo * 1 },
					{ 0, signo * -1, 0 }, };
		} else if (this.getStick().getColor().equals(Color.GREEN)) {
			maux = new int[][] { { 0, 0, signo * 1 }, { 0, 1, 0 },
					{ signo * -1, 0, 0 }, };
		}
		return maux;
	}

	private Stick getStick() {
		return this.stickers[0];
	}

	public Color getColor() {
		return this.getStick().getColor();
	}
}