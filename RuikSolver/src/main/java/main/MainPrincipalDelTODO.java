package main;

import java.io.IOException;

import observer.AWTObserver;
import observer.IObserver;
import solutions.SolutionMethodTemba;
import thread.MiThread;
import cube.RubikCube;

public class MainPrincipalDelTODO {

	/**
	 * @param args
	 */

	static MiThread thre = new MiThread();

	static RubikCube rubikCube = new RubikCube();

	static IObserver observer = new AWTObserver(thre.getmap());

	public static void main(String[] args) throws IOException {

		thre.start();

		rubikCube.addObservador(observer);

		rubikCube.setPositions();

		SolutionMethodTemba temba = new SolutionMethodTemba(rubikCube);
		temba.solucionar();
		thre.setRepaint(Boolean.FALSE);

	}

}
