package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import solutions.SolutionMethodTemba;


public class SolucionarrActionListener implements ActionListener {
	SolutionMethodTemba temba;

	public SolucionarrActionListener(SolutionMethodTemba temba) {
		this.temba = temba;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				temba.solucionar();

			}

		});

		thread.start();

	}

}
