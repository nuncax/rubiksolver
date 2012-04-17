package thread;

import panelOld.Rubikcube;

public class OldThread extends Thread {
	boolean fin = false;
	Rubikcube rubikcube;

	public OldThread(Rubikcube rubikcube) {
		this.rubikcube = rubikcube;

	}

	public void run() {
		rubikcube.solveClassicalMethod();
		fin = true;
	}
	public boolean getFin(){
		return fin;
	}
}
