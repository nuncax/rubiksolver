package main;

import java.io.IOException;

import pieza.Pieza;

import solutions.SolutionMethodTemba;
import cube.RubikCube;
//import org.apache.log4j.PropertyConfigurator;

public class Main {
	public static void main(String[] args) throws IOException {
		// org.apache.log4j.chainsaw.Main.main(args);
		// PropertyConfigurator.configure("log4j.properties");

		RubikCube rubikCube = new RubikCube();
		rubikCube.setPositions();
		
		for (Pieza	pieza: rubikCube.getPiezas()) {
			rubikCube.setFrontByPieza(pieza);
			pieza.esPar(rubikCube.front_center);			
		}

		
		//rubikCube.scramble();
		SolutionMethodTemba temba = new SolutionMethodTemba(rubikCube);
		temba.solucionar();
	}
}
