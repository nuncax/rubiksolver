package main;

import java.io.IOException;

import observer.AWTObserver;
import observer.IObserver;
import solutions.SolutionMethodTemba;
import thread.MiThread;
import cube.RubikCube;
import frame.VentanaPpal;

public class MainPrincipalDelTODO {

	static VentanaPpal ventanaPpal = new VentanaPpal();

	static MiThread thre = new MiThread(ventanaPpal);

	static RubikCube rubikCube = new RubikCube();

	static IObserver observer = new AWTObserver(thre.getmap());

	static boolean b = false;

	public static void re() {

		while (true) {
			try {
				Thread.sleep(0);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if (b) {
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

		}
	}

	public void setB(boolean b) {
		MainPrincipalDelTODO.b = b;
		
	}

	public static void main(String[] args) throws IOException {
		ventanaPpal.setVisible(true);

		re();
	}

}
