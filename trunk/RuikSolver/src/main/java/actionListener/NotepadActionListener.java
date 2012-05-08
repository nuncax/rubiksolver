package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cube.RubikCube;
import frame.VentanaPpal;

public class NotepadActionListener implements ActionListener {
	RubikCube rubikCube;
	String str;

	public NotepadActionListener(RubikCube rubikCube, String str) {
		this.rubikCube = rubikCube;
		this.str = str;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		VentanaPpal.numGiros = 0;
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {

				VentanaPpal.buttonSolucionar.setEnabled(true);
				VentanaPpal.buttonOriginal.setEnabled(true);
				VentanaPpal.buttonSolucionarNext.setEnabled(true);
				rubikCube.setPositions(str);
				// VentanaPpal.buttonAleatorio.setEnabled(true);
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