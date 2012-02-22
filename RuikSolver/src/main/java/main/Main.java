package main;

import java.io.IOException;

import solutions.SolutionMethodTemba;
import cube.RubikCube;
import org.apache.log4j.PropertyConfigurator;

public class Main {
	public static void main(String[] args) throws IOException {
		// org.apache.log4j.chainsaw.Main.main(args);
		// PropertyConfigurator.configure("log4j.properties");

		RubikCube rubikCube = new RubikCube();
		rubikCube.SetPositions();
		SolutionMethodTemba temba = new SolutionMethodTemba(rubikCube);
		temba.solucionar();
	}
}
