package panelOld;

import thread.OldThread;

public class mainOld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rubikcube rubikcube = new Rubikcube();
		rubikcube.setChessMode();
		rubikcube.setChangedCentersMode();
		
		OldThread oldThread = new OldThread(rubikcube.cubesarray, rubikcube.drawingpanel);
		
		oldThread.start();
		
		rubikcube.drawCube();
		
		rubikcube.solveClassicalMethod();
		
		
	}
}