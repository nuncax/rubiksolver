package thread;

import java.io.IOException;

import main.MainPrincipalDelTODO;
import observer.AWTObserver;
import observer.IObserver;
import cube.RubikCube;
import frame.VentanaPpal;
import solutions.SolutionMethodTemba;

public class OldThread extends Thread {
	static VentanaPpal ventanaPpal = new VentanaPpal();

	static MiThread thre = new MiThread(ventanaPpal);

	static RubikCube rubikCube = new RubikCube();

	static IObserver observer = new AWTObserver(thre.getmap());

	public static void re() {
		thre.start();

		rubikCube.addObservador(observer);

		try {
			rubikCube.setPositions();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SolutionMethodTemba temba = new SolutionMethodTemba(rubikCube);
		temba.solucionar();
		thre.setRepaint(Boolean.FALSE);
	}

	public void run() {
		MainPrincipalDelTODO.re();
	}
}
