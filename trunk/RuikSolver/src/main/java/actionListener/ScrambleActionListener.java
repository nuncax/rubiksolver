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
				VentanaPpal.setEnableAll(true);
			}

		});

		thread.start();
		VentanaPpal.setEnableAll(false);
	}
}
