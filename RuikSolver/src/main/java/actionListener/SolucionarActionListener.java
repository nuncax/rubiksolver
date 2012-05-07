package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frame.VentanaPpal;
import solutions.SolutionMethodTemba;

public class SolucionarActionListener implements ActionListener {
	SolutionMethodTemba temba;

	public SolucionarActionListener(SolutionMethodTemba temba) {
		this.temba = temba;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		VentanaPpal.numGiros = 0;
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {

				temba.solucionar();
				VentanaPpal.iniciado = false;
				VentanaPpal.buttonNext.setVisible(false);
				VentanaPpal.buttonAleatorio.setEnabled(true);
				VentanaPpal.buttonManual.setEnabled(true);
				VentanaPpal.buttonNotepad.setEnabled(true);
			}
		});

		thread.start();

		VentanaPpal.buttonSolucionar.setEnabled(false);
		VentanaPpal.buttonOriginal.setEnabled(false);
		VentanaPpal.buttonSolucionarNext.setEnabled(false);
		VentanaPpal.buttonNotepad.setEnabled(false);
		VentanaPpal.buttonManual.setEnabled(false);
		VentanaPpal.buttonAleatorio.setEnabled(false);

		// VentanaPpal.buttonAleatorio.setEnabled(true);
		// VentanaPpal.buttonManual.setEnabled(true);
		// VentanaPpal.buttonNotepad.setEnabled(true);

	}
}
