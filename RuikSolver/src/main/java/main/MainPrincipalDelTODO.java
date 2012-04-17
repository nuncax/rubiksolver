package main;

import java.io.IOException;

import observer.AWTObserver;
import observer.IObserver;
import solutions.SolutionMethodTemba;
import thread.MiThread;
import nuevoPanel.RubCruz;
import cube.RubikCube;
import frame.VentanaPpal;

public class MainPrincipalDelTODO {

	/**
	 * @param args
	 */

	static MiThread thread = new MiThread();

	static RubikCube rubikCube = new RubikCube();

	// static VentanaPpal ventanaPpal = new VentanaPpal();

	static IObserver observer = new AWTObserver(thread.getmap());

	public static void main(String[] args) throws IOException {

		thread.start();

		rubikCube.addObservador(observer);

		rubikCube.setPositions();

		SolutionMethodTemba temba = new SolutionMethodTemba(rubikCube);
		temba.solucionar();

	}

}
