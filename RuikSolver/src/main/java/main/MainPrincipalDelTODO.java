package main;

import java.io.IOException;

import observer.AWTObserver;
import observer.IObserver;
import solutions.SolutionMethodTemba;
import nuevoPanel.RubCruz;
import cube.RubikCube;
import frame.VentanaPpal;

public class MainPrincipalDelTODO {

	/**
	 * @param args
	 */

	static RubikCube rubikCube = new RubikCube();

	static VentanaPpal ventanaPpal = new VentanaPpal();

	static IObserver observer = new AWTObserver(ventanaPpal.getComp().getMap());

	public static void main(String[] args) throws IOException {

		rubikCube.addObservador(observer);

		rubikCube.setPositions();

		SolutionMethodTemba temba = new SolutionMethodTemba(rubikCube);
		temba.solucionar();

	}

}
