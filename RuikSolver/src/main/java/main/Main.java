package main;

import java.io.IOException;
import panel.Interfaz;
import solutions.SolutionMethodTemba;
import cube.RubikCube;

//import org.apache.log4j.PropertyConfigurator;

public class Main {
	public static void main(String[] args) throws IOException {
		// org.apache.log4j.chainsaw.Main.main(args);
		// PropertyConfigurator.configure("log4j.properties");

		Interfaz interfaz = new Interfaz();
		interfaz.openPositionWorkstation();
		
	//	rubikcube.Rubikcube r = new Rubikcube();
		//r.openPositionWorkstation();

		RubikCube rubikCube = new RubikCube();
		rubikCube.setPositions();
	//	rubikCube.scramble();

		SolutionMethodTemba temba = new SolutionMethodTemba(rubikCube);
		temba.solucionar();
	}
}
