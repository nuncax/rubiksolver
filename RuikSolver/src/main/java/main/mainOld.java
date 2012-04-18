package main;

import rubikcubeOld.Rubikcube;

import thread.OldThread;

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
		}
		//rubikcube.setSolvedPosition();
		//rubikcube.drawCube();
	}
}