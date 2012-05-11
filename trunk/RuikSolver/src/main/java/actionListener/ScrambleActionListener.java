package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cube.RubikCube;
import frame.VentanaPpal;

public class ScrambleActionListener implements ActionListener {
	RubikCube rubikCube;

	public ScrambleActionListener(RubikCube rubikCube) {
		this.rubikCube = rubikCube;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {

				rubikCube.scramble();
				VentanaPpal.buttonSolucionar.setEnabled(true);
				VentanaPpal.buttonOriginal.setEnabled(true);
				VentanaPpal.buttonSolucionarNext.setEnabled(true);
				VentanaPpal.buttonNotepad.setEnabled(true);
				VentanaPpal.buttonManual.setEnabled(true);
				VentanaPpal.buttonAleatorio.setEnabled(true);
			}

		});

		thread.start();
		VentanaPpal.buttonSolucionar.setEnabled(false);
		VentanaPpal.buttonOriginal.setEnabled(false);
		VentanaPpal.buttonSolucionarNext.setEnabled(false);
		VentanaPpal.buttonNotepad.setEnabled(false);
		VentanaPpal.buttonManual.setEnabled(false);
		VentanaPpal.buttonAleatorio.setEnabled(false);
	}
}
