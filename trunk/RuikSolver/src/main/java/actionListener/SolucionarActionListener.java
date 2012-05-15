package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frame.VentanaPpal;
import solution.SolutionMethodTemba;

public class SolucionarActionListener implements ActionListener {
	SolutionMethodTemba temba;
	public static Thread thread;

	public SolucionarActionListener(SolutionMethodTemba temba) {
		this.temba = temba;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		VentanaPpal.numGiros = 0;
		thread = new Thread(new Runnable() {

			@Override
			public void run() {

				temba.solucionar();
				VentanaPpal.iniciado = false;
				VentanaPpal.setVisiblePasoAPaso(false);		
				VentanaPpal.setEnableCargar(true);
			}
		});

		thread.start();

		VentanaPpal.setEnableAll(false);

		// VentanaPpal.buttonAleatorio.setEnabled(true);
		// VentanaPpal.buttonManual.setEnabled(true);
		// VentanaPpal.buttonNotepad.setEnabled(true);

	}
}