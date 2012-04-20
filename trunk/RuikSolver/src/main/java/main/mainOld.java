package main;

import rubikcubeOld.Rubikcube;

import thread.OldThread;
import utiles.Utiles;

public class mainOld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Rubikcube rubikcube = new Rubikcube();
		rubikcube.drawCube();
		rubikcube.setChessMode();

		OldThread oldThread = new OldThread(rubikcube);

		oldThread.start();

		while (!oldThread.getFin()) {
			rubikcube.drawCube();
			Utiles.slep(0);
		}
		//rubikcube.setSolvedPosition();
		//rubikcube.drawCube();
	}
}