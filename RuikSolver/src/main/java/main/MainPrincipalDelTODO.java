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

	


	public static void re() {
	
			
		//	SolutionMethodTemba temba = new SolutionMethodTemba(rubikCube);
			//temba.solucionar();

	}

	public static void main(String[] args) throws IOException {
		ventanaPpal.setVisible(true);

		thre.start();
		
		
		
	//	re();
	}

}
