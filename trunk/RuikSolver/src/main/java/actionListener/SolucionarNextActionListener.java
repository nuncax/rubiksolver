package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frame.VentanaPpal;
import solution.SolutionMethodTemba;

public class SolucionarNextActionListener implements ActionListener {
	SolutionMethodTemba temba;

	public SolucionarNextActionListener(SolutionMethodTemba temba) {
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
				VentanaPpal.buttonPasoApaso.setVisible(false);

				VentanaPpal.buttonAleatorio.setEnabled(true);
				VentanaPpal.buttonCargaManual.setEnabled(true);
				VentanaPpal.buttonNotepad.setEnabled(true);
			}
		});
		
			thread.start();

		
			VentanaPpal.buttonOriginal.setEnabled(false);
			VentanaPpal.buttonSolucionarPasoApaso.setEnabled(false);

		
		// VentanaPpal.buttonAleatorio.setEnabled(true);
		// VentanaPpal.buttonManual.setEnabled(true);
		// VentanaPpal.buttonNotepad.setEnabled(true);

	}
}
