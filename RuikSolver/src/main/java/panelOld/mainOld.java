package panelOld;

import javax.swing.JFrame;

import thread.OldThread;

public class mainOld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Rubikcube rubikcube = new Rubikcube();
		rubikcube.drawCube();
		rubikcube.setChessMode();
		
	//	rubikcube.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		OldThread oldThread = new OldThread(rubikcube);

		oldThread.start();

		// ClassicalMethodThread classicalMethodThread = new
		// ClassicalMethodThread();

		// classicalMethodThread.run(rubikcube.cubesarray,
		// rubikcube.cubesarrayB);

		while (!oldThread.getFin()) {
			rubikcube.drawCube();
		}
		//rubikcube.drawCube();
		rubikcube.setOriginalPosition();

		// rubikcube.setChessMode();

		// OldThread oldThread = new OldThread(rubikcube);

		// oldThread.start();

	}
}