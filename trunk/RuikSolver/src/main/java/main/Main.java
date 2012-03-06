package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
		// rubikCube.scramble();

		List<Pieza> list = new ArrayList<Pieza>();
		list.add(rubikCube.back_center);
		// list.add(rubikCube.down_center);
		list.add(rubikCube.front_center);
		list.add(rubikCube.left_center);
		list.add(rubikCube.right_center);
		// list.add(rubikCube.up_center);

		for (Pieza pieza : rubikCube.getPiezas()) {
			// rubikCube.setFrontByPieza(pieza);
			for (Pieza p : list) {
				if (pieza.estaEnCara(p)) {
					pieza.esPar(p);
				}
			}
		}

		SolutionMethodTemba temba = new SolutionMethodTemba(rubikCube);
		temba.solucionar();
	}
}
