package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frame.VentanaPpal;
import solutions.SolutionMethodTemba;


public class SolucionarrActionListener implements ActionListener {
	SolutionMethodTemba temba;

	public SolucionarrActionListener(SolutionMethodTemba temba) {
		this.temba = temba;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		VentanaPpal.numGiros=0;
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				temba.solucionar();
			}

		});

		thread.start();
	}

}
