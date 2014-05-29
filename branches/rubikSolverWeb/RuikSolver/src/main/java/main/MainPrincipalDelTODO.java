package main;

import java.io.IOException;
import thread.ThreadRepintaFrame;
import frame.VentanaPpal;

public class MainPrincipalDelTODO {

	static VentanaPpal ventanaPpal = new VentanaPpal();

	static ThreadRepintaFrame thre = new ThreadRepintaFrame(ventanaPpal);

	public static void main(String[] args) throws Exception {
		ventanaPpal.setVisible(true);

		thre.start();
	}

}
