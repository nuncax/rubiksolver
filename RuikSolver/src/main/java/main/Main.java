package main;

import java.io.IOException;

import solutions.SolutionMethodTemba;
import cube.RubikCube;
import org.apache.log4j.PropertyConfigurator;


public class Main {
	public static void main(String[] args) throws IOException {
		PropertyConfigurator.configure("log4j.properties");
		org.apache.log4j.chainsaw.Main.main(args);
		
		RubikCube rubikCube = new RubikCube();
		rubikCube.SetPositions();
		SolutionMethodTemba temba = new SolutionMethodTemba(rubikCube);
		temba.solucionar();
	}
}
