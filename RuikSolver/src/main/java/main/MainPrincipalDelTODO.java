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

	public static void main(String[] args) throws IOException {
		ventanaPpal.setVisible(true);

		re();
	}

}
